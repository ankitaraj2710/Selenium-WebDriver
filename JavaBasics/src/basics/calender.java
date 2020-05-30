package basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Calendar cal =Calendar.getInstance();
	SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	
	System.out.println(cal.getTime());
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    System.out.println(	cal.get(Calendar.DATE));
    System.out.println(	cal.get(Calendar.DAY_OF_YEAR));
    System.out.println(cal.get(Calendar.AM_PM));
	}
	

}
