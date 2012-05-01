package output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
	double[] data;
	File file;
	
	public WriteCSV(double[] data, String filename){
		this.file = new File(filename);
		this.data = data;
	}
	
	
	public WriteCSV(double[] data, File file) {
		this.data = data;
		this.file = file;
	}

	
	public void write() throws IOException{
		
		FileWriter fw = new FileWriter(this.file);
		BufferedWriter b = new BufferedWriter(fw);
		
		for(double d: this.data){
			b.write(d + ",");
		}
		
		fw.close();
		b.close();
		
	}
	
}
