package parallel;

import model.KT;
import model.Response;
import java.util.concurrent.Semaphore;
import model.Constants;

public class MassRunner {

	protected KT[] models;
	protected Response[] responses;
	protected Semaphore sem;
	
	
	
	
	public MassRunner(KT[] models, Response[] responses){
		this.models = models;
		this.responses = responses;
		this.sem = new Semaphore(Constants.NUM_THREADS);
	}
	
	
	public void run(KTRunnerFactory factory){
		
		for(KT model: this.models){
			
			// if there is no free permits, hang out for a bit
			while(this.sem.availablePermits() <= 0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// muted
				} 
			}
			
			new Thread(
				factory.getInstance(model, responses, sem)
			).start();
			
		} // end of kt model for loop
		
		
	} // end of method run
	
	
} // end of class massRunner
