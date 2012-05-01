package parallel;

import java.util.concurrent.Semaphore;

import parallel.storage.Depot;

import model.KT;
import model.Response;

/**
 *  A class for gathering data out from a kt model 
 */
public abstract class KTAccumulator extends KTRunner implements Runnable{
	protected KT model;
	protected Response[] obs;
	protected Semaphore sem;
	protected Depot depositor;
	
	
	public KTAccumulator(KT model, Response[] obs, Semaphore sem, Depot depositor){
		super(model, obs, sem);
		this.model = model;
		this.obs = obs;
		this.sem = sem;
		this.depositor = depositor;

	} // end of constructor

	
	public void run(){
		try{
			this.sem.acquire();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		takeAction();
		deposit();
		
		this.sem.release();
		
	} // end of method run
	
	
	public abstract void deposit();
	
	public abstract void takeAction(); 
	
	
} // end of class KTAccumulator
