package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import output.WriteTextFile;

public class WriteTextFileTest {

	@Test
	public void writeTextTest() throws IOException{
		String data = "This is a text file.\nThere are many like it.";
		File temp = File.createTempFile("mykttext", "temp");
		
		WriteTextFile wtf = new WriteTextFile();
		wtf.write(temp, data);
		
	    Scanner scan = new Scanner(temp);  
	    scan.useDelimiter("\\Z");  
	    String content = scan.next();  
		
	    assertEquals(content, data);
	}
	
}  // end of class writetextfiletest
