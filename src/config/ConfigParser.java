package config;

import java.io.File;
import java.io.IOException;

import org.ini4j.InvalidFileFormatException;
import org.ini4j.Ini;

public class ConfigParser {

	public Experiment parse(String filename){
		try {
			Ini ini = new Ini(new File(filename));
			
			if(ini.containsKey("initialize")){
				
			}
			
			
			
		} catch (InvalidFileFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// todo: implement
		
		return null;
	} // end of method parse
	
	
} // end of class ConfigParser
