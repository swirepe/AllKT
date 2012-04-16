package test;

import static org.junit.Assert.*;
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
		
		
		double fprob = model.forwardKnowledgeRecursive(r);
		System.out.println(fprob);
		assertEquals(0.4083,fprob, 0.05);
		
		
	} // end of forwardProbTest
	
	
	
} // end of class KTTest
