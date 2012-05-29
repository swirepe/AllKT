package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class SerializedObjectUncompressor<T> {
	
	public T uncompressObject(String filename) throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File(filename));
		GZIPInputStream gz = new GZIPInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(gz);
		
		try{
			@SuppressWarnings("unchecked")
			T expandedObj = (T)ois.readObject();
			return expandedObj;
		}finally{
			ois.close();
		}
		
	} // end of method uncompress

	public T uncompressObject(File file) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		GZIPInputStream gz = new GZIPInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(gz);
		
		try{
			@SuppressWarnings("unchecked")
			T expandedObj = (T)ois.readObject();
			return expandedObj;
		}finally{
			ois.close();
		}
	} // end of method uncompress from file
	
} // end of class SerializedObjectUncompressor
