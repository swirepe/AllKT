package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

public class TableInitializer extends KTRunner {

	public TableInitializer(KT model, Response[] obs, Semaphore sem) {
		super(model, obs, sem);
	}

	
	protected void takeAction(){
		this.model.populateTables(this.obs);
	}

} // end of class tableInitializer
