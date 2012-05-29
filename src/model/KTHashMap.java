package model;

import java.io.Serializable;
import java.util.HashMap;


public class KTHashMap extends KT implements Serializable{
	/**
	 * Uses a hashtable to store precomputed values
	 */
	private static final long serialVersionUID = 1L;

	// responses -> pcorrect on next attempt
	protected HashMap<Response, Double> predictionMap;
	
	// responses -> pknowledge
	protected HashMap<Response, Double> knowledgeMap;

	// response -> probability of seeing this response
	protected HashMap<Response, Double> performanceMap;
	
	
	public KTHashMap(double initial, double learn, double guess, double slip) {
		super(initial, learn, guess, slip);
		
		this.predictionMap = new HashMap<Response, Double>();
		this.knowledgeMap = new HashMap<Response, Double>();
		this.performanceMap = new HashMap<Response, Double>();

		
	} // end of constructor
	


	@Override
	public boolean containsPrediction(Response r){
		return this.predictionMap.containsKey(r);
	}

	@Override
	public double getPrediction(Response r){
		return this.predictionMap.get(r);
	}
	
	@Override
	public void storePrediction(Response r, double prediction){
		this.predictionMap.put(r, prediction);
	}
	
	
	@Override
	public boolean containsKnowledge(Response r){
		return this.knowledgeMap.containsKey(r);
	}
	
	@Override
	public double getKnowledge(Response r){
		return this.knowledgeMap.get(r);
	}
	
	@Override
	public void storeKnowledge(Response r, double knowledge){
		this.knowledgeMap.put(r, knowledge);
	}
	
	
	@Override
	public boolean containsPerformance(Response r){
		return this.performanceMap.containsKey(r);
	}
	
	@Override
	public double getPerformance(Response r){
		return this.performanceMap.get(r);
	}
	
	@Override
	public void storePerformance(Response r, double performance){
		this.performanceMap.put(r, performance);
	}
	
	
	
	
	// ------------------------------------------------------------------------
	// Getters and setters
	// ------------------------------------------------------------------------


	public HashMap<Response, Double> getPredictionMap() {
		return predictionMap;
	}


	public HashMap<Response, Double> getKnowledgeMap() {
		return knowledgeMap;
	}


	public HashMap<Response, Double> getLikelihoodMap() {
		return performanceMap;
	}


	public void setPredictionMap(HashMap<Response, Double> predictionMap) {
		this.predictionMap = predictionMap;
	}


	public void setKnowledgeMap(HashMap<Response, Double> knowledgeMap) {
		this.knowledgeMap = knowledgeMap;
	}


	public void setResponseMap(HashMap<Response, Double> responseMap) {
		this.performanceMap = responseMap;
	}

	@Override
	public boolean equals(Object other){
		if(! (other instanceof KTHashMap)){
			return false;
		}
		
		KTHashMap ktother = (KTHashMap)other;
		if(this.initial != ktother.getInitial()){ return false; }
		if(this.learn   != ktother.getLearn()  ){ return false; }
		if(this.guess   != ktother.getGuess()  ){ return false; }
		if(this.slip    != ktother.getSlip()   ){ return false; }
		
		return true;
	} // end of method equals
	
} // end of class kt
