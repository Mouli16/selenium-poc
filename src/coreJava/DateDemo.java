package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo 
{

	public static void main(String[] args) 
	{
		Calendar cal= Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
	String date= sd.format(d);
	System.out.println("Date: " + date);
	System.out.println(cal.getTime());
    int dom= cal.get(Calendar.DAY_OF_MONTH);
    int dow= cal.get(Calendar.DAY_OF_WEEK);
    System.out.println(dom + dow);
	}

}
