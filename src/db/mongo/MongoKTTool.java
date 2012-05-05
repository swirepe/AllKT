package db.mongo;

import model.KT;
import model.Response;

import com.mongodb.BasicDBObject;

public class MongoKTTool {

	public static BasicDBObject toDBObject(KT model){
		BasicDBObject doc = new BasicDBObject();

		doc.put("initial", model.getInitial());
		doc.put("learn", model.getLearn());
		doc.put("guess", model.getGuess());
		doc.put("slip", model.getSlip());

		return doc;
	}
	
	public static BasicDBObject toForwardKnowledge(KT model, Response r, double forward){
		return nested(model, r, "knowledge", forward);
	}
	
	
	public static BasicDBObject toPerformance(KT model, Response r, double perfval){
		return nested(model, r, "performance", perfval);
	}
	
	
	public static BasicDBObject toPredictionKnowledge(KT model, Response r, double prediction){
		return nested(model, r, "prediction", prediction);
	}
	
	
	protected static BasicDBObject nested(KT model, Response r, String type, double val){
		BasicDBObject modelDoc = toDBObject(model);
		BasicDBObject responseDoc = MongoResponseTool.toDBObject(r);
		
		BasicDBObject forwardDoc = new BasicDBObject();
		forwardDoc.put(type, val);
		forwardDoc.put("response", responseDoc);
		
		modelDoc.put(type, forwardDoc);
		return modelDoc;
	}
	
	
} // end of class mongokt tool
