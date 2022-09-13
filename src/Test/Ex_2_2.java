package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Ex_2_2 {
	SimpleDateFormat time = new SimpleDateFormat("HH:mm", Locale.JAPANESE);
	String minTime = "8:45";
	String maxTime = "17:59";
	
	public int commission(boolean dayOfWeek, String commissionTime,  boolean special) {
		time.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
		
		if(special) {
			return 0;
		}
		
		if (parseDate(commissionTime).before(parseDate(maxTime)) && parseDate(commissionTime).after(parseDate(minTime)) && dayOfWeek) {
			return 0;
		}
		return 110;
	}
	
	
	private Date parseDate(String date) {
	    try {
	        return time.parse(date);
	    } catch (ParseException e) {
	        return new Date(0);
	    }
	}

}
