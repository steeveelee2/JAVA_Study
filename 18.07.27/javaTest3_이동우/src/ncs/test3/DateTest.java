package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		
		Calendar birth=new GregorianCalendar();
		Calendar now=Calendar.getInstance();
		
		birth.set(1987,4,27);
		SimpleDateFormat sBirth=new SimpleDateFormat("YYYY년 MM월 dd일 E요일");
		SimpleDateFormat sNow=new SimpleDateFormat("YYYY년 MM월 dd일");
		
		System.out.println(sBirth.format(birth.getTime()));
		System.out.println(sNow.format(now.getTime()));
		
		int age=now.get(Calendar.YEAR)-birth.get(Calendar.YEAR);
		System.out.println("나이 : "+age+" 세");

	}

}
