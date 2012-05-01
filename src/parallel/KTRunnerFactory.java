package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

public class KTRunnerFactory implements KTRunnerFactoryInterface{

	public KTRunnerType type;
	public Semaphore sem = null;
	
	public KTRunnerFactory(KTRunnerType type){
		this.type = type;
	}
	
	public KTRunnerFactory(KTRunnerType type, Semaphore sem){
		this.type = type;
		this.sem = sem;
	}
	
	public KTRunner getInstance(KT model, Response[] obs){
		switch(this.type){
			case TableInitializer:
				return new TableInitializer(model,obs,sem);
			case WeightAcquirer:
				return new WeightAcquirer(model, obs, sem);
			default:
				break;
		} // end of method getInstance
		
		return null;
	} // end of method getInstance
	
	
	public void setSemaphore(Semaphore sem){
		this.sem = sem;
	}
	
} // end of class KTRunner Factory
