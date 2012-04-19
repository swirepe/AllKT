package output;

import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;

import com.thoughtworks.xstream.XStream;

import model.*;

/**
 * uses xtream to dump objects to disk
 * @author swirepe
 *
 */
public class XMLModelDumper<T extends Serializable> {
	
	protected XStream xstream;
	
	public XMLModelDumper(){
		setupXStream();
	} // end of default constructor
	
	public void setupXStream(){
		this.xstream = new XStream();
		
		this.xstream.alias("ktmodel", KTHashMap.class);
		this.xstream.alias("ktcollection", KTCollection.class); 
		this.xstream.alias("r", Response.class);
		
	} // end of xstream setup
	
	
	public void dumpObject(T toDump, String filename){
		File f = new File(filename);
		dumpObject(toDump, f);

	} // end of method dumpObject (string)
	
	
	public void dumpObject(T toDump, File file){
		FileWriter fw = null;
		try{
			fw = new FileWriter(file);
			String xml = this.xstream.toXML(toDump);
			fw.write(xml);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{ fw.close(); }catch(Exception muted){ /**/ }
		}
	} // end of method dump object (file)
	
	
}  // end of PlaintextModelDumper
