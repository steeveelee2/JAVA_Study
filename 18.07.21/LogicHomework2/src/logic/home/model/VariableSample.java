package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void myProfile(){
		
		String name="이동우";
		String address="서울특별시 광진구 화양동";
		int age=27;
		double height=179.8;
		double weight=81.2;
		
		System.out.printf("이름 : %s\n주소 : %s\n나이 : %d\n키 : %.1f\n몸무게 : %.1f\n",name,address,age,height,weight);
		
	}
	
	public void studentInformation(){
		
		System.out.print("학교 이름 : ");
		String school=sc.next();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int cLass=sc.nextInt();
		System.out.print("번호 : ");
		int number=sc.nextInt();
		System.out.print("학생 이름 : ");
		String name=sc.next();
		
		System.out.printf("%s %d학년 %d반 %d번 %s\n",school,grade,cLass,number,name);
		
	}
	
	public void defaultValue(){
		
		boolean bl = false;
		byte bt = 0;
		char ch = 0;
		short sh = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		
		System.out.println("boolean : "+bl);
		System.out.println("byte : "+bt);
		System.out.println("char : "+ch);
		System.out.println("short : "+sh);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		
	}
	

}
