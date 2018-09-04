package com.kh.method.run;

import com.kh.method.*;

public class Main {

	public static void main(String[] args) {
		// 메소드 테스트용 실행 메소드
		/*NonStaticMethodTest nTest 
		    = new NonStaticMethodTest();
		
		System.out.println("프로그램이 실행됩니다~~");
		
		// 매개변수 X, 반환값 X
		nTest.method1(); 
		
		// 매개변수 X, 반환값 O
		System.out.println(nTest.method2());
		
		// 매개변수 O, 반환값 X
		nTest.method3(10, 20);
		
		// 매개변수 O, 반환값 O
		System.out.println(
			"sum : "+nTest.method4(10, 20)
		);
		
		System.out.println("---------------------");
		
		// static 메소드는 프로그램을 실행할 때 
		// 함께 정적 메모리에 저장되기 때문에
		// new 를 통한 객체 생성없이 사용할 수 있다.
		
		StaticMethodTest.method1();
		
		int sum = StaticMethodTest.method2();
		System.out.println("합계 : " + sum);
		
		StaticMethodTest.method3("홍길동");
		
		String str = StaticMethodTest.method4("고길동");
		System.out.println(str);
		
		System.out.println("프로그램이 종료됩니다~~");*/
		
		/*OverloadingTest oTest = new OverloadingTest();
		
		// 정수 10과 20을 더하는 메소드 호출
		System.out.println(oTest.sum(10, 20));
		
		// 실수 1.23과 12.3을 더하는 메소드 호출
		System.out.println(oTest.sum(1.23, 12.3));
		*/
		
		CallMethodTest cTest = new CallMethodTest();
		
		cTest.method1();
	}

}










