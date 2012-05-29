package verbose;

import java.util.HashMap;

import java.util.concurrent.TimeUnit;

import config.Constants;

/**
 * Time operations if we are in verbose mode
 * Unfortunately, this is not a decorator and 
 * we cannot record at the method level.  beware of parallel stuff
 * on the same object!
 * @author swirepe
 *
 */
public class Timer {

	protected static HashMap<Object, Long> called = new HashMap<Object, Long>();

	
	public static void in(Object caller, String message){
		if(Constants.VERBOSE){
			try{
				System.out.println(message);
				long start = System.nanoTime();
				called.put(caller, start);
			}catch(Exception e){
				System.out.println("[Verbose] Error in Timer (in)");
			}
		}
	}
	
	
	public static void out(Object caller, String message){
		if(Constants.VERBOSE){
			try{
				long end = System.nanoTime();
				long time = end - called.get(caller);
				System.out.println(message + TimeUnit.SECONDS.convert(time, TimeUnit.NANOSECONDS) + " minutes.");
				
				called.remove(caller);
			}catch(Exception e){
				System.out.println("[Verbose] Error in Timer (out)");
			}
		}
	}
	
} // only need one of these
