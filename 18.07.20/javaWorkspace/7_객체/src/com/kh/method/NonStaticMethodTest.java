package com.kh.method;

public class NonStaticMethodTest {
	// 매개변수 유무, 반환자료형(반환값)의 유무에
	// 따라 크게 4가지로 메소드를 나눌 수 있다.

	// 1. 매개변수가 없고 반환값도 없는 메소드
	public void method1(){
		// 아무 값도 반환하지 않고, 메소드의 내용만
		// 수행하는 일반 기능 제공 메소드
		// 메소드의 역할을 수행한 뒤에 자신을 호출했던
		// 위치로 다시 돌아간다.
		
		System.out.println("매개 변수도 없고, "
				+ "반환값도 없는 메소드입니다.");
		
		return; // 모든 메소드는 return이 존재하지만
		        // void의 경우에는 생략이 가능하다.
				// 생략할 경우 JVM에 의해 자동으로 추가된다.
	}

	// 매개변수가 없고 반환 값이 있는 메소드
	public String method2(){
		// 메소드의 특정 기능을 수행한 후에
		// 선언된 반환 자료형에 해당하는 값을
		// 돌려주는 메소드
		String str = "매개변수가 없고 반환값이 있는 메소드입니다.";
		
		return str;
	}
	
	// 3. 매개변수가 있고, 반환값이 없는 메소드
	public void method3(int num1, int num2){
		// 주어진 매개변수를 활용하여
		// 특정 기능을 수행하는 메소드
		System.out.println(" sum : "+(num1 + num2));
	}
	
	// 4. 매개변수도 있고, 반환값도 있는 메소드
	public int method4(int num1, int num2){
		// 매개변수로 받은 num1 과 num2를 활용하여
		// 특정 기능을 수행하고 그 결과를 int형으로
		// return 뒤에 작성하여 반환하는 메소드
		
		return num1 + num2;
	}
}








