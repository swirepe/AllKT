package output;

import java.io.Serializable;

/**
 * uses xtream to dump objects to disk
 * @author swirepe
 *
 */
public class PlaintextModelDumper<T extends Serializable> {
	
	//protected XStream xstream;
	
	public PlaintextModelDumper(){
		/* ... */
	}
	
	protected void setupXStream(){
		
	}
	
	
	public void dumpObject(T toDump, String filename){
		setupXStream();
		
		
	}
	
}  // end of PlaintextModelDumper
