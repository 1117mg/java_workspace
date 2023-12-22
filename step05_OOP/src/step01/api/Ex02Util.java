package step01.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02Util {
	public static void main(String[] args) {
		// Calender
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		
		cal.set(2023, 12, 25);
		System.out.println(cal.get(Calendar.MONTH));
		
		// Date
		Date date = new Date();
		System.out.println(date); // Thu Nov 30 13:40:38 KST 2023
		
		// yyyy-MM-dd HH:mm
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		String changedDate = sdf.format(date);
		System.out.println(changedDate);
		
		// 추가)
		// 1. Calendar -> Date
		Calendar caldendar = new GregorianCalendar(2023, 11, 25);
		Date toDateValue = caldendar.getTime();
		System.out.println(toDateValue);
		
		// 2. Date -> Calendar
		Date date2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
	}
}
