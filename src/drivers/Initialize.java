package drivers;

import model.collection.KTCollection;
import model.response.AllResponses;

import output.CompressedObjectSerializer;

/**
 * 1. make a kt collection
 * 2. compute all those tables (rainbow tables for responses)
 * 3. save that model compressed to disk
 * @author swirepe
 *
 */
public class Initialize {
	public static void main(String[] args){
		// generate rainbow tables
		AllResponses allHolder = AllResponses.getInstance();
		KTCollection ktc = new KTCollection();
		
		ktc.initializeModelsParallel(allHolder.all);
		
		// save the ktcollection to disk
		CompressedObjectSerializer<KTCollection> cos = new CompressedObjectSerializer<KTCollection>();
		
		String fname = "all.ktcollection";
		
		try{
			cos.compressObject(ktc, fname);	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
} // end of class initialize
