package model;

import config.Constants;

public class KTFactory {
	public KTType type;
	
	public KTFactory(){
		this.type = Constants.DEFAULT_KT_TYPE;
	}
	
	public KTFactory(KTType type){
		this.type = type;
	}
	
	public KT getInstance(double init, double learn, double guess, double slip){
		switch(this.type){
			case KTStorageless:
				return new KTStorageless(init, learn, guess, slip);
			case KTHashMap:
				return new KTHashMap(init, learn, guess, slip);
			case KTMongo:
				// TODO add the database connection
				return new KTMongo(init, learn, guess, slip);
			default:
			return null;
		}
	} // end of method getInstnace
	
} // end of class KTFactory
