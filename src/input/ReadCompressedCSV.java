package input;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

import model.Response;

/**
 * Note: The interplay between python's zlib and java's deflate is tricky,
 * and not actually worth worrying about.
 * having a smaller file in the repository would be nice to have, but not necessary
 * 
 * see: http://stackoverflow.com/questions/5532591/uncompress-a-zlib-compressed-string-in-java
 * see: http://stackoverflow.com/questions/1089662/python-inflate-and-deflate-implementations
 * 
 * In short, don't be surprised if this class doesn't work.  
 * @author swirepe
 *
 */
public class ReadCompressedCSV {
	protected boolean header;
	protected String filename;
	protected ReadCSV reader;
	
	public ReadCompressedCSV(String filename, boolean header){
		this.header = header;
		this.filename = filename;
	} // end of constructor
	
	public ReadCompressedCSV(){
		this.header = true;
		this.filename = null;
	}
	
	
	public Response[] read() throws IOException{
		this.reader = new ReadCSV();
		
		File f = new File(this.filename);
		FileInputStream fin = new FileInputStream(f);
		InflaterInputStream iis = new InflaterInputStream(fin);

		return this.reader.read(iis);
	} // end of method read
	
	
	public Response[] read(String filename, boolean header) throws IOException{
		this.filename = filename;
		this.header = header;
		return this.read();
	}
} // end of class ReadCompressedCSV
