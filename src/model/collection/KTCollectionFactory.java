package model.collection;

import model.KTFactory;
import model.KTType;
import config.Constants;

public class KTCollectionFactory {
	protected KTCollectionType factoryType;
	protected KTType modelType;
	
	public KTCollectionFactory(){
		this.factoryType = Constants.DEFAULT_KTCOL_TYPE;
		this.modelType = Constants.DEFAULT_KT_TYPE;
	}
	
	public KTCollectionFactory(KTCollectionType factoryType, KTType modelType){
		this.factoryType = factoryType;
		this.modelType = modelType;
	}
	
	public KTCollection getInstance(boolean init){
		KTFactory ktfact = new KTFactory(this.modelType);
		
		switch(factoryType){
			case KTCollection:
				return new KTCollection(ktfact, init);
			case PagingKTCollection:
				return new PagingKTCollection(ktfact, init);
			default:
				return null;
		}
		
	} // end of method getInstance(bool)
	
	
	public KTCollection getInstance(){
		// default to uninitializing collections
		return getInstance(false);
	}
	
	
} // end of KTCollectionFactory
