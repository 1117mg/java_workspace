package step01.api;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03Time {
	public static void main(String[] args) {
		// LocalDate, LocalTime
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowDate.getDayOfMonth());
		System.out.println(nowTime);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		
		
		System.out.println();
		// LocalDate -> Date : valueOf
		LocalDate localDate = LocalDate.now();
		Date changedDate = Date.valueOf(localDate);
		System.out.println(changedDate);
		
		
		// with
		System.out.println(localDate.withYear(2024).withMonth(12).withDayOfMonth(25));
		
	}
}
