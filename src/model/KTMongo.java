package model;

import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 * a kt class that uses mongodb instead of in memory hashes
 * @author swirepe
 *
 */
public class KTMongo extends KT {

	private static final long serialVersionUID = 1L;

	protected DB con;
	protected DBCollection knowledgeCollection;
	protected DBCollection predictionCollection;
	protected DBCollection performanceCollection;
	
	protected boolean initialized = false;
	
	public KTMongo(double init, double learn, double guess, double slip){
		super(init, learn, guess, slip);
		
	}
	
	public KTMongo(double init, double learn, double guess, double slip, DB connection){
		super(init, learn, guess, slip);
		initialize(connection);
	} // end of constructor
	
	
	public void initialize(DB con){
		initialized = true;
		this.con = con;
		
		knowledgeCollection   = con.getCollection("knowledge");
		predictionCollection  = con.getCollection("prediction");
		performanceCollection = con.getCollection("performance");
	}
	
	
	
	
	@Override
	public boolean containsPrediction(Response r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPrediction(Response r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void storePrediction(Response r, double prediction) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsKnowledge(Response r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getKnowledge(Response r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void storeKnowledge(Response r, double knowledge) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsPerformance(Response r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPerformance(Response r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void storePerformance(Response r, double performance) {
		// TODO Auto-generated method stub

	}

} // end of class KTMongo
