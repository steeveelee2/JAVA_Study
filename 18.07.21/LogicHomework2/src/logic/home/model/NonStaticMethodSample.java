package logic.home.model;

import java.util.Scanner;
import java.util.Date;
import java.util.Random;

public class NonStaticMethodSample {
	
	Scanner sc=new Scanner(System.in);
	Date dt=new Date();
	Random rnd=new Random();
	
	
	public void testScanner(){
		
		System.out.print("boolean 값 입력 : ");
		boolean bl=sc.nextBoolean();
		System.out.print("byte 값 입력  : ");
		byte bt=sc.nextByte();
		System.out.print("char 값 입력 : ");
		char ch=sc.next().charAt(0);
		System.out.print("short 값 입력 : ");
		short sh=sc.nextShort();
		System.out.print("int 값 입력 : ");
		int i=sc.nextInt();
		System.out.print("long 값 입력 : ");
		long l=sc.nextLong();
		System.out.print("float 값 입력 : ");
		float f=sc.nextFloat();
		System.out.print("double 값 입력 : ");
		double d=sc.nextDouble();
		
		System.out.println("boolean : "+bl);
		System.out.println("byte : "+bt);
		System.out.println("char : "+ch);
		System.out.println("short : "+sh);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		
	}
	
	public void testDate(){
		
		String now=dt.toString();
		System.out.println(now);
		
	}
	
	public void testRandom(){
		
		System.out.println("정수 난수 출력 : "+rnd.nextLong());
		System.out.println("실수 난수 출력 : "+rnd.nextDouble());
		
	}

}
