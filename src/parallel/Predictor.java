package parallel;

import java.util.concurrent.Semaphore;
 // todo: how do we get the predictions out of here?
import model.KT;
import model.Response;

public class Predictor extends KTRunner {

	public static double[] predictions = null;
	protected double[] myPredictions;
	public static Semaphore additionSemaphore = new Semaphore(1);
	
	public Predictor(KT model, Response[] obs, Semaphore sem) {
		super(model, obs, sem);

		myPredictions = new double[obs.length];
		initPredictions(obs.length);
	} // end of constructor
	
	
	public static void initPredictions(int length){
		if(predictions == null){
			predictions = new double[length];
		}
	} // end of static init method

	
	public void addMyPredictions(){
		try {
			additionSemaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i = 0; i < myPredictions.length; i++){
			predictions[i] += myPredictions[i];
		}
		
		
		additionSemaphore.release();
	}

	
	protected void takeAction(){
		for(int i = 0; i < myPredictions.length; i++){
			myPredictions[i] = this.model.predict(this.obs[i]);
		}
		addMyPredictions();
	}
	
	
	
} // end of class Predictor
