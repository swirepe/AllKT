package config;


import java.io.FileInputStream;
import java.util.Properties;

import model.KTType;
import model.collection.KTCollectionType;

public class ConfigParser {

	public Experiment parse(String filename){
		Experiment exp = new Experiment();
		
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(filename));
			// no need to accumulate typos from strangely-cased keys
			properties = propertiesToLowerCase(properties);
			
			// set the constant values
			Constants.VERBOSE = Boolean.parseBoolean(properties.getProperty("verbose", "true"));
			Constants.STEP = Double.parseDouble(properties.getProperty("step", "0.01"));
			Constants.NUM_THREADS = Integer.parseInt(properties.getProperty("threads", "16"));
			
			// list all the properties
			if(Constants.VERBOSE){
				System.out.println("[Config] " + filename + " contains these properties:");
				properties.list(System.out);
			}

			String id = getID(properties);
			exp.setID(id);
			
			// we are either loading a collection or making a new one
			if(properties.containsKey("loadcollection")){
				exp.setLoadCollectionFileName(properties.getProperty("loadcollection"));
			}else{
				exp.setModelType(getModelType(properties));
				exp.setCollectionType(getCollectionType(properties));
			}
			
			exp.setResultsDir(properties.getProperty("results", id));
			exp.setCollectionOutFile(properties.getProperty("collectionout", id + "-ktcollection.collection"));
			
			// training and testing are optional, we can just dump a file out...i guess
			String train = properties.getProperty("train", null);
			String test = properties.getProperty("test", null);
			
			boolean trainCompressed = Boolean.parseBoolean(
					properties.getProperty("traincompressed", "true") );
			
			boolean testCompressed = Boolean.parseBoolean(
					properties.getProperty("testcompressed", "true") );
			
			

			boolean trainHeader = Boolean.parseBoolean(
					properties.getProperty("trainheader", "true") );
			

			boolean testHeader = Boolean.parseBoolean(
					properties.getProperty("testheader", "true") );
			
			
			
			exp.setTrain(train, trainHeader, trainCompressed);
			exp.setTest(test, testHeader, testCompressed);
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
		return exp;
	} // end of method parse
	
	
	protected Properties propertiesToLowerCase(Properties properties){
		Properties p2 = new Properties();
		for(String key: properties.stringPropertyNames()){
			String value = properties.getProperty(key);
			p2.put(key.toLowerCase(), value);
		}
		return p2;
	}
	
	protected String getID(Properties p){
		String now = "exp" + IDMaker.now();
		String id = p.getProperty("id", now);
		return id;
	}
	
	protected KTType getModelType(Properties p){
		String modelString = p.getProperty("model", Constants.DEFAULT_KT_TYPE_STRING);
		
		return KTType.valueOf(modelString);
	}
	
	
	protected KTCollectionType getCollectionType(Properties p){
		String collType = p.getProperty("model", Constants.DEFAULT_KTCOL_TYPE_STRING);
		
		return KTCollectionType.valueOf(collType);
	}
	
	
	
} // end of class ConfigParser
