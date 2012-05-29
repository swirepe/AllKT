package test;

import static org.junit.Assert.*;


import model.Response;

import org.junit.Test;

import input.ReadCompressedCSV;

public class ReadCompressedCSVTest {

	@Test
	public void readCompressedTest(){
		ReadCompressedCSV rccsv = new ReadCompressedCSV("etc/responseAt20.gz", false);
		try {
			Response[] r = rccsv.read();
			System.out.println(r[0]);
			
		} catch (Exception e) {
			fail();
		}
	}
	
}
