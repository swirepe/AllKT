package input;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;


import model.Response;

/**
 * Read in a csv file that has been compressed with gzip
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
		
		
		GZIPInputStream gis = new GZIPInputStream(fin);

		return this.reader.read(gis);
	} // end of method read
	
	
	public Response[] read(String filename, boolean header) throws IOException{
		this.filename = filename;
		this.header = header;
		return this.read();
	}
} // end of class ReadCompressedCSV
