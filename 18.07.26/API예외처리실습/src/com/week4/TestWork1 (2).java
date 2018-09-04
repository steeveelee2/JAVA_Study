package com.week4;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestWork1 {

	public static void main(String[] args) {

		Calendar c = new GregorianCalendar();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		c.set(2013, 3, 21);

		SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일 E요일");
		System.out.println(f.format(c.getTime()));

	}

}
