package actionModule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import utility.Reporter;

public class TimelineLoadingPerformance{	
	
	
public static void Execute(String dateStart, String dateStop) throws InterruptedException {
	
		
		// Custom date format
		SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");  
		
		Date d1 = null;
		Date d2 = null;
		try {
		    d1 = format.parse(dateStart);
		    d2 = format.parse(dateStop);
		} catch (ParseException e) {
		    e.printStackTrace();
		}    
		
		// Get msec from each, and subtract.
		long diff = d2.getTime() - d1.getTime();
		long diffSeconds = diff / 1000;         
		long diffMinutes = diff / (60 * 1000);                            
		Reporter.ReportEventNoImage("Timeline loading performance: " + diffMinutes + " minutes and " + diffSeconds + " seconds.");         
         
	}
		
		
}
