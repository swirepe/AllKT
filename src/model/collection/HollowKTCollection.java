package model.collection;

import config.Constants;
import verbose.Timer;
import model.KTFunctions;
import model.Response;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


/**
 * For things with many models, you run the risk of having upwards of 2gb 
 * reserved just for one floating point number each.
 * A hollow stores only the total weight accumulated
 * @author swirepe
 *
 */
public class HollowKTCollection extends KTCollection{
	private static final long serialVersionUID = 1L;
	public double[] weights;
	
	public HollowKTCollection() {
		initialize();
	}
	
	
	@Override
	/**
	 * Do nothing, we aren't storing any models, only the weights
	 */
	public void initialize(){
		Timer.in(this, "[HollowKTCollection] Attempting to create " + this.getArraySize() + " models.");
		this.initialized = true;
		this.models = null;
		
		// weights start at 1
		this.weights = new double[this.getArraySize()];
		for(int i = 0; i < this.weights.length; i++){
			this.weights[i] = 1;
		}
		
		Timer.out(this, "[HollowKTCollection] Successfully created " + this.getArraySize() + " pseudo-models in ");
	}
	
	
	public void accumulateWeights(Response[] observations){
		Timer.in(this, "[HollowKTCollection] Attempting to accumulate weights over " + observations.length + " observations.");
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		int i = 0;
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						
						
						// get the forward probability for each response
						for(Response r: observations){
							this.weights[i] += KTFunctions.performanceProbability(initial, learn, guess, slip, r);
						}
						
						i += 1;
					}
				}
			}
		}
		

		Timer.out(this, "[HollowKTCollection] Successfully accumulated weights in ");
	} // end of method accumulateWeights
	
	
	
	/**
	 * Accumulate the weights for each item,
	 * parallel by observations, not my models (ie, each observation
	 * will become its own slot in the thread pool)
	 * WARNING: this requires a lot of memory, and is turned off by default
	 */
	public void accumulateWeightsParallel(Response[] observations){
		LockingDoubleArrayContainer weightContainer = new LockingDoubleArrayContainer(this.getArraySize());
		ExecutorService svc = Executors.newFixedThreadPool(Constants.NUM_THREADS);
		
		int weightLength = this.getArraySize();
		for(Response r: observations){
			svc.execute(new WeightAccumulator(weightContainer, r, weightLength));
		}
		
		svc.shutdown();
		
		while(! svc.isTerminated() ){
			try { 
				Thread.sleep(1000);  // 1 second 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		

		for(int i = 0; i < weightContainer.values.length; i++){
			this.weights[i] += weightContainer.values[i];
		}
		
	} // end of method accumulateWeightsParallel (array)
	
	

	@Override
	public void train(Response[] observations){
		this.accumulateWeightsParallel(observations);

	} // end of method train
	
	
	
	@Override
	public double unweightedPredict(Response r){
		double prediction = 0.0;
		int i = 0;
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						prediction += KTFunctions.predict(initial, learn, guess, slip,r);
						i += 1;
					}
				}
			}
		}
		
		prediction /= i;
		return prediction;
	}  // end of method unweighedPredict (single)
	
	
	/**
	 * make a prediction over one response, but in parallel.
	 * @param r
	 * @return
	 */
	public double unweightedPredictParallel(Response r){
		LockingDoubleContainer predictionContainer = new LockingDoubleContainer();
		ExecutorService svc = Executors.newFixedThreadPool(Constants.NUM_THREADS);
		
		for(double initial = 0; initial < 1.0; initial += step){
			svc.execute(new RangePredict(initial, r, predictionContainer));
		}
		
		// no new tasks can be added
		// -- important if we want to know if the tasks have completed
		svc.shutdown();
		
		
		// wait for the things to finish
		//    doing this instead of svc.awaitTermination(timeout, unit)
		//    because I honestly don't know how long to wait.
		while(! svc.isTerminated() ){
			try { 
				Thread.sleep(1000);  // 1 second 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		double prediction = predictionContainer.value() / this.getArraySize();
		return prediction;
	} // end of method unweightedPredictParallel (single)
	
	
	
	
	@Override
	public double[] unweightedPredict(Response[] r){
		Timer.in(this, "[HollowKTCollection] Attempting unweighted predictions on " + r.length + " responses");
		double[] predictions = new double[r.length];
		for(int i = 0; i < r.length; i++){
			predictions[i] = unweightedPredict(r[i]);
		}
		Timer.out(this, "[HollowKTCollection] Completing unweighted predictions on " + r.length + " responses in ");
		return predictions;
	} // end of method unweighted predict (array)
	
	
	@Override
	public double[] unweightedPredictParallel(Response[] r){
		Timer.in(this, "[HollowKTCollection] Attempting unweighted predictions on " + r.length + " responses in parallel");
		
		double[] predictions = new double[r.length];
		for(int i = 0; i < r.length; i++){
			predictions[i] = unweightedPredictParallel(r[i]);
		}
		
		Timer.out(this, "[HollowKTCollection] Completing parallel unweighted predictions on " + r.length + " responses in ");
		return predictions;
	}
	
	
	/**
	 * Make a weighted prediction from one response
	 */
	public double weightedPredict(Response r){
		int i = 0;
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		
		double prediction = 0.0;
		double totalWeight = 0.0;
		
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						prediction += KTFunctions.predict(initial, learn, guess, slip,r) * this.weights[i];
						totalWeight += this.weights[i];
						i += 1;
					}
				}
			}
		}
		
		return prediction / totalWeight;
	} // end of method weightedPredict (single)
	
	
	
	@Override
	public double[] weightedPredict(Response[] r){
		Timer.in(this, "[HollowKTCollection] Attempting weighted predictions on " + r.length + " responses");
		double[] predictions = new double[r.length];
		
		
		for(int i = 0; i < r.length; i++){
			predictions[i] = weightedPredict(r[i]);
		}
		
		Timer.out(this, "[HollowKTCollection] Completing weighted predictions on " + r.length + " responses in ");
		return predictions;
	} // end of method weightedPredict (array)
	
	
	/**
	 * Make weighted predictions for one response, in parallel
	 * @param r
	 * @return
	 */
	public double weightedPredictParallel(Response r){
		LockingDoubleContainer predictionContainer = new LockingDoubleContainer();
		ExecutorService svc = Executors.newFixedThreadPool(Constants.NUM_THREADS);
		int i = 0;
		double learn, guess, slip;
		
		for(double initial = 0; initial < 1.0; initial += step){
			svc.execute(new RangeWeightPredict(initial, this.weights, i, r, predictionContainer));
			
			// burn off the extra i indices (with no math involved!)
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						i += 1;
					}
				}
			}
		}  // end of parallel for loop
		
		// no new tasks can be added
		// -- important if we want to know if the tasks have completed
		svc.shutdown();
		
		
		// wait for the things to finish
		//    doing this instead of svc.awaitTermination(timeout, unit)
		//    because I honestly don't know how long to wait.
		while(! svc.isTerminated() ){
			try { 
				Thread.sleep(1000);  // 1 second 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		double prediction = predictionContainer.value() / this.getTotalWeight();
		return prediction;
	} // end of method weightedPredictParallel
	
	
	@Override
	public double[] weightedPredictParallel(Response[] r){
	
		double[] predictions = new double[r.length];
		
		for(int i = 0; i < r.length; i++){
			predictions[i] = weightedPredictParallel(r[i]);
		}

		return predictions;
	} // end of method weightedPredictParalle (array)
	
	
	public double getTotalWeight(){
		double total = 0;
		
		for(double d: this.weights){
			total += d;
		}
		
		return total;
	}
	
	
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("index,initial,learn,guess,slip\n");
		int i = 0;
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		for(initial = 0; initial < 1.0; initial += step){
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						sb.append("" + i + "," + initial + "," + learn + "," + guess + "," + slip + "," + this.weights[i] + "\n");
						i += 1;
					}
				}
			}
		}
		return sb.toString();
	} // end of method toString
	
	
	// --------------------------
	// Inner classes
	// --------------------------
	
	/**
	 * Used to combine multiple values in parallel
	 */
	class LockingDoubleContainer{
		private double value = 0.0;
		
		public synchronized void add(double x){
			this.value += x;
		}
		
		public synchronized double value(){
			return this.value;
		}
	} // end of inner class locking double container
	
	
	class LockingDoubleArrayContainer{
		public double[] values = null;
		public Semaphore[] locks = null;
		
		public LockingDoubleArrayContainer(int length){
			values = new double[length];
			locks = new Semaphore[length];
			
			// initialize each semaphore
			for(int i = 0; i < locks.length; i++){
				locks[i] = new Semaphore(1);
			}
		} // end of constructor
		

		public void addAtIndex(double x, int index){
			try {
				locks[index].acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			values[index] += x;
			locks[index].release();
			
		}
		
		public synchronized double[] values(){
			return this.values;
		}
	} // end of inner class locking double container
	
	
	
	/**
	 * Make predictions for all values of the other parameters given initial
	 * (going through the rest of the loops)
	 */
	class RangePredict implements Runnable{
		protected final double initial;
		protected Response r;
		protected LockingDoubleContainer predictionContainer;
		
		public RangePredict(double initial, Response r, LockingDoubleContainer d){
			this.initial = initial;
			this.r = r;
			this.predictionContainer = d;
		}
		
		public void run(){
			double learn = 0.0;
			double guess = 0.0;
			double slip = 0.0;
			double prediction = 0.0;
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						prediction += KTFunctions.predict(this.initial, learn, guess, slip, this.r);
					}
				}
			}
			
			this.predictionContainer.add(prediction);
		}
	} // end of inner class RangePredict
	
	
	class RangeWeightPredict implements Runnable{
		protected final double initial;
		protected int i;
		protected double[] weights;
		protected Response r;
		protected LockingDoubleContainer predictionContainer;
		
		public RangeWeightPredict(double initial, double[] weights, int i, Response r, LockingDoubleContainer d){
			this.initial = initial;
			this.weights = weights;
			this.i = i;
			this.r = r;
			this.predictionContainer = d;
		}
		
		@Override
		public void run() {
			double learn = 0.0;
			double guess = 0.0;
			double slip = 0.0;
			double prediction = 0.0;
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						prediction += KTFunctions.predict(this.initial, learn, guess, slip, this.r) * this.weights[i];
						this.i += i;
					}
				}
			}
			this.predictionContainer.add(prediction);
		} // end of method run	
		
	} // end of inner class range weight predict
	
	
	class WeightAccumulator implements Runnable{
		protected LockingDoubleArrayContainer weightContainer;
		protected Response r;
		
		public WeightAccumulator(LockingDoubleArrayContainer weightContainer, Response r, int weightLength){
			this.weightContainer = weightContainer;
			this.r = r;
		}
		
		public void run(){
			
			double initial = 0.0;
			double learn = 0.0;
			double guess = 0.0;
			double slip = 0.0;
			double performance;
			int i = 0;
			for(initial = 0; initial < 1.0; initial += step){
				for(learn = 0; learn < 1.0; learn += step){
					for(slip = 0; slip < 0.5; slip += step){
						for(guess = 0; guess < (1 - slip); guess += step){
							performance = KTFunctions.performanceProbability(initial, learn, guess, slip, r);
							weightContainer.addAtIndex(performance, i);
							i += 1;
						}
					}
				}
			}
		} // end of method run
	} // end of inner class WeightAccumulator
} // end of class HollowKTCollection
