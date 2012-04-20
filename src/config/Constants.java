package config;

import model.KTType;

public class Constants {
	public static final double ZERO = 0.00001;
	
	public static final int NUM_THREADS = 16;
	public static final int CURVE_LENGTH = 10;
	
	public static final String RESPONSES_INIT = "responseAt20.txt";
	public static final boolean RESPONSES_COMPRESSED = false;
	
	public static final KTType DEFAULT_KT_TYPE = KTType.KTHashMap;
	
	// MUTABLE
	public static double STEP = 0.05;
	public static boolean VERBOSE = true;
}
