package parallel.factory;

import parallel.KTRunner;
import model.KT;
import model.Response;

public interface KTRunnerFactoryInterface {
	public KTRunner getInstance(KT model, Response[] obs);
	
}
