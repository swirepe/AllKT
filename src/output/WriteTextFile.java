package output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteTextFile {
	File outFile = null;
	String filename = null;
	String data = null;
	
	// ---- Constructors -----
	public WriteTextFile(){
		/* */
	}
	
	public WriteTextFile(String filename){
		this.filename = filename;
		this.data = null;
	}
	
	public WriteTextFile(File outFile){
		this.outFile = outFile;
		this.data = null;
	}
	
	public WriteTextFile(String filename, String data){
		this.filename = filename;
		this.data = data;
	}
	
	public WriteTextFile(File outFile, String data){
		this.outFile = outFile;
		this.data = data;
	}
	
	
	/**
	 * Using the data on hand, write this file to disk.
	 */
	public void write(){
		if(this.outFile == null){
			if(this.filename == null){
				System.err.println("[WriteTextFile] Error: null filename.");
				return;
			}else{
				this.outFile = new File(this.filename);
			}
		}
		
		if(this.data == null){
			System.err.println("[WriteTextFile] Error: no data provided.");
			return;
		}
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(outFile));
			br.write(this.data);
		}catch(Exception e){
			e.printStackTrace();
		}
	} // end of method write
	
	
	public void write(String filename){
		this.filename = filename;
		write();
	}
	
	
	public void write(File outFile){
		this.outFile = outFile;
		write();
	}
	
	
	public void write(String filename, String data){
		this.filename = filename;
		this.data = data;
		write();
	}
	
	public void write(File outFile, String data){
		this.outFile = outFile;
		this.data = data;
		write();
	}
} // end of class writeTextFile
