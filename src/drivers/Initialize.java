package drivers;

import model.AllResponses;
import model.KTCollection;
import parallel.TableInitializer;

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
		
	}
} // end of class initialize
