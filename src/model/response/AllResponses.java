package model.response;

import java.io.IOException;

import model.Response;

import config.Constants;

import input.ReadCSV;
import input.ReadCompressedCSV;

// this is a singleton
public class AllResponses {
	private static AllResponses instance = null;
	
	public final Response[] all;
	
	public final String responseFilename = Constants.RESPONSES_INIT;
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
		if(Constants.RESPONSES_COMPRESSED){
			ReadCompressedCSV reader = new ReadCompressedCSV(responseFilename, header);
			try {
				return reader.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}else{
			ReadCSV reader = new ReadCSV(responseFilename, header);
			return reader.read();
		}
	}

} // end of class AllResponses
