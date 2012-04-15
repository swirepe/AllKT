package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

public class KTRunnerFactory {

	public KTRunnerType type;
	
	public KTRunnerFactory(KTRunnerType type){
		this.type = type;
	}
	
	
	public KTRunner getInstance(KT model, Response[] obs, Semaphore sem){
		switch(this.type){
			case TableInitializer:
				return new TableInitializer(model,obs,sem);
			case WeightAcquirer:
				return new WeightAcquirer(model, obs, sem);
			case Predictor:
				return new Predictor(model, obs, sem);
			case WeightedPredictor:
				return new WeightedPredictor(model, obs, sem);
			default:
				break;
		} // end of method getInstance
		
		return null;
	} // end of method getInstance
	
	
} // end of class KTRunner Factory
