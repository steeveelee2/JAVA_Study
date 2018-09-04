package com.kh.method;

public class CallMethodTest {
	// 메소드는 다른 메소드를 호출할 수 있다.
	
	public void method1(){
		System.out.println("메소드1입니다~");
		
		method1();
		
		// method2();
	}
	
	public void method2(){
		System.out.println("메소드2입니다!!");
		
		method3();
	}
	
	public void method3(){
		System.out.println("메소드3입니다...");
	}
	
	// 재귀 호출
	// 하나의 메소드가 자기 자신을 반복적으로 재 호출하는 
	// 구현 기법을 재귀 호출이라고 한다.
	// - 무한 반복이나 메모리 용량 초과, 시스템 자원 누수 등의
	//   문제가 있을 수 있기 때문에 많이 쓰이지는 않지만
	//   만약 반복적인 수학 계산을 수행하거나
	//   규칙적인 업무를 실행할 때 사용할 수 있는
	//   반복 효과를 지닌 코드 기법이다.
	
	// Factorial
	// 3! = 3 * 2 * 1;
	
	public int factorial(int num){
		if(num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}








