package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import output.CompressedObjectSerializer;
import output.WriteCSV;
import output.WriteTextFile;
import verbose.Timer;

import input.ReadCSV;
import input.ReadCompressedCSV;
import input.SerializedObjectUncompressor;
import model.KTType;
import model.Response;
import model.collection.KTCollection;
import model.collection.KTCollectionFactory;
import model.collection.KTCollectionType;
import model.collection.PagingKTCollection;
import java.util.Scanner;

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

	protected String settingsFile;
	
	public void run(){
		setUp();
		doScience();
		saveStuff();
	}
	
	protected void setUp(){
		loadTrain();
		loadTest();

		loadOrMakeCollection();
	} // end of method setUp
	
	
	/**
	 * Run the experiment:
	 * train (if applicable)
	 * then test (if applicable)
	 */
	protected void doScience(){
		if(train != null){
			Timer.in(this, "[Experiment] Accumulating weights in parallel");
			myCollection.train(train);
			Timer.out(this, "[Experiment] Weights accumulated in ");
		}else{
			System.out.println("[Experiment] Skipping Accumulating weights.");
		}
		
		if(test != null){
			Timer.in(this, "[Experiment] Making predictions in parallel");
			this.unweighted = myCollection.testUnweighted(test);
			this.weighted = myCollection.testWeighted(test);
			Timer.out(this, "[Experiment] Predictions completed in ");
		}else{
			System.out.println("[Experiment] Skipping testing.");
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
		
		writeCollectionString();
		writeSettingsFile();
	}
	
	
	protected void writeCollectionString(){
		WriteTextFile wtf = new WriteTextFile(
				new File(resultsDir,
				    	 "collectionString.txt"),
		    	this.myCollection.toString());
		
		wtf.write();
	} // end of method writeCollectionString
	
	
	protected void writeSettingsFile(){
		try {
			String expInfo = new Scanner(new File(this.settingsFile)).useDelimiter("\\Z").next();
			
			WriteTextFile wtf = new WriteTextFile(
					new File(resultsDir,
					    	 "experiment.settings"),
			    	expInfo);
			
			wtf.write();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			this.myCollection = ktcfact.getInstance(true);
			
			// specify where the pages should go
			if(this.collectionType == KTCollectionType.PagingKTCollection){
				((PagingKTCollection)this.myCollection).setPageDir(new File(this.resultsDir, "pages").toString());
			}
			
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
		this.train = this.loadCSV(this.trainFileName, this.trainHeader, this.trainCompressed);
	} // end of method loadTrain
	
	
	protected void loadTest(){
		this.test = this.loadCSV(this.testFileName, this.testHeader, this.testCompressed);
	} // end of method loadTest
	
	
	protected Response[] loadCSV(String fname, boolean header, boolean compressed){
		// we don't have to load
		if(fname == null){
			if(Constants.VERBOSE){
				System.out.println("[Experiment] Not reading in csv.");
			}
			return null;
		}
		Response r[];
		try {
			if(compressed){
				r = (new ReadCompressedCSV(fname, header)).read();
				
			}else{
				
				r = (new ReadCSV(fname, header)).read();
			}
		
			return r;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failed to read " + fname);
		}
		
		return null;
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

	public void setSettingsFile(String filename) {
		this.settingsFile = filename;
		
	}
	
	
} // end of class experiment
