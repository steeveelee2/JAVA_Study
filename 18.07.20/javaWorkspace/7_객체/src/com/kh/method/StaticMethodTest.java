package com.kh.method;

public class StaticMethodTest {
	// 프로그램 실행 시에 static 영역에 저장되어
	// 프로그램 종료 시에 사라지는 공유 용도의 메소드
	
	// 1. 매개변수 X, 반환값 X
	public static void method1(){
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("sum : "+(num1 + num2));
	}
	
	// 2. 매개변수 X, 반환값 O
	public static int method2(){
		int num1 = 10;
		int num2 = 20;
		
		return num1 + num2;
	}
	
	// 3. 매개변수 O, 반환값 X
	public static void method3(String str){
		
		System.out.println(str+"님이 로그인하셨습니다.");
		
	}
	
	// 4.  매개변수 O, 반환값 O
	public static String method4(String str){
		
		return str+"님이 로그인하셨습니다.";
		
	}
	
}








