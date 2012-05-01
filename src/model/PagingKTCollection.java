package model;

import java.io.File;

/**
 * dumps the outer loop to disk, as to save on physical memory
 * @author swirepe
 *
 */
public class PagingKTCollection extends KTCollection {
	private static final long serialVersionUID = 1L;
	
	protected transient File[] pages = null;
	protected KTCollection currentPage = null;
	
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
	
	
	protected void saveToPage(KT[] modelBatch){
		// lazy initialization
		if(this.pages == null){
			this.pages = new File[this.getNumPages()];
		}
		
		
		// todo: implement
	}
	
	
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
	
	
} // end of class PagingKTCollection
