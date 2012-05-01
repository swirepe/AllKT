package parallel;

import java.util.concurrent.Semaphore;

import parallel.storage.PredictionDepot;
 // todo: how do we get the predictions out of here?
import model.KT;
import model.Response;

public class Predictor extends KTAccumulator {

	double[] myPredictions;
	double myWeight = 1.0;
	
	public Predictor(KT model, Response[] obs, Semaphore sem, PredictionDepot depositor) {
		super(model, obs, sem, depositor);

	} // end of constructor
	
	

	
	public void takeAction(){
		myPredictions = new double[obs.length];
		for(int i = 0; i < myPredictions.length; i++){
			myPredictions[i] = this.model.predict(this.obs[i]);
		}
	}


	@Override
	public void deposit() {
		while(!this.depositor.tryAcquire()){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		((PredictionDepot) this.depositor).addPrediction(myPredictions);
		((PredictionDepot) this.depositor).addWeight(myWeight);
		this.depositor.release();
		
	}
	
	
	
} // end of class Predictor
