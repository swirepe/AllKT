package model;

/* note to self: iterators are dumb and hard in java
import java.util.Arrays;
import java.util.Iterator;
//*/

public class Response{
	public final boolean[] responses;
	
	public Response(boolean[] r){
		this.responses = new boolean[r.length];
		System.arraycopy(r, 0, this.responses, 0, r.length);
	}
	
	
	@Override
	public boolean equals(Object other){
		if( ! (other instanceof Response)){
			return false;
		}
		
		Response rOther = (Response)other;
		if( rOther.responses.length != this.responses.length){
			return false;
		}
		for(int i = 0; i < responses.length; i++){
			if(rOther.responses[i] != this.responses[i]){
				return false;
			}
		}	
		return true;
	} // end of method equals
	
	
	@Override
	public String toString(){
		StringBuffer b = new StringBuffer();
		for(boolean i: this.responses){
			b.append( i ? 1 : 0 );
		}
		
		return b.toString();
	} // end of method toString
	
	
	@Override
	public int hashCode(){
		return this.toString().hashCode();
	} // end of method hashCode 


	/**
	 * returns a new response from this one
	 * with responses [0, stopIndex)
	 * @param length the number of responses to consider
	 * @return a response object of length length
	 */
	public Response slice(int length){
		boolean[] newr = new boolean[length];
		System.arraycopy(this.responses, 0, newr, 0, length);
		return new Response(newr);
	}

	public int length(){
		return this.responses.length;
	}
	
	public boolean last(){
		return this.responses[this.responses.length - 1];
	}
	
	
} // end of class Response
