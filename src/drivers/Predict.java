package drivers;


import output.CompressedObjectSerializer;
import output.WriteCSV;
import model.KTFactory;
import model.KTType;
import model.Response;
import model.collection.KTCollection;

import input.ReadCSV;

/**
 * Predict, but without rainbow tables, because those are expensive
 * @author swirepe
 *
 */
public class Predict {
	
	public static void main(String args[]){
		
		if(args.length < 3){
			System.out.println("usage: experiment_name train.csv test.csv");
			System.out.println("Training and test data should have no headers and only student responses, separated by commas.");
			System.exit(0);
		}
		
		String experimentName = args[0];
		String traincsv = args[1];
		String testcsv = args[2];
		
		Response[] train = new ReadCSV(traincsv, false).read();
		Response[] test = new ReadCSV(testcsv, false).read();
		
		KTFactory ktf = new KTFactory(KTType.KTStorageless);
		
		KTCollection ktc = new KTCollection(ktf, false);
		
		ktc.accumulateWeightsParallel(train);
		
		double[] unweighted = ktc.unweightedPredict(test);
		double[] weighted = ktc.weightedPredict(test);

		CompressedObjectSerializer<KTCollection> cos = new CompressedObjectSerializer<KTCollection>();
		
		try{
			
			new WriteCSV(unweighted, experimentName + "-unweighted.csv").write();
			new WriteCSV(weighted, experimentName + "-weighted.csv").write();
			
			cos.compressObject(ktc, experimentName + ".ktc");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	} // end of main method
	
	
} // end of class predict
