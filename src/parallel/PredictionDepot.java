package parallel;

import java.util.concurrent.Semaphore;

public class PredictionDepot implements Depot {

	protected double[] predictions;
	protected double weight;
	protected Semaphore depoSem;
	
	public PredictionDepot(){
	
	}
	
	public PredictionDepot(PredictionDepot[] toMerge){
		this.predictions = new double[toMerge[0].length()];
		this.weight = 0.0;
		this.depoSem = new Semaphore(1);
		for(PredictionDepot other: toMerge){
			addToSelf(other);
		}
	}
	
	
	public PredictionDepot(int numPredictions){
		this.predictions = new double[numPredictions];
		this.weight = 0.0;
		this.depoSem = new Semaphore(1);
	}


	public void addToSelf(PredictionDepot other){
		addDoubles(other.predictions);
		addWeight(other.weight);
	}
	
	
	public void addPrediction(double[] others){
		lazyInit(others.length);
		addDoubles(others);
	}
	
	
	public void addDoubles(double[] others) {
		for(int i = 0; i < others.length; i++){
			this.predictions[i] += others[i];
		}
	}

	
	public void addWeight(double weight){
		this.weight += weight;
	}
	
	
	public double[] getPredictions(){
		if(this.predictions == null){
			return null;
		}
		
		double[] result = new double[predictions.length];
		System.arraycopy(predictions, 0, result, 0, predictions.length);
		
		if(weight == 0){
			return result;
		}
		
		// normalize it
		for(int i = 0; i < result.length; i++){
			result[i] /= weight;
		}
		
		return result;
	}
	
	protected void lazyInit(int n){
		if(this.predictions == null){
			this.predictions = new double[n];
		}
	}
	
	public int length(){
		return this.predictions.length;
	}
	
	
	@Override
	public synchronized boolean tryAcquire(){
		return this.depoSem.tryAcquire();
	}
	
	@Override
	public synchronized void release(){
		this.depoSem.release();
	}
	
	
} // end of class 
