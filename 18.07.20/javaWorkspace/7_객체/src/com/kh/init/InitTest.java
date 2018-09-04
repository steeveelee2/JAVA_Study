package com.kh.init;

public class InitTest {
	// 객체 필드를 초기화하는 방법
	// 1. JVM이 명시한 초기값을 사용할 경우
	private int num1; // 0
	
	// 2. 필드 생성과 동시에 직접 초기값을 
	//    대입하여 사용자 명시적 초기화를 수행
	private int num2 = 10;
	
	// [3.] 초기화 필드를 선언하여 값을
	//      초기화 할 경우
	{ // 초기화 필드
	  num1 = 100;
	  num2 = 200;
	  // num3 = 300;
	}
	
	// static 필드의 경우
	private static int num3;
	
	static { // static 전용
		num3 = 10;
		
		// num1 = 100;
	}
	 
	// 4. 생성자를 통해 객체를 생성하며
	//    초기화를 수행한 경우
	// ** 이전에 어떤 값이 들어있든지 간에
	//    생성자를 통해 수행한 초기화가 
	//    가장 마지막으로 발생하며
	//    생성자를 통해 수행한 초기화 값이
	//    해당 필드 변수에 대입된다.
	
	// new를 통해 객체를 생성할 때
	// 사용하는 특별한 메소드
	// 매개변수가 없는 생성자
	public InitTest(){
		// default / 기본 생성자
		num1 = 5;
		num2 = 10;
	}

	// 매개변수가 있는 생성자
	public InitTest(int num1){
		this.num1 = num1;
	}
	
	// Getter & Setter
	public int getNum1(){
		return num1;
	}
	
	public int getNum2(){
		return num2;
	}
	
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public void setNum2(int num2){
		this.num2 = num2;
	}

	public static int getNum3(){
		// static 예약어를 사용하면
		// 주소값을 통한 접근인 this.을 사용할 수 없다.
		return InitTest.num3;
	}
	
	public static void setNum3(int num3){
		InitTest.num3 = num3;
	}
}






