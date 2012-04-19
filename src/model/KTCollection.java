package model;

import java.io.Serializable;
import java.util.ArrayList;

import config.Constants;


import parallel.KTRunnerFactory;
import parallel.KTRunnerType;
import parallel.MassRunner;

import verbose.Timer;

public class KTCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ArrayList<KTHashMap> KTList = new ArrayList<KTHashMap>();
	protected KTHashMap[] models;
	
	protected transient double step = Constants.STEP;
	protected transient int nthreads = Constants.NUM_THREADS;
	
	
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
		initialize();
	} // end of constructor
	
	
	public KTCollection(boolean init){
		if(init){
			initialize();
		}
	}
	
	
	/**
	 * make all the required kt models
	 */
	public void initialize(){
		Timer.in(this, "[KTCollection] Attempting to create " + this.getArraySize() + " models.");
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		
		int index = 0;
		
		this.models = new KTHashMap[this.getArraySize()];
		
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						this.models[index] = new KTHashMap(initial, learn, guess, slip);
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
		Timer.in(this, "[KTCollection] Attempting to accumulate weights in parallel over " + observations.length + " observations.");
		
		KTRunnerFactory weightFactory = new KTRunnerFactory(KTRunnerType.WeightAcquirer);
		MassRunner runner = new MassRunner(this.models, observations);
		
		runner.run(weightFactory);
		
		Timer.out(this, "[KTCollection] Successfully accumulated weights in ");
	} // end of method accumulateWeights
	
	
	
	
	/**
	 * 
	 * @return the probability that the next observed value is a 1
	 */
	public double unweightedPredict(Response r){
		double prediction = 0;
		
		for(KTHashMap model: this.models){
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

		Timer.in(this, "[KTCollection] Attempting unweighted predictions on " + r.length + " responses");
		
		double[] predictions = new double[r.length];
		
		for(int i = 0; i < predictions.length; i++){
			double p = 0;
			
			for(KTHashMap model: this.models){
				p += model.predict(r[i]);
			}
			
			p /= this.models.length;
			predictions[i] = p;
		}
		
		
		Timer.out(this, "[KTCollection] Completing unweighted predictions on " + r.length + " responses in ");
		
		return predictions;
	}
	
	
	
	
	/**
	 * Take the weighted mean of the predictions, assuming that
	 * more likely models are worth more.
	 * note: assumes you've already run accumulateWeights
	 * @param r
	 * @return the probability the next response is 1
	 */
	public double weightedPredict(Response r){
		double prediction = 0;
		double weight = 0;
		for(KTHashMap model: this.models){
			prediction += model.predict(r);
			weight += model.weight;
		}
		
		prediction /= weight;
		return prediction;
	} // end of weightedPredict

	
	public double[] weightedPredict(Response[] r){
		
		Timer.in(this, "[KTCollection] Attempting weighted predictions on " + r.length + " responses");
		
		double[] predictions = new double[r.length];
		
		for(int i = 0; i < predictions.length; i++){
			double weight = 0;
			double p = 0;
			for(KTHashMap model: this.models){
				p += model.predict(r[i]);
				weight += model.getWeight();
			}
			
			predictions[i] = p / weight;
		}
		
		Timer.out(this, "[KTCollection] Completing weighted predictions on " + r.length + " responses in ");
		
		return predictions;
	}
	
	
	
	public void initializeModelsParallel(Response[] allDomain){
		Timer.in(this, "[KTCollection] Attempting to initialize models in parallel over  " + allDomain.length + " responses.");
		
		KTRunnerFactory initializerFactory = new KTRunnerFactory(KTRunnerType.TableInitializer);
		MassRunner runner = new MassRunner(models, allDomain);
		
		runner.run(initializerFactory);
		
		Timer.out(this, "[KTCollection] Successfully initialized models in parallel in ");
	}
	
} // end of class KTCollection
