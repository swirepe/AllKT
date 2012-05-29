package config;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class IDMaker {
	// GET DATE & TIME IN ANY FORMAT
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd--HH-mm-ss";

	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}

} // end of class now
