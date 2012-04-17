package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import model.KT;
import model.Response;

import org.junit.Test;

public class KTTest {

	@Test
	public void forwardProbTest(){
		KT model = new KT(0.1, 0.15, 0.2, 0.1);
		
		// 3 true, 3 false
		boolean[] b = {true,true,true,false,false,false};
		Response r = new Response(b);
		
		
		double fprob = model.forwardKnowledge(r);
		System.out.println(fprob);
		assertEquals(0.2175,fprob, 0.05);
		
		
	} // end of forwardProbTest
	
	
	@Test
	public void forwardMemoValueTest(){
		KT model = new KT(0.1, 0.15, 0.2, 0.1);
		
		// 3 true, 3 false
		boolean[] b = {true,true,true,false,false,false};
		Response r = new Response(b);
		
		model.forwardKnowledgeMemo(r);
		
		// make sure the last one still works
		double fprob = model.forwardKnowledge(r);
		assertEquals(0.2175,fprob, 0.05);
		
		// make sure a bit before works
		double fprob2 = model.forwardKnowledge(r.slice(2));
		assertEquals(0.8086,fprob2, 0.05);
	}// end of forwardMemoValueTest
	
	
	@Test
	public void forwardMemoSliceTest(){
		KT model = new KT(0.1, 0.15, 0.2, 0.1);
		boolean[] b1 = {true};
		boolean[] b2 = {true,true};
		boolean[] b3 = {true,true,true};
		boolean[] b4 = {true,true,true,false};
		boolean[] b5 = {true,true,true,false,false};
		
		Response r1 = new Response(b1);
		Response r2 = new Response(b2);
		Response r3 = new Response(b3);
		Response r4 = new Response(b4);
		Response r5 = new Response(b5);
		
		model.forwardKnowledgeMemo(r5);
		
		HashMap<Response, Double> km = model.getKnowledgeMap();
		
		assertTrue(km.containsKey(r1));
		assertTrue(km.containsKey(r2));
		assertTrue(km.containsKey(r3));
		assertTrue(km.containsKey(r4));
		assertTrue(km.containsKey(r5));
		
	} // end of forwardMemoSliceTest
	
	
	
	@Test
	public void predictTest(){
		KT model = new KT(0.1, 0.15, 0.2, 0.1);
		boolean b[] = {false, false, true};
		Response r = new Response(b);
		
		double prediction = model.predict(r);
		assertEquals(0.59034,prediction , 0.5);
		
		boolean b2[] = {false, false, false};
		Response r2 = new Response(b2);
		
		double prediction2 = model.predict(r2);
		assertEquals(0.3198,prediction2, 0.5);
	} // end of predictTest
	
} // end of class KTTest
