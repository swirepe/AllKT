package config;

import model.KTType;
import model.collection.KTCollectionType;

public class Constants {
	public static final double ZERO = 0.00001;
	
	public static final int CURVE_LENGTH = 10;
	
	public static final String RESPONSES_INIT = "responseAt20.txt";
	public static final boolean RESPONSES_COMPRESSED = false;
	
	public static final KTType DEFAULT_KT_TYPE = KTType.KTHashMap;
	public static final String DEFAULT_KT_TYPE_STRING = "KTHashMap";
	
	public static final KTCollectionType DEFAULT_KTCOL_TYPE = KTCollectionType.KTCollection;
	public static final String DEFAULT_KTCOL_TYPE_STRING = "KTCollection";
	
	// MUTABLE
	public static int NUM_THREADS = 16;
	public static double STEP = 0.05;
	public static boolean VERBOSE = true;
	
	// if we receive a response string of 10, ignore the 10th when making the prediction
	// this way, we don't have to hold out that last response in a separate place
	public static boolean PREDICT_MINUS_1 = false;
	
}
