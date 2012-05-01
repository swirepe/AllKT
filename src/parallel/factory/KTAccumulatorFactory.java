package parallel.factory;

import java.util.concurrent.Semaphore;

import parallel.KTAccumulator;
import parallel.KTRunner;
import parallel.Predictor;
import parallel.WeightedPredictor;
import parallel.storage.Depot;
import parallel.storage.PredictionDepot;

import config.Constants;

import model.KT;
import model.Response;

public class KTAccumulatorFactory implements KTRunnerFactoryInterface {

	public KTAccumulatorType type;
	public Semaphore sem = null;
	public Depot depositor;
	
	public KTAccumulatorFactory(KTAccumulatorType type){
		this.type = type;
	}
	
	public KTAccumulatorFactory(KTAccumulatorType type, Semaphore sem){
		this.type = type;
		this.sem = sem;
	}
	
	
	public KTAccumulatorFactory(KTAccumulatorType type, Semaphore sem, Depot depositor){
		this.type = type;
		this.sem = sem;
		this.depositor = depositor;
	}
	

	
	public KTAccumulator getInstance(KT model, Response[] obs, Semaphore sem, Depot depositor){
		lazyInit(depositor);
		
		switch(this.type){
			case Predictor:
				return new Predictor(model, obs, sem, (PredictionDepot) depositor);
			case WeightedPredictor:
				return new WeightedPredictor(model, obs, sem, depositor);
		}
		return null;
	}

	
	@Override
	public KTRunner getInstance(KT model, Response[] obs) {
		lazyInit();
		return getInstance(model, obs, this.sem, this.depositor);
	}
	
	
	public void setDepot(Depot depositor){
		this.depositor = depositor;
	}
	

	public void setSemaphore(Semaphore sem){
		this.sem = sem;
	}
	
	
	protected void lazyInit(){
		lazyInit(new PredictionDepot());
	}
	
	
	protected void lazyInit(Depot depositor){
		if(this.sem == null){
			sem = new Semaphore(Constants.NUM_THREADS);
		}
		
		if(this.depositor == null){
			this.depositor = depositor;
		}
	}
	
} // end of KTAccumulatorFactory
