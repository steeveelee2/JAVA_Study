package remd.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// 입출력 준비
		Scanner sc=new Scanner(System.in);
		System.out.print("날짜를 입력하시오.\n년 : ");
		int year=sc.nextInt();
		System.out.print("월 : ");
		int month=sc.nextInt()-1;
		System.out.print("일 : ");
		int date=sc.nextInt();
		
		// 카렌다, 포맷 객체 생성, 날짜 설정
		Calendar cal=new GregorianCalendar();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 M월 d일 E요일");
		cal.set(year,month,date);
		
		System.out.println("\n입력된 날짜에 대한 정보는 아래와 같습니다.");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(year+"년은 "+(checkLeapYear(year)?"윤년이다.":"윤년이 아니다."));
	}
	
	// 윤년 체크 메서드
	public static boolean checkLeapYear(int year){
		boolean chk=true;
		// 4로 나눠떨어지거나 100과 400으로 동시에 나눠떨어지면 윤년
		if(year%4!=0){
			chk=false;
			return chk;
		}else if(year%100==0){
			if(year%400!=0){
				chk=false;
				return chk;
			}
		}
		return chk;
	}

}
