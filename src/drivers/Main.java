package drivers;

import config.ConfigParser;
import config.Constants;
import config.Experiment;

public class Main {
	public static void main(String args[]){
		System.out.println("Usage: allkt configfile.properties");
		
		if(args.length == 1){
			if(Constants.VERBOSE){
				System.out.println("[Main] loading " + args[0]);
			}
			
			
			ConfigParser config = new ConfigParser();
			Experiment e = config.parse(args[0]);
			
			e.run();
		}
		
		
	}

	
	
} // end of class main
