package db.mongo;

import model.Response;

import com.mongodb.BasicDBObject;

public class MongoResponseTool {

	public static BasicDBObject toDBObject(Response r){
		BasicDBObject doc = new BasicDBObject();
		
		for(int i = 0; i < r.responses.length; i++){
			doc.put("r" + i, r.responses[i]);
		}
		return doc;
	}
	
}
