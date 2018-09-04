package com.week4;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestWork1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Calendar c=new GregorianCalendar();
		
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		int hour=c.get(Calendar.HOUR);
		int min=c.get(Calendar.MINUTE);
		int sec=c.get(Calendar.SECOND);
		
		c.set(2011,2,21);
		SimpleDateFormat sf=new SimpleDateFormat("YYYY년 MM월 dd일 E요일");
		System.out.println(sf.format(c.getTime()));

	}

}
