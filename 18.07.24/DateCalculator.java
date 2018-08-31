package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {

	
	
	public DateCalculator() { }

	public long getDays() {
		Calendar cal = new GregorianCalendar();
		
		long sumDays = 0l;

		
		// 이전 년도까지의 총 일 수 계산
		for (int i = 1; i <= cal.get(Calendar.YEAR); i++) {
			
			sumDays += (i == cal.get(Calendar.YEAR)) ? 
				cal.get(Calendar.DAY_OF_YEAR) : (isLeapYear(i) ? 366 : 365); 
			
			/*
			if (i == cal.get(Calendar.YEAR)) {
				sumDays += cal.get(Calendar.DAY_OF_YEAR);
			} else {
				sumDays += isLeapYear(i) ? 366 : 365;
			}*/
			
		}
		
		return sumDays;
	}

	public boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
	}
}
