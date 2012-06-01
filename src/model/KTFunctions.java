package model;

import config.Constants;

/**
 * This class implements the functions of KT without having to instantiate an object
 * @author swirepe
 *
 */

public final class KTFunctions {
	
	/**
	 * Finds the forward probability of a response string: how likely the student is to know the skill by the end of the string of responses.
 	 * @param initial The probability the student knew the skill before the first attempt.
	 * @param learn The probability that the student will learn the skill between any two attempts.
	 * @param guess The probability that a student will not know a skill but get a question right.
	 * @param slip The probability that a student will know a skill but get a question wrong. 
	 * @return the probability of being in the 'know' state at the end of this response
	 */
	public static double forwardKnowledge(double initial,
										  double learn,
										  double guess,
										  double slip,
										  Response r){		
		// memoize: we look up what we computed in the past

		double know = initial;
		
		double kright = 0;
		double kwrong = 0;
		if(r.length() > 0){

			for(boolean obs: r.responses){
				kright = know*(1-slip)/(know*(1-slip) + guess*(1-know));
				kwrong = know*slip/((know*slip) + (know*(1-guess)));
				if(obs){
					know = kright +((1-kright)*learn);
				}else{
					know = kwrong + ((1-kwrong)*learn);
				}
				
			} // observation loop
		}
		
		return know;
	} // end of static method forward
	
	
	/**
	 * returns the probability that the next thing predicted is a 1.
	 * 
	 * If constants.predict_minus_1 is true, it holds off on using the last value
	 * in making the prediction.
	 * 
	 * @param initial The probability the student knew the skill before the first attempt.
	 * @param learn The probability that the student will learn the skill between any two attempts.
	 * @param guess The probability that a student will not know a skill but get a question right.
	 * @param slip The probability that a student will know a skill but get a question wrong. 
	 * @param r: a string of responses
	 * @return probability that the next thing seen is a 1
	 */
	public static double predict( double initial,
								  double learn,
								  double guess,
								  double slip,
								  Response r){
		if(Constants.PREDICT_MINUS_1){
			r = r.allButLast();
		}
		
		
		double know = KTFunctions.forwardKnowledge(initial, learn, guess, slip, r);

		// transition:
		know = ((1-know) * learn) + know;
		
		// sensor:
		// you know it and you failed to mess up + you didn't know it and you guesses
		double pcorrect = (know * (1-slip)) + ((1-know)*guess);
		// you didn't know it and you failed to guess + you knew it and you messed up
		double pincorrect = ((1-know)*(1-guess)) + (know * slip);
		
		// normalize
		double s = pcorrect + pincorrect;
		pcorrect = pcorrect / s;
		
		return pcorrect;
	} // end of method predict
	
	
	/**
	 * finds the probability of a full response string given these parameters
	 * note: the probability of a string becomes vanishingly small with the length
	 * of that string, so be careful
	 * @param initial The probability the student knew the skill before the first attempt.
	 * @param learn The probability that the student will learn the skill between any two attempts.
	 * @param guess The probability that a student will not know a skill but get a question right.
	 * @param slip The probability that a student will know a skill but get a question wrong.
	 * @param r A string of responses
	 * @return How likely was this string of responses?
	 */
	public static double performanceProbability( double initial,
										  double learn,
										  double guess,
										  double slip,
										  Response r){

		double pResponse = 1;
		
		if(r.length() > 0){
			boolean obs;
			double know;
			Response rslice;
			for(int i = 1; i <= r.length(); i++){
				rslice = r.slice(i);
				know = KTFunctions.forwardKnowledge(initial, learn, guess, slip, rslice);
				obs = rslice.last();
				if(obs){
					pResponse *= (know * (1-slip)) + ((1-know) * guess);
				}else{
					pResponse *= (know * slip) + ((1-know) * (1-guess));
				}
			}
		}
		
		return pResponse;
	} // end of method responseProbability
	
	
} // end of (static) class KTFunctions
