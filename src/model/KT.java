package model;

import java.io.Serializable;

import config.Constants;
import verbose.Timer;

public abstract class KT implements Serializable{

	private static final long serialVersionUID = 1L;

	public abstract boolean containsPrediction(Response r);
	public abstract double getPrediction(Response r);
	public abstract void storePrediction(Response r, double prediction);
	
	public abstract boolean containsKnowledge(Response r);
	public abstract double getKnowledge(Response r);
	public abstract void storeKnowledge(Response r, double knowledge);
	
	public abstract boolean containsPerformance(Response r);
	public abstract double getPerformance(Response r);
	public abstract void storePerformance(Response r, double performance);

	protected double initial;
	protected double learn;
	protected double guess;
	protected double slip;
	protected double weight = 1.0;
	
	protected double[] knowledgeCurve;
	protected double[] performanceCurve;
	
	protected transient double ZERO = Constants.ZERO;

	public KT(double initial, double learn, double guess, double slip){
		this.initial = initial;
		this.learn = learn;
		this.guess = guess;
		this.slip = slip;
		
		validateParameters();
	} // end of constructor
	
	
	public void populateTables(Response[] rs){
		Timer.in(this, "[KT] " + this.toString() + " attempting to populate with " + rs.length + " responses.");
		
		for(Response r: rs){
			forwardKnowledgeMemo(r);
			predictMemo(r);
			performanceProbabilityMemo(r);
		}
		
		makeCurves();
		
		Timer.out(this, "[KT] " + this.toString() + " populated in ");
	} // end of method populateTables
	
	/**
	 * This generates the curves we'd see regardless of responses
	 */
	public void makeCurves(){
		makeKnowledgeCurve();
		makePerformanceCurve();
	} // end of method makeCurves
	
	
	
	/**
	 * pcorrect given knowledge curve
	 */
	public void makePerformanceCurve(){
		this.performanceCurve = new double[Constants.CURVE_LENGTH];
		double know;
		double pcorrect;
		double pincorrect;
		for(int i = 0; i < this.performanceCurve.length; i++){
			know = this.knowledgeCurve[i];
			
			pcorrect = (know*(1-this.slip)) + ((1-know)*this.guess);
			pincorrect = ((1-know)*(1-this.guess)) + (know*this.slip);
			this.performanceCurve[i] = pcorrect / (pcorrect + pincorrect);
		}
		
	} // end of makePerformanceCurve
	
	
	public void makeKnowledgeCurve(){
		this.knowledgeCurve = new double[Constants.CURVE_LENGTH];
		
		double know = this.initial;
		for(int i = 0; i < this.knowledgeCurve.length; i++){
			this.knowledgeCurve[i] = know;
			
			know = know + ((1-know)*this.learn);
		}
		
	} // end of makeKnowledgeCurve
	
	
	

	
	/**
	 * Following Cromwell's rule, we don't want zeros in our probabilities.
	 * This should be called at the end of the constructor
	 */
	protected void validateParameters(){
		if(this.initial <= 0.0){
			this.initial = ZERO;
		}
		if(this.initial >= 1){
			this.initial = 1.0 - ZERO;
		}
		
		
		if(this.learn <= 0.0){
			this.learn = ZERO;
		}
		if(this.learn >= 1){
			this.learn = 1.0 - ZERO;
		}
		
		
		if(this.guess <= 0.0){
			this.guess = ZERO;
		}
		if(this.guess >= 1){
			this.guess = 1.0 - ZERO;
		}
		
		
		if(this.slip <= 0.0){
			this.slip = ZERO;
		}
		if(this.slip >= 1){
			this.slip = 1.0 - ZERO;
		}
		
		
	} // end of validateParameters
	
	
	/**
	 * weight this particular model with a series of responses
	 * ie, how likely is this model?
	 * (just sum up the forward probabilities for the responses,
	 * storing them in the weights value.
	 * when we want to make a weighted prediction, we will normalize by the 
	 * total weights of all models
	 * @param obs
	 */
	public void accumulateWeight(Response[] obs){
		for(Response r: obs){
			this.weight += performanceProbability(r);
		}

	} // end of method accumulateWeight

	
	/**
	 * finds the forward probability of a response string
	 * @return the probability of being in the 'know' state at the end of this response
	 */
	public double forwardKnowledge(Response r){		
		// memoize: we look up what we computed in the past
		if(containsKnowledge(r)){
			return getKnowledge(r);
		}
		double know = this.initial;
		
		double kright = 0;
		double kwrong = 0;
		if(r.length() > 0){

			for(boolean obs: r.responses){
				kright = know*(1-this.slip)/(know*(1-this.slip) + this.guess*(1-know));
				kwrong = know*this.slip/((know*this.slip) + (know*(1-this.guess)));
				if(obs){
					know = kright +((1-kright)*this.learn);
				}else{
					know = kwrong + ((1-kwrong)*this.learn);
				}
				
			} // observation loop
		}
		
		// store
		storeKnowledge(r, know);

		
		return know;
	} // end of method forward
	
	
	/**
	 * the only difference between this and forwardKnowledge is that it stores all the intermediate pknows
	 * @param r
	 */
	public double forwardKnowledgeMemo(Response r){
		if(containsKnowledge(r)){
			return getKnowledge(r);
		}
		double know = this.initial;
		
		double kright = 0;
		double kwrong = 0;
		
		int index = r.length() - 1;
		Response rslice;
		// wind down to the point where we know a pknow
		while(index > 1){
			rslice = r.slice(index);
			if(containsKnowledge(rslice)){
				know = getKnowledge(rslice);
				break;
			}
			
			index -= 1;
		}
		
		// once we've found the point we know knowledge at, work forward and
		// store all intermediate things
		boolean obs;
		while(index < r.length()){
			kright = know*(1-this.slip)/(know*(1-this.slip) + this.guess*(1-know));
			kwrong = know*this.slip/((know*this.slip) + (know*(1-this.guess)));
			
			obs = r.responses[index];
			if(obs){
				know = kright +((1-kright)*this.learn);
			}else{
				know = kwrong + ((1-kwrong)*this.learn);
			}
			
			// store
			storeKnowledge(r.slice(index), know);
			
			index += 1;
		} 
		
		// finally, store the point we just computed
		storeKnowledge(r, know);
		
		return know;
	} // end of method forwardKnowledgeMemo
	

	
	/**
	 * returns the probability that the next thing predicted is a 1.
	 * 
	 * Pulls the forward probability out of the knowledge map.
	 * If it isn't in there, it computes it and puts it in the map as a side effect
	 * 
	 * If constants.predict_minus_1 is true, it holds off on using the last value
	 * in making the prediction.
	 *  
	 * @param r: a string of responses
	 * @return probability that the next thing seen is a 1
	 */
	public double predict(Response r){
		if(Constants.PREDICT_MINUS_1){
			r = r.allButLast();
		}
		
		if( containsPrediction(r)){
			return getPrediction(r);
		}
		
		double know = forwardKnowledge(r);

		// transition:
		know = ((1-know) * this.learn) + know;
		
		// sensor:
		// you know it and you failed to mess up + you didn't know it and you guesses
		double pcorrect = (know * (1-this.slip)) + ((1-know)*this.guess);
		// you didn't know it and you failed to guess + you knew it and you messed up
		double pincorrect = ((1-know)*(1-this.guess)) + (know * this.slip);
		
		// normalize
		double s = pcorrect + pincorrect;
		pcorrect = pcorrect / s;
		
		// store 
		storePrediction(r, pcorrect);


		return pcorrect;
	} // end of method predict
	
	
	
	/**
	 * Generate and store all predictions up to the length of the response submitted
	 * @param r
	 * @return the probability the next response is 1
	 */
	public double predictMemo(Response r){
		if( containsPrediction(r) ){
			return getPrediction(r);
		}
		// unfortunately, you don't use past predictions to make future ones, so just call
		// predict on all the the substrings to this point (predict will check
		// the table for us, so we don't have to here)
		for(int i = 1; i < r.length(); i++){
			predict(r.slice(i));
		}

		return predict(r);
	} // end of method predictMemo
	
	
	
	/**
	 * finds the probability of a full response string given these parameters
	 * note: the probability of a string becomes vanishingly small with the length
	 * of that string, so be careful
	 * @param r
	 * @return
	 */
	public double performanceProbability(Response r){
		if(containsPerformance(r)){
			return getPerformance(r);
		}
			
		double pResponse = 1;
		
		if(r.length() > 0){
			boolean obs;
			double know;
			Response rslice;
			for(int i = 1; i <= r.length(); i++){
				rslice = r.slice(i);
				know = forwardKnowledge(rslice);
				obs = rslice.last();
				if(obs){
					pResponse *= (know * (1-this.slip)) + ((1-know) * this.guess);
				}else{
					pResponse *= (know * this.slip) + ((1-know) * (1-this.guess));
				}
			}
		}
		
		// store
		storePerformance(r, pResponse);
		
		return pResponse;
	} // end of method responseProbability
	
	
	/**
	 * 
	 * @param r
	 * @return the probability of this string of responses.  WARNING this can be vanishingly small for long strings
	 */
	public double performanceProbabilityMemo(Response r){
		if(containsPerformance(r)){
			return getPerformance(r);
		}
		
		double probPerformance = 1;
		int index = r.length() - 1;
		Response rslice;
		// walk backwards until we see one we know
		while(index > 1){
			rslice = r.slice(index);
			if(containsPerformance(rslice)){
				probPerformance = getPerformance(rslice);
				break;
			}
			
			index -= 1;
		}
		
		// now we have a point to start at, so start rolling forward
		boolean obs;
		double know;
		while(index < r.length()){
			know = forwardKnowledgeMemo(r.slice(index));
			obs = r.responses[index];
			
			if(obs){
				probPerformance *= (know * (1-this.slip)) + ((1-know) * this.guess);
			}else{
				probPerformance *= (know * this.slip) + ((1-know) * (1-this.guess));
			}
			
			
			// store
			storePerformance(r.slice(index), probPerformance);
			
			index += 1;
		}
		
		// store
		storePerformance(r, probPerformance);
		
		return probPerformance;
	} // end of responseProbabilityMemo
	
	
	
	/**
	 * check equality, but only between the parameters
	 */
	@Override
	public boolean equals(Object other){
		if(! (other instanceof KT)){
			return false;
		}
		
		KT ktother = (KT)other;
		if(this.initial != ktother.getInitial()){ return false; }
		if(this.learn   != ktother.getLearn()  ){ return false; }
		if(this.guess   != ktother.getGuess()  ){ return false; }
		if(this.slip    != ktother.getSlip()   ){ return false; }
		
		return true;
	} // end of method equals
	
	
	@Override
	public String toString(){
		return "(" + this.initial + "," + this.learn + "," + this.guess + "," + this.slip + "," + this.weight + ")";
	}
	
	
	public void setParameters(double init, double learn, double guess, double slip){
		this.initial = init;
		this.learn = learn;
		this.guess = guess;
		this.slip = slip;
	}
	
	public double getInitial() {
		return initial;
	}


	public double getLearn() {
		return learn;
	}


	public double getGuess() {
		return guess;
	}


	public double getSlip() {
		return slip;
	}


	public double getWeight() {
		return weight;
	}


	public double[] getKnowledgeCurve() {
		return knowledgeCurve;
	}


	public double[] getPerformanceCurve() {
		return performanceCurve;
	}
	
	public void setKnowledgeCurve(double[] knowledgeCurve) {
		this.knowledgeCurve = knowledgeCurve;
	}


	public void setPerformanceCurve(double[] performanceCurve) {
		this.performanceCurve = performanceCurve;
	}
	
} // end of interface KT
