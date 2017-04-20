package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {

	
	public static void main(String args[]){
	//	Calendar calendar = Calendar.getInstance();
	//	int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);	
//		System.out.println(dayOfWeek);
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));    
		System.out.println(new SimpleDateFormat("MMMM").format(date.getTime()));		
		System.out.println("Current Year is : " + calendar.get(Calendar.YEAR));
	    System.out.println("Current Date is : " + calendar.get(Calendar.DATE));
	}
}
