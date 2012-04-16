package model;

import java.io.Serializable;
import java.util.HashMap;

public class KT implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double initial;
	protected double learn;
	protected double guess;
	protected double slip;
	protected double weight = 1.0;
	
	protected double[] knowledgeCurve;
	protected double[] performanceCurve;
	
	// responses -> pcorrect on next attempt
	protected HashMap<Response, Double> predictionMap;
	
	// responses -> pknowledge
	protected HashMap<Response, Double> knowledgeMap;

	// response -> probability of seeing this response
	protected HashMap<Response, Double> likelihoodMap;
	
	
	protected transient double ZERO = Constants.ZERO;

	
	
	public KT(double initial, double learn, double guess, double slip) {
		this.initial = initial;
		this.learn = learn;
		this.guess = guess;
		this.slip = slip;
		
		validateParameters();
	} // end of constructor
	
	
	/**
	 * This generates the curves we'd see regardless of responses
	 */
	public void makeCurves(){
		this.knowledgeCurve = new double[Constants.CURVE_LENGTH];
		this.performanceCurve = new double[Constants.CURVE_LENGTH];
		
		 // TODO implement
	} // end of method makeCurves
	
	
	
	public void populateTables(Response[] rs){
		this.predictionMap = new HashMap<Response, Double>();
		this.knowledgeMap = new HashMap<Response, Double>();
		this.likelihoodMap = new HashMap<Response, Double>();

		for(Response r: rs){
			forwardKnowledgeRecursive(r);
			predict(r);
			responseProbability(r);
		}
		makeCurves();
	} // end of method populateTables
	
	
	
	/**
	 * Following Cromwell's rule, we don't want zeros in our probabilities
	 */
	private void validateParameters(){
		if(this.initial == 0.0){
			this.initial = ZERO;
		}
		
		if(this.learn == 0.0){
			this.learn = ZERO;
		}
		
		if(this.guess == 0.0){
			this.guess = ZERO;
		}
		
		if(this.slip == 0.0){
			this.slip = ZERO;
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
		// TODO implement
	}

	
	/**
	 * finds the forward probability of a response string
	 * @return the probability of being in the 'know' state at the end of this response
	 */
	public double forwardKnowledge(Response r){
		double unknow = (1 - this.initial);
		double know = this.initial;
		
		// memoize this beast.  in the best case, this should be able to
		// use previous forward probabilities to compute later ones
		// TODO: implement that
		if(this.knowledgeMap.containsKey(r)){
			return this.knowledgeMap.get(r);
		}
		
		
		for(boolean obs : r.responses){
			// transition model
			// unknow = 	you didn't know it and you stayed that way
			//          +   you knew it and you forgot
			// since you can't forget,
			//        =  (unknow * 1) + (know * 0)
			
			// know =       you didn't know it and you learned
			//           +  you did know it and you stayed that way
			// likewise,
			//      =  (unknow * learn) + (know * 1) 
			
			know = (unknow * this.learn) + know;
			
			
			// sensor model:
			if(obs == false){
				// unknow = you didn't know and you failed to guess 
				unknow = (unknow * (1-this.guess));
				
				// know = you knew and you messed up
				know *= slip;
			}else if(obs == true){
				// unknow = you didn't know and you guessed
				unknow *= this.guess;
				
				// know = you knew and you failed to mess up
				know *= (1-this.slip);
			}
			
			// normalize
			double s = unknow + know;
			unknow /= s;
			know /= s;
			
		} // end of obs for loop
		
		
		// store if we need to
		if(! this.knowledgeMap.containsKey(r)){
			this.knowledgeMap.put(r, know);
		}
		
		return know;
	} // end of method forward
	
	
	/**
	 * returns pknow for one step from here, given an observation
	 * @param unknow
	 * @param know
	 * @param ob
	 * @return
	 */
	public double forwardKnowledgeStep(double know, boolean ob){
		// transition:
		double unknow = 1 - know;
		know = (unknow * this.learn) + know;
		
		// sensor model:
		if(ob == false){
			// unknow = you didn't know and you failed to guess 
			unknow = (unknow * (1-this.guess));
			
			// know = you knew and you messed up
			know *= slip;
		}else if(ob == true){
			// unknow = you didn't know and you guessed
			unknow *= this.guess;
			
			// know = you knew and you failed to mess up
			know *= (1-this.slip);
		}
		
		// normalize
		double s = unknow + know;
		unknow /= s;
		know /= s;
		
		return know;
	} // end of method forwardKnowledgeStep
	
	/**
	 * A recursive, memoized method for finding forward probabilities
	 * should return identical results to forwardKnowledge
	 * ^ might run out of stack
	 * ^ looks up each piece if it needs to
	 * @param r
	 * @return
	 */
	public double forwardKnowledgeRecursive(Response r){
		if(this.knowledgeMap.containsKey(r)){
			return this.knowledgeMap.get(r);
		}else{
			double pknow = 0;
			
			// base case: no observations
			if(r.length() > 0){
				pknow = forwardKnowledgeRecursive(r.slice(r.length() - 1));
				pknow = forwardKnowledgeStep(pknow, r.last());
			}else{
				pknow = this.initial;
			}
			
			// store
			this.knowledgeMap.put(r, pknow);
			
			return pknow;
		}
	}// end of method forwardKnowledgerecursive
	
	
	
	/**
	 * returns the probability that the next thing predicted is a 1.
	 * 
	 * Pulls the forward probability out of the knowledge map.
	 * If it isn't in there, it computes it and puts it in the map as a side effect
	 * @param r: a string of responses
	 * @return probability that the next thing seen is a 1
	 */
	public double predict(Response r){
		double know = 0;
		
		// knowledge: retrieve if we can, otherwise store
		if(this.knowledgeMap.containsKey(r)){
			know = this.knowledgeMap.get(r);
		}else{
			know = forwardKnowledge(r);
			this.knowledgeMap.put(r, know);
		}
		
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
		
		// performance: store if you have to
		if(! this.predictionMap.containsKey(r)){
			this.predictionMap.put(r, pcorrect);
		}

		return pcorrect;
	} // end of method predict
	
	
	/**
	 * finds the probability of a full response string given these parameters
	 * note: the probability of a string becomes vanishingly small with the length
	 * of that string, so be careful
	 * @param r
	 * @return
	 */
	public double responseProbability(Response r){
		if(this.likelihoodMap.containsKey(r)){
			return this.likelihoodMap.get(r);
		}else{
			double pResponse = 1;
			
			if(r.length() > 0){
				Response rslice;
				
				for(int i = 1; i < r.length(); i++){
					rslice = r.slice(i);
					
					// memoize
					if(this.likelihoodMap.containsKey(rslice)){
						pResponse *= this.likelihoodMap.get(rslice);
					}else{
					
						double pKnow = this.forwardKnowledge(rslice);
						boolean obs = rslice.last();
						
						pResponse *= responseProbabilityStep(pKnow, obs);
						
						// store
						this.likelihoodMap.put(rslice, pResponse);
						
					}
				}
				

						
				// store
				if(! this.likelihoodMap.containsKey(r)){
					this.likelihoodMap.put(r, pResponse);
				}
				
			}
			return pResponse;
		}
	} // end of method responseProbability
	
	

	
	public double responseProbabilityStep(double pKnow, boolean ob){
		double pResponse = 0;
		if(ob == false){
			// you got it wrong:
			//   probability you knew it and slipped + probability you didn't know it and failed to guess
			pResponse = (pKnow * this.slip) + ((1-pKnow) * (1-this.guess));
			
		}else if(ob == true){
			// you got it right:
			// probability that you knew it and failed to slip + probability you didn't and guessed
			pResponse = (pKnow * (1-this.slip)) + ((1-pKnow) * this.guess);
		}
		return pResponse;  
	} // end of method responseProbabilityStep
	
	
} // end of class kt
