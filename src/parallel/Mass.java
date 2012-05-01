package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;
import config.Constants;

/**
 * an abstract class for objects that want to do many things with models in parallel
 * @author swirepe
 *
 */
public abstract class Mass {
	
	KT[] models;
	Response[] responses;
	Semaphore sem;
	KTRunnerFactoryInterface factory = null;
	
	protected abstract Runnable makeThread(KT model);
	
	
	/**
	 * Accumulate whatever it is in parallel
	 * @param factory a way to generate the accumulators as you need them
	 * @param depot this should be changed in place by the threads, so no need for a return
	 */
	public void run(KTRunnerFactoryInterface factory){
		this.factory = factory;
		run();
	}
	
	
	public void run(){
		
		for(KT model: this.models){
			
			// if there is no free permits, hang out for a bit
			waitForFreePermit();
			
			new Thread(
				makeThread(model)
			).start();
			
		} // end of kt model for loop
		
		
		waitForThreadsToFinish();
		
	} // end of method run
	
	
	
	protected void waitForFreePermit(){
		// if there is no free permits, hang out for a bit
		while(this.sem.availablePermits() <= 0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// muted
			} 
		}
	}
	
	
	protected void waitForThreadsToFinish(){
		// don't leave until we have all our permits back,
		// ie all our subthreads are done
		while(this.sem.availablePermits() < Constants.NUM_THREADS){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
} // end of class Mass
