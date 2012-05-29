package model.collection;

import config.Constants;
import verbose.Timer;
import model.KTStorageless;
import model.Response;

/**
 * For things with many models, you run the risk of having upwards of 2gb 
 * reserved just for one floating point number each.
 * A hollow stores only the total weight accumulated
 * @author swirepe
 *
 */
public class HollowKTCollection extends KTCollection{
	private static final long serialVersionUID = 1L;

	public double weight = 0.0;
	
	public HollowKTCollection() {
		
		
	}
	
	@Override
	/**
	 * Do nothing, we aren't storing any values
	 */
	public void initialize(){
		Timer.in(this, "[HollowKTCollection] Attempting to create " + this.getArraySize() + " models.");
		this.initialized = true;
		this.models = null;
		Timer.out(this, "[HollowKTCollection] Successfully created " + this.models.length + " models in ");
	}
	
	@Override
	public void train(Response[] observations){
		Timer.in(this, "[HollowKTCollection] Attempting to accumulate weights over " + observations.length + " observations.");
		// TODO: this also could be parallelized
	
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		KTStorageless m = new KTStorageless(0,0,0,0);
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						m.setParameters(initial, learn, guess, slip);
						this.weight += 1;
						// get the forward probability for each response
						
						for(Response r: observations){
							weight += m.performanceProbability(r);
						}
					}
				}
			}
		}
		Timer.out(this, "[HollowKTCollection] Successfully accumulated weights in ");
	} // end of method train
	
	
	
	@Override
	public double unweightedPredict(Response r){
		double prediction = 0.0;
		int i = 0;
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		KTStorageless m = new KTStorageless(0,0,0,0);
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						m.setParameters(initial, learn, guess, slip);
						prediction += m.predict(r);
						i += 1;
					}
				}
			}
		}
		
		prediction /= i;
		return prediction;
	}
	
	
	@Override
	public double[] unweightedPredict(Response[] r){
		Timer.in(this, "[HollowKTCollection] Attempting unweighted predictions on " + r.length + " responses");
		double[] predictions = new double[r.length];
		for(int i = 0; i < r.length; i++){
			predictions[i] = unweightedPredict(r[i]);
		}
		Timer.out(this, "[HollowKTCollection] Completing unweighted predictions on " + r.length + " responses in ");
		return predictions;
	} // end of method unweighted predict
	
	
	@Override
	public double[] unweightedPredictParallel(Response[] r){
		// TODO: implement/parallelize
		if(Constants.VERBOSE){
			System.out.println("[HollowKTCollection] Warning: Parallelism not yet supported in this class.");
		}
		return unweightedPredict(r);
	}
	
	
	@Override
	public double[] weightedPredict(Response[] r){
		Timer.in(this, "[HollowKTCollection] Attempting weighted predictions on " + r.length + " responses");
		double[] predictions = new double[r.length];
		
		int numModels = this.getArraySize();
		double totalWeight = this.weight;
		if(weight == 0){
			totalWeight = numModels; 
		}
		
		for(int i = 0; i < r.length; i++){
			double p = unweightedPredict(r[i]);
			p *= numModels; // to undo the unweighted prediction
			p /= totalWeight; // to weight the prediction
			predictions[i] = p;
		}
		
		Timer.out(this, "[HollowKTCollection] Completing weighted predictions on " + r.length + " responses in ");
		return predictions;
	}
	
	
	@Override
	public double[] weightedPredictParallel(Response[] r){
		// TODO: implement/parallelize
		if(Constants.VERBOSE){
			System.out.println("[HollowKTCollection] Warning: Parallelism not yet supported in this class.");
		}
		return weightedPredict(r);
	}
	
	
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("index,initial,learn,guess,slip\n");
		int i = 0;
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						sb.append("" + i + initial + "," + learn + "," + guess + "," + slip + "\n");
						i += 1;
					}
				}
			}
		}
		return sb.toString();
	} // end of method toString
	
	
} // end of class HollowKTCollection
