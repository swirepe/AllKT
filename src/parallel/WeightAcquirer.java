package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

public class WeightAcquirer extends KTRunner {

	public WeightAcquirer(KT model, Response[] obs, Semaphore sem) {
		super(model, obs, sem);
	}

	protected void takeAction(){
		this.model.accumulateWeight(obs);
	}
	
} // end of class WeightAcquirer
