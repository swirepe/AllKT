package output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
	String filename;
	double[] data;
	
	
	public WriteCSV(double[] data, String filename){
		this.filename = filename;
		this.data = data;
	}
	
	public void write() throws IOException{
		
		File f = new File(this.filename);
		FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		
		for(double d: this.data){
			b.write(d + ",");
		}
		
		fw.close();
		b.close();
		
	}
	
}
