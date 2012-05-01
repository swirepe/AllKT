package model;

import java.io.Serializable;

import config.Constants;


import parallel.KTAccumulatorFactory;
import parallel.KTAccumulatorType;
import parallel.KTRunnerFactory;
import parallel.KTRunnerType;
import parallel.MassAccumulator;
import parallel.MassRunner;
import parallel.PredictionDepot;

import verbose.Timer;

public class KTCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected KT[] models;
	protected KTFactory ktfactory = null;
	
	protected transient double step = Constants.STEP;
	protected transient int nthreads = Constants.NUM_THREADS;
	
	protected boolean initialized = false;
	
	/**
	 * The set of reasonable models:
	 * 	two decimal place precision
	 *	initial in (0, 1)
	 * 	learn in (0, 0.5)
	 *	guess in [0, 0.5]
	 *	slip in [0, 0.5]
	 *	slip >= guess  (or guess < slip
	 */
	public KTCollection(){	
		/* empty default constructor */
	} // end of constructor
	
	
	public KTCollection(KTFactory ktfactory, boolean init){
		this.ktfactory = ktfactory;
		if(init){
			initialize();
		}
	}
	
	
	
	public KTCollection(KT[] models){
		this.initialized = true;
		
		this.models = new KT[models.length];
		
		System.arraycopy(models, 0, this.models, 0, models.length);
	}
	
	/**
	 * make all the required kt models
	 */
	public void initialize(){
		Timer.in(this, "[KTCollection] Attempting to create " + this.getArraySize() + " models.");
		this.initialized = true;
		
		if(this.ktfactory == null){
			ktfactory = new KTFactory(); // default type
		}
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		
		int index = 0;
		
		this.models = new KT[this.getArraySize()];
		
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						this.models[index] = this.ktfactory.getInstance(initial, learn, guess, slip);
						index += 1;
					}
				}
			}
		}
		
		Timer.out(this, "[KTCollection] Successfully created " + this.models.length + " models in ");
	} // end of method initialize
	
	
	
	
	/**
	 * Figure out how big to make the kt array, instead of stuffing them in arraylists
	 * 
	 * There's a formula for this, but I am literally going crazy.
	 * Better to be dumb and do it this way
	 * @return
	 */
	protected int getArraySize(){
		int i = 0;
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						i += 1;
					}
				}
			}
		}
		return i;
	} // end of getArraySize
	
	
	/**
	 * Parallel: find the relative likelihoods for each model
	 * @param observations
	 */
	public void accumulateWeightsParallel(Response[] observations){
		this.lazyInit();
		Timer.in(this, "[KTCollection] Attempting to accumulate weights in parallel over " + observations.length + " observations.");
		
		KTRunnerFactory weightFactory = new KTRunnerFactory(KTRunnerType.WeightAcquirer);
		MassRunner runner = new MassRunner(this.models, observations);
		
		runner.run(weightFactory);
		
		Timer.out(this, "[KTCollection] Successfully accumulated weights in ");
	} // end of method accumulateWeights
	
	
	public void train(Response[] observations){
		accumulateWeightsParallel(observations);
	}
	
	
	/**
	 * 
	 * @return the probability that the next observed value is a 1
	 */
	public double unweightedPredict(Response r){
		this.lazyInit();
		double prediction = 0;
		
		for(KT model: this.models){
			prediction += model.predict(r);
		}
		
		prediction /= this.models.length;
		
		return prediction;
	}
	
	
	/**
	 * Make predictions for multiple  responses
	 * @param r
	 * @return the prediction for each response, in a 1-1 mapped array
	 */
	public double[] unweightedPredict(Response[] r){
		this.lazyInit();
		Timer.in(this, "[KTCollection] Attempting unweighted predictions on " + r.length + " responses");
		
		double[] predictions = new double[r.length];
		
		for(int i = 0; i < predictions.length; i++){
			double p = 0;
			
			for(KT model: this.models){
				p += model.predict(r[i]);
			}
			
			p /= this.models.length;
			predictions[i] = p;
		}
		
		
		Timer.out(this, "[KTCollection] Completing unweighted predictions on " + r.length + " responses in ");
		
		return predictions;
	}
	
	
	public double[] unweightedPredictParallel(Response[] r){
		return unweightedPredictParallelDepot(r, new PredictionDepot(r.length)).getPredictions();
	}
	
	
	public PredictionDepot unweightedPredictParallelDepot(Response[] r){
		return unweightedPredictParallelDepot(r, new PredictionDepot(r.length));
	}
	
	
	public PredictionDepot unweightedPredictParallelDepot(Response[] r, PredictionDepot pd){
		this.lazyInit();
		KTAccumulatorFactory ktaccf = new KTAccumulatorFactory(KTAccumulatorType.Predictor);
		
		MassAccumulator ma = new MassAccumulator(this.models, r, pd);
		ma.run(ktaccf);
		
		return pd;
	}
	
	
	public double[] weightedPredictParallel(Response[] r){
		return weightedPredictParallelDepot(r).getPredictions();
	}
	
	public PredictionDepot weightedPredictParallelDepot(Response[] r){
		return weightedPredictParallelDepot(r, new PredictionDepot());
	}
	
	
	public PredictionDepot weightedPredictParallelDepot(Response[] r, PredictionDepot pd){
		this.lazyInit();
		KTAccumulatorFactory ktaccf = new KTAccumulatorFactory(KTAccumulatorType.WeightedPredictor);
		
		MassAccumulator ma = new MassAccumulator(this.models, r, pd);
		ma.run(ktaccf);
		
		return pd;
	}
	
	/**
	 * Take the weighted mean of the predictions, assuming that
	 * more likely models are worth more.
	 * note: assumes you've already run accumulateWeights
	 * @param r
	 * @return the probability the next response is 1
	 */
	public double weightedPredict(Response r){
		this.lazyInit();
		double prediction = 0;
		double weight = 0;
		for(KT model: this.models){
			prediction += model.predict(r);
			weight += model.weight;
		}
		
		prediction /= weight;
		return prediction;
	} // end of weightedPredict

	
	public double[] weightedPredict(Response[] r){
		this.lazyInit();
		Timer.in(this, "[KTCollection] Attempting weighted predictions on " + r.length + " responses");
		
		double[] predictions = new double[r.length];
		
		for(int i = 0; i < predictions.length; i++){
			double weight = 0;
			double p = 0;
			for(KT model: this.models){
				p += model.predict(r[i]);
				weight += model.getWeight();
			}
			
			predictions[i] = p / weight;
		}
		
		Timer.out(this, "[KTCollection] Completing weighted predictions on " + r.length + " responses in ");
		
		return predictions;
	}
	
	
	
	public void initializeModelsParallel(Response[] allDomain){
		this.lazyInit();
		Timer.in(this, "[KTCollection] Attempting to initialize models in parallel over  " + allDomain.length + " responses.");
		
		KTRunnerFactory initializerFactory = new KTRunnerFactory(KTRunnerType.TableInitializer);
		MassRunner runner = new MassRunner(models, allDomain);
		
		runner.run(initializerFactory);
		
		Timer.out(this, "[KTCollection] Successfully initialized models in parallel in ");
	}
	
	
	public double getTotalWeight(){
		lazyInit(); // better than a null pointer exception
		
		double result = 0.0;
		for(KT model: this.models){
			result += model.weight;
		}
		return result;
	}
	
	
	/**
	 * We don't want to make the actual kt models until we call something that needs them
	 */
	protected void lazyInit(){
		if(!this.initialized){
			this.initialize();
		}
	}
	
	public void setFactory(KTFactory ktfact){
		this.ktfactory = ktfact;
	} // 
	
	@Override
	public String toString(){
		lazyInit();
		StringBuffer sb = new StringBuffer();
		
		for(KT model: this.models){
			sb.append(model.toString());
		}
		return sb.toString();
	} // end of method toString
	
	
} // end of class KTCollection
