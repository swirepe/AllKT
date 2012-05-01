package parallel.mass;

import model.KT;
import model.Response;
import java.util.concurrent.Semaphore;

import config.Constants;

public class MassRunner extends Mass{

	protected KT[] models;
	protected Response[] responses;
	protected Semaphore sem;
	
	public MassRunner(KT[] models, Response[] responses){
		this.models = models;
		this.responses = responses;
		this.sem = new Semaphore(Constants.NUM_THREADS);
	}
	
	@Override
	public Runnable makeThread(KT model){
		return factory.getInstance(model, responses);
	}
	
	/* other methods inherited */
	
} // end of class massRunner
