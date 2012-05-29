package model;
/**
 * A no-caching version of knowledge tracing.
 * @author swirepe
 *
 */
public class KTStorageless extends KT {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KTStorageless(double initial, double learn, double guess, double slip) {
		super(initial, learn, guess, slip);
	}

	@Override
	public boolean containsPrediction(Response r) {
		// we don't contain it, because
		// we don't contain anything
		return false;
	}

	@Override
	public double getPrediction(Response r) {
		throw new IllegalArgumentException("KTStorageless does not support table lookups.");
	}

	@Override
	public void storePrediction(Response r, double prediction) {
		/* pass */
	}

	@Override
	public boolean containsKnowledge(Response r) {
		return false;
	}

	@Override
	public double getKnowledge(Response r) {
		throw new IllegalArgumentException("KTStorageless does not support table lookups.");
	}

	@Override
	public void storeKnowledge(Response r, double knowledge) {
		/* pass */
	}

	@Override
	public boolean containsPerformance(Response r) {
		return false;
	}

	@Override
	public double getPerformance(Response r) {
		throw new IllegalArgumentException("KTStorageless does not support table lookups.");
	}

	@Override
	public void storePerformance(Response r, double performance) {
		/* pass */
	}

} // end of class KTStorageless
