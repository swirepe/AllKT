package model;

import java.io.Serializable;
import java.util.ArrayList;

import parallel.KTRunner;
import parallel.KTRunnerFactory;
import parallel.KTRunnerType;
import parallel.MassRunner;

public class KTCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ArrayList<KT> KTList = new ArrayList<KT>();
	protected KT[] models;
	
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
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						this.KTList.add(new KT(initial, learn, guess, slip));
					}
				}
			}
		}
		
		convertToArray();
	} // end of constructor
	
	
	protected void convertToArray(){
		this.models = new KT[this.KTList.size()];
		
		for(int i = 0; i < models.length; i += 1){
			this.models[i] = this.KTList.get(i);
		}
		
		this.KTList = null;
		System.gc();
	} // end of convertToArray
	
	
	/**
	 * Parallel: find the relative likelihoods for each model
	 * @param observations
	 */
	public void accumulateWeights(Response[] observations){
		
		KTRunnerFactory weightFactory = new KTRunnerFactory(KTRunnerType.WeightAcquirer);
		MassRunner runner = new MassRunner(this.models, observations);
		
		runner.run(weightFactory);
		
	} // end of method accumulateWeights
	
	
	
	
	/**
	 * 
	 * @return the probability that the next observed value is a 1
	 */
	public double unweightedPredict(Response r){
		// TODO: implement
		double prediction = 0;
		
		for(KT model: this.models){
			prediction += model.predict(r);
		}
		
		prediction /= this.models.length;
		
		return prediction;
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
		for(KT model: this.models){
			prediction += model.predict(r);
			weight += model.weight;
		}
		
		prediction /= weight;
		return prediction;
	} // end of weightedPredict

} // end of class KTCollection
