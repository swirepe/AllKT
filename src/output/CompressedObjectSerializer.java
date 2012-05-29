package output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

public class CompressedObjectSerializer<T extends Serializable> {

	public CompressedObjectSerializer(){
		/* ... */ 
	} // end of default constructor
	
	
	public void compressObject(final T toCompress, String filename) throws IOException{
		
		compressObject(toCompress, new File(filename));

	} // end of method compressObject
	
	
	public void compressObject(final T toCompress, File file) throws IOException{
		FileOutputStream fos = new FileOutputStream(file);
		GZIPOutputStream gz = new GZIPOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(gz);
		
		try{
			oos.writeObject(toCompress);
			oos.flush();
		}finally{
			oos.close();
		}
	} // end of method compressObject
	
} // end of class CompressedObjectSerializer
