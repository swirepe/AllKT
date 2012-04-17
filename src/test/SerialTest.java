package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import input.SerializedObjectUncompressor;

import java.io.File;
import java.util.HashMap;

import model.KT;
import model.Response;

import org.junit.Test;

import output.CompressedObjectSerializer;

public class SerialTest {

	/**
	 * Make sure that a single model can hit the disk and come back successfully
	 */
	@Test
	public void writeModelTest(){
		KT model = new KT(0.1, 0.15, 0.2, 0.1);
		
		try {
			File temp = File.createTempFile("mykt", "temp");
			
			CompressedObjectSerializer<KT> compressor = new CompressedObjectSerializer<KT>();
			compressor.compressObject(model, temp);
			
			SerializedObjectUncompressor<KT> decompressor = new SerializedObjectUncompressor<KT>();
			
			KT model2 = decompressor.uncompressObject(temp);
			
			assertTrue(model.equals(model2));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
	} // end of writeModelTest
	
	
	/**
	 * Make sure that the tables within a model survive the trip to disk and back
	 */
	@Test
	public void persistantTableTest(){
		KT model = new KT(0.1, 0.15, 0.2, 0.1);
		boolean[] b = {true, true, true, false};
		Response r = new Response(b);
		
		// get a value to compare with
		double f1 = model.forwardKnowledgeMemo(r);
		
		HashMap<Response, Double> km1 = model.getKnowledgeMap();
		assertTrue(km1.containsKey(r));
		
		
		// serialize the model
		try {
			File temp = File.createTempFile("mykt", "temp");
			
			CompressedObjectSerializer<KT> compressor = new CompressedObjectSerializer<KT>();
			compressor.compressObject(model, temp);
			
			SerializedObjectUncompressor<KT> decompressor = new SerializedObjectUncompressor<KT>();
			
			KT model2 = decompressor.uncompressObject(temp);
			
			HashMap<Response, Double> km2 = model2.getKnowledgeMap();
			assertTrue(km2.containsKey(r));
			
			double f2 = km2.get(r);
			
			assertEquals(f1, f2, 0.0001);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		
	} // end of persistantTableTest
	
	
} // end of class SerialTest
