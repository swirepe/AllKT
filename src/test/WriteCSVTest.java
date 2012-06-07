package test;

import static org.junit.Assert.*;

import input.ReadCSV;

import java.io.File;
import java.io.IOException;

import model.Response;

import org.junit.Test;

import output.WriteCSV;

public class WriteCSVTest {

	@Test
	public void writeCSVTest() throws IOException{
		double[] data = {0, 1, 1, 1};
		
		File temp = File.createTempFile("myktcsv", "temp");
		
		WriteCSV wcsv = new WriteCSV(data, temp);
		wcsv.write();
		
		ReadCSV rcsv = new ReadCSV(temp.getAbsolutePath(), false);
		Response[] r = rcsv.read();
		
		assertTrue(r[0].responses[0] == false);
		assertTrue(r[0].responses[1] == true);
		assertTrue(r[0].responses[2] == true);
		assertTrue(r[0].responses[3] == true);
	} // end of method writeCSVTest
	
} // end of class writecsv
