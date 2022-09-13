package Test; 
import java.util.Calendar;

public class Ex_2_1 {
	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	
	public int beerPrice(boolean coupon, int glass, int hour,int minute) {
		int price = 490;
		
		if(coupon && glass == 1) {
			price = 100;
		}
		
		
		if(hour >= 16 && hour <= 17 && minute >= 00 && minute <= 59) {
			if(coupon &&  glass == 1) {
				price = 100;
			}else {
				price = 290;
			}
		}
		return price;
	}
}
