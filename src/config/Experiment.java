package config;

import java.io.IOException;

import input.ReadCSV;
import input.ReadCompressedCSV;
import input.SerializedObjectUncompressor;
import model.KTCollection;
import model.KTCollectionFactory;
import model.KTCollectionType;
import model.KTType;
import model.Response;

public class Experiment {
	protected String id;
	
	protected KTType modelType;
	protected KTCollectionType collectionType;
	
	protected KTCollection myCollection;
	protected String loadCollectionFile = null;
	
	protected Response[] train;
	protected Response[] test;
	
	protected String trainFileName;
	protected String testFileName;
	
	protected boolean trainCompressed;
	protected boolean testCompressed;
	
	protected boolean trainHeader;
	protected boolean testHeader;
	
	protected String resultsFile;
	protected String collectionOutFile = null;
	
	public void run(){
		setUp();

		// TODO implement
	}
	
	protected void setUp(){
		loadOrMakeCollection();
		loadTrain();
		loadTest();
	} // end of method setUp
	
	
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

	public void setResultsFile(String resultsFile){
		this.resultsFile = resultsFile;
	}
	
	public void setCollectionOutFile(String collectionOutFile){
		this.collectionOutFile = collectionOutFile; 
	}
	
	
} // end of class experiment
