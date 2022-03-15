package utility;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtil {
	
	private static final SimpleDateFormat cdf = new SimpleDateFormat("MM/dd/yyyy");
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");

	public static String getCurrentDate() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return cdf.format(timestamp).toString();
	}

	public static String getTimeStamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return sdf.format(timestamp).toString();
	}
}
