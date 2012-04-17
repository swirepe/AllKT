package input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.Response;

public class ReadCSV {
	protected boolean header;
	protected String filename;
	
	public ReadCSV(String filename, boolean header){
		this.header = header;
		this.filename = filename;
	} // end of constructor
	
	
	public ReadCSV() {
		this.header = true;
		this.filename = null;
	} // end of default constructor


	public Response[] read(){
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			return read(br);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	} // end of method read
	
	
	public Response[] read(BufferedReader br){
		ArrayList<Response> results = new ArrayList<Response>();
		try{
			
			if(header){ // discard header
				br.readLine();
			}
			
			String line = br.readLine();
			while(line != null){
				String[] tokens = line.split(",");
				boolean r[] = new boolean[tokens.length];
				
				for(int i = 0; i < r.length; i++){
					r[i] = Integer.parseInt(tokens[i]) == 1;
				}
				
				results.add(new Response(r));
				line = br.readLine();
			}

			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return toArray(results);
	}
	
	
	public Response[] read(InputStream is){
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		return read(br);
	} // end of overloaded method rea
	
	
	public Response[] read(String filename, boolean header){
		this.filename = filename;
		this.header = header;
		return read();
	}
	
	
	protected Response[] toArray(ArrayList<Response> ar){
		Response[] results = new Response[ar.size()];
		for(int i = 0; i < ar.size(); i++){
			results[i] = ar.get(i);
		}
		
		return results;
	} // end of method toArray
} // end of class readcsv
