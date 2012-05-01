package model;

import input.SerializedObjectUncompressor;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import output.CompressedObjectSerializer;
import parallel.PredictionDepot;
import verbose.Timer;
/**
 * dumps the outer loop to disk, as to save on physical memory
 * @author swirepe
 *
 */
public class PagingKTCollection extends KTCollection {
	private static final long serialVersionUID = 1L;
	
	protected transient File[] pages = null;
	protected KTCollection currentPage = null;
	protected String pageDir = "pages";
	
	protected SerializedObjectUncompressor<KTCollection> decompressor;
	protected CompressedObjectSerializer<KTCollection> compressor;
	
	public PagingKTCollection(){
		super();
	}
	
	public PagingKTCollection(KTFactory ktfact, boolean init){
		super(ktfact, init);
	}
	
	@Override
	public void initialize(){
		if(this.ktfactory == null){
			this.ktfactory = new KTFactory(); // default type
		}
		
		this.decompressor = new SerializedObjectUncompressor<KTCollection>();
		this.compressor = new CompressedObjectSerializer<KTCollection>();
		
		KT[] modelBatch = new KT[this.getArraySize()];
		
		double initial = 0.0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		
		for(initial = 0; initial < 1.0; initial += step){
			int index = 0;
			for(learn = 0; learn < 1.0; learn += step){
				for(slip = 0; slip < 0.5; slip += step){
					for(guess = 0; guess < (1 - slip); guess += step){
						modelBatch[index] = this.ktfactory.getInstance(initial, learn, guess, slip);
						index += 1;
					}
				}
			}
			saveToPage(modelBatch);
		}
		this.initialized = true;
	} // end of method initialize
	
	
	protected void initializeModels(Response[] domain){
		lazyInit();
		if(this.ktfactory.type == KTType.KTStorageless){
			return; // no need to prime if it won't remember
		}
		
		Timer.in(this, "[PagingKTCollection] Priming models with " +domain.length+ " responses.");
		updatePages();
		
		for(File p: this.pages){
			KTCollection current = openPage(p);
			current.initializeModelsParallel(domain);
			saveToPage(current);
			
		}
		Timer.out(this, "[PagingKTCollection] Primed models with " +domain.length + " responses in ");
	}
	
	
	protected void saveToPage(KT[] modelBatch){	
		KTCollection page = new KTCollection(modelBatch);
		saveToPage(page);
	}
	
	
	protected void saveToPage(KTCollection page){
		String pageName = UUID.fromString(page.toString()).toString();
		
		
		try{
			compressor.compressObject(page, new File(this.pageDir, pageName));
		}catch(Exception e){
			e.printStackTrace();
		}

		updatePages();
	}
	
	
	public void updatePages(){
		this.pages = (new File(this.pageDir)).listFiles();
	}
	
	
	
	public KTCollection openPage(File p){
		KTCollection current = null;
		try {
			current = decompressor.uncompressObject(p);
			return current;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return current;
	}
	
	
	
	public void train(Response[] r){
		updatePages();
		 
		for(File p: this.pages){
			KTCollection current = openPage(p);
			
			// the only interesting line
			current.train(r);
			
			saveToPage(current);
		}
	} // end of method train
	
	
	protected int getArraySize(){
		int i = 0;
		double learn = 0.0;
		double guess = 0.0;
		double slip = 0.0;
		// the init loop is for the pages
		for(learn = 0; learn < 1.0; learn += step){
			for(slip = 0; slip < 0.5; slip += step){
				for(guess = 0; guess < (1 - slip); guess += step){
					i += 1;
				}
			}
		}
		
		return i;
	} // end of method getArraySize
	
	
	protected int getNumPages(){
		int i = 0;
		double initial;
		for(initial = 0; initial < 1.0; initial += step){
			i++;
		}
		
		return i;
	} // end of method get numPages
	
	
	/**
	 * does the unweighed and weighed predictions in one pass
	 * r[0] = unweighted
	 * r[1] = weighted
	 * @param r
	 * @return
	 */
	public double[][] bothPredict(Response[] r){
		Timer.in(this, "[PagingKTCollection] Attempting both predictions on " + r.length + " responses.");
		double result[][] = new double[2][r.length];		
		
		int unweighted = 0;
		int weighted = 1;
		
		double totalModels = 0.0;
		double totalWeight = 0.0;
		
		updatePages();
		
		for(File p: this.pages){
			KTCollection current = openPage(p);
			double[] tempUnweighted = current.unweightedPredict(r);
			double[] tempWeighted = current.weightedPredict(r);
			
			totalModels += current.models.length;
			totalWeight += current.getTotalWeight();
			
			addDoubles(result[unweighted], tempUnweighted);
			addDoubles(result[weighted], tempWeighted);
			
		}
		
		divideEach(result[unweighted], totalModels);
		divideEach(result[weighted], totalWeight);
		
		Timer.out(this, "[PagingKTCollection] Completing both predictions on " + r.length + " responses in ");
		return result;
	}
	
	
	@Override
	public double[] unweightedPredict(Response[] r){
		Timer.in(this, "[PagingKTCollection] Attempting unweighted predictions on " + r.length + " responses");
		double[] result = new double[r.length];
		double numModels = 0.0;
		
		updatePages();
		
		for(File p: this.pages){
			KTCollection current = openPage(p);
			double[] tempRes = current.unweightedPredict(r);
			numModels += current.models.length;
			
			addDoubles(result, tempRes);
		}
		
		divideEach(result, numModels);
		
		Timer.out(this, "[PagingKTCollection] Completing unweighted predictions on " + r.length + " responses in ");
		return result;
	}
	
	@Override
	public double[] weightedPredict(Response[] r){
		Timer.in(this, "[PagingKTCollection] Attempting weighted predictions on " + r.length + " responses");
		double[] result = new double[r.length];
		double totalWeight = 0.0;
		
		updatePages();
		

		for(File p: this.pages){
			KTCollection current = openPage(p);
			double[] tempRes = current.unweightedPredict(r);
			addDoubles(result, tempRes);
			totalWeight += current.getTotalWeight();
		}
		
		divideEach(result, totalWeight);
		
		
		Timer.out(this, "[PagingKTCollection] Completing weighted predictions on " + r.length + " responses in ");
		return result;
	}
	
	
	public double[] unweightedPredictParallel(Response[] r){
		updatePages();
		PredictionDepot pd = new PredictionDepot(r.length);
		
		for(File p: this.pages){
			KTCollection current = openPage(p);
			
			PredictionDepot other = current.unweightedPredictParallelDepot(r, pd);
			pd.addToSelf(other);
		}
		return pd.getPredictions();
	}
	
	
	public double[] weightedPredictParallel(Response[] r){
		updatePages();
		PredictionDepot pd = new PredictionDepot(r.length);
		
		for(File p: this.pages){
			KTCollection current = openPage(p);
			
			PredictionDepot other = current.weightedPredictParallelDepot(r, pd);
			pd.addToSelf(other);
		}
		return pd.getPredictions();
	}
	
	/**
	 * add the a to b, store in a
	 * @param a
	 * @param b
	 */
	private void addDoubles(double[] a, double[] b){
		for(int i = 0; i < a.length; i++){
			a[i] += b[i];
		}
		
	}
	
	/**
	 * divide each element in a by b, store in a
	 * @param a
	 * @param b
	 */
	private void divideEach(double[] a, double b){
		for(int i = 0; i < a.length; i++){
			a[i] /= b;
		}
	}
	
	public String getPageDir(){
		return this.pageDir;
	}
	
	public void setPageDir(String pageDir){
		this.pageDir = pageDir;
	}
	
} // end of class PagingKTCollection
