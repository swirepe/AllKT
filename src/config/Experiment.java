package config;

import java.io.File;
import java.io.IOException;

import output.CompressedObjectSerializer;
import output.WriteCSV;

import input.ReadCSV;
import input.ReadCompressedCSV;
import input.SerializedObjectUncompressor;
import model.KTType;
import model.Response;
import model.collection.KTCollection;
import model.collection.KTCollectionFactory;
import model.collection.KTCollectionType;

public class Experiment {
	protected String id;
	
	protected KTType modelType;
	protected KTCollectionType collectionType;
	
	protected KTCollection myCollection;
	protected String loadCollectionFile = null;
	
	protected Response[] train;
	protected Response[] test;
	
	double[] unweighted;
	double[] weighted;
	
	protected String trainFileName;
	protected String testFileName;
	
	protected boolean trainCompressed;
	protected boolean testCompressed;
	
	protected boolean trainHeader;
	protected boolean testHeader;
	
	protected String resultsDir;
	protected String collectionOutFile = null;
	
	public void run(){
		setUp();
		doScience();
		saveStuff();
	}
	
	protected void setUp(){
		loadOrMakeCollection();
		loadTrain();
		loadTest();
	} // end of method setUp
	
	
	/**
	 * Run the experiment:
	 * train (if applicable)
	 * then test (if applicable)
	 */
	protected void doScience(){
		if(train != null){
			myCollection.accumulateWeightsParallel(train);
		}
		
		if(test != null){
			this.unweighted = myCollection.unweightedPredictParallel(test);
			this.weighted = myCollection.weightedPredictParallel(test);
		}
	}
	
	
	protected void saveStuff(){
		WriteCSV uwcsv = new WriteCSV(unweighted, new File(resultsDir,"unweighted.csv"));
		WriteCSV wwcsv = new WriteCSV(weighted, new File(resultsDir, "weighted.csv"));
		CompressedObjectSerializer<KTCollection> cos = new CompressedObjectSerializer<KTCollection>();
		
		try {
			uwcsv.write();
			wwcsv.write();
			
			cos.compressObject(myCollection, new File(resultsDir,this.collectionOutFile));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// if we didn't use the last value for prediction, we can report it
		if(Constants.PREDICT_MINUS_1){
			writeActualValue();
		}
	}
	
	
	protected void writeActualValue(){
		double[] actual = Response.eachLast(test);
		WriteCSV actualcsv = new WriteCSV(actual, new File(resultsDir,"actual.csv"));
		
		try{
			actualcsv.write();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	protected void loadOrMakeCollection(){
		// make a new collection if we don't have one to load
		if(loadCollectionFile == null){
			KTCollectionFactory ktcfact = new KTCollectionFactory(this.collectionType, this.modelType);
			this.myCollection = ktcfact.getInstance();
		}else{
			// otherwise read the file off disk if we have a name for it
			try{
				
				SerializedObjectUncompressor<KTCollection> sou
					= new SerializedObjectUncompressor<KTCollection>();
				
				this.myCollection = sou.uncompressObject(this.loadCollectionFile);
			}catch(Exception e){ 
				e.printStackTrace(); 
			}
		}
	} // end of method loadOrMakeCollection
	
	
	protected void loadTrain(){
		this.loadCSV(this.train, this.trainFileName, this.trainHeader, this.trainCompressed);
	} // end of method loadTrain
	
	
	protected void loadTest(){
		this.loadCSV(this.test, this.testFileName, this.testHeader, this.testCompressed);
	} // end of method loadTest
	
	
	protected void loadCSV(Response[] destination, String fname, boolean header, boolean compressed){
		// we don't have to load
		if(fname == null){
			return;
		}

		try {
			if(compressed){
				destination = (new ReadCompressedCSV(fname, header)).read();
			}else{
				destination = (new ReadCSV(fname, header)).read();
			}
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failed to read " + fname);
		}
	} // end of method loadCSV
	
	
	public void setID(String id){
		this.id = id;
	}
	
	public void setModelType(KTType modelType){
		this.modelType = modelType;
	}
	
	public void setCollectionType(KTCollectionType collectionType){
		this.collectionType = collectionType;
	}
	
	
	public void setTrain(String trainFileName, boolean trainHeader, boolean trainCompressed){
		this.trainFileName = trainFileName;
		this.trainCompressed = trainCompressed;
		this.trainHeader = trainHeader;
	}
	
	
	public void setTest(String testFileName, boolean testHeader, boolean testCompressed){
		this.testFileName = testFileName;
		this.testCompressed = testCompressed;
		this.testHeader = testHeader;
	}
	
	public void setLoadCollectionFileName(String collectionFile){
		this.loadCollectionFile = collectionFile;
	}

	public void setResultsDir(String resultsDir){
		this.resultsDir = resultsDir;
		
		File f = new File(this.resultsDir);
		f.mkdir();
		
	}
	
	public void setCollectionOutFile(String collectionOutFile){
		this.collectionOutFile = collectionOutFile; 
	}
	
	
} // end of class experiment
