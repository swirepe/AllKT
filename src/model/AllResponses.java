package model;

import input.ReadCSV;

// this is a singleton
public class AllResponses {
	private static AllResponses instance = null;
	
	public final Response[] all;
	
	public final String responseFilename = "response.1.20.txt";
	public final boolean header = false;
	
	
	private AllResponses(){
		this.all = readIn();
	} // end constructor
	
	
	public static AllResponses getInstance(){
		if(instance == null){
			instance = new AllResponses();
		}
		
		return instance;
	}
	
	
	private Response[] readIn(){
		ReadCSV reader = new ReadCSV(responseFilename, header);
		
		return reader.read();
	}

} // end of class AllResponses
