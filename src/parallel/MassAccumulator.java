package parallel;

import config.Constants;
import model.KT;
import model.Response;
import java.util.concurrent.Semaphore;
/**
 * like a mass runner, but returns a value
 * @author swirepe
 *
 * @param <T>
 */
public class MassAccumulator extends Mass{

	protected Depot depot = null;
	
	public MassAccumulator(KT[] models, Response[] responses, Depot depot){
		this.models = models;
		this.responses = responses;
		this.sem = new Semaphore(Constants.NUM_THREADS);
		this.depot = depot;
		
	}
	
	public MassAccumulator(KT[] models, Response[] responses){
		this.models = models;
		this.responses = responses;
		this.sem = new Semaphore(Constants.NUM_THREADS);
	}

	

	
	@Override
	protected Runnable makeThread(KT model) {
		return this.factory.getInstance(model, responses);
	}
	
	
	
} // end of class MassAccumulator
