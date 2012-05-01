package parallel;

import java.util.concurrent.Semaphore;

import model.KT;
import model.Response;

/**
 * the only difference: each prediction is worth its weight now, instead of 1
 * @author swirepe
 *
 */
public class WeightedPredictor extends Predictor {

	public WeightedPredictor(KT model, Response[] obs, Semaphore sem, Depot depositor) {
		super(model, obs, sem, (PredictionDepot) depositor);
		myWeight = this.model.getWeight();
	} // end of constructor


} // end of class WeightedPredictor
