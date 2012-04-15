package input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import model.Response;

public class ReadCSV {
	protected boolean header;
	protected String filename;
	
	public ReadCSV(String filename, boolean header){
		this.header = header;
		this.filename = filename;
	} // end of constructor
	
	
	public Response[] read(){
		ArrayList<Response> results = new ArrayList<Response>();
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
	
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
	} // end of method read
	
	
	protected Response[] toArray(ArrayList<Response> ar){
		Response[] results = new Response[ar.size()];
		for(int i = 0; i < ar.size(); i++){
			results[i] = ar.get(i);
		}
		
		return results;
	} // end of method toArray
	

} // end of class readcsv
