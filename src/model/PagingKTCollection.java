package model;

import java.io.File;

/**
 * dumps the outer loop to disk, as to save on physical memory
 * @author swirepe
 *
 */
public class PagingKTCollection extends KTCollection {
	
	protected File[] pages;
	protected KTCollection currentPage;
	
	public PagingKTCollection(){
		super();
	}
	
	
	@Override
	public void initialize(){
		
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
