package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

public class WeightedPredictor extends KTRunner {

	public WeightedPredictor(KT model, Response[] obs, Semaphore sem) {
		super(model, obs, sem);
	} // end of constructor

	@Override
	protected void takeAction() {
		// TODO Auto-generated method stub
		
	}



} // end of class WeightedPredictor
