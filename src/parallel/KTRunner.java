package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

public abstract class KTRunner implements Runnable{
	protected KT model;
	protected Response[] obs;
	protected Semaphore sem;
	
	/**
	 * A multithreaded way of getting model likelihoods
	 * Finds the likelihoods in [start, stop)
	 * @param start - The index of the array to start training models at
	 * @param stop - The index to stop before
	 */
	public KTRunner(KT model, Response[] obs, Semaphore sem){
		this.model = model;
		this.obs = obs;
		this.sem = sem;
		

		
	} // end of constructor

	public void run(){
		try{
			this.sem.acquire();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		takeAction();
		
		this.sem.release();
		
	} // end of method run
	
	
	protected abstract void takeAction();

	
} // end of class KTRunner
