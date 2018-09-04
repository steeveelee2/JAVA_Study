package com.kh.memoryVar;

public class TestMemoryVar {
	// 클래스 바로 밑에 선언하는 변수를
	// 멤버변수 / Field 라고 표현한다.
	// 이렇게 생성된 변수는 Heap 메모리 영역에 담긴다.
	// Heap 메모리에 담긴 변수들은 JVM이 정하는 기본값으로
	// 초기화가 이루어진다.
	int num;
	
	public void testMethod(){
		// 메소드 내부에 선언된 변수를
		// 지역 변수라고 말한다.
		// 지역 변수는 Stack 메모리 영역에 저장되며
		// 메소드 호출 시에 생성되고, 메소드가 종료되면
		// 함께 사라진다.
		
		int num1 = 100;
		
		System.out.println("전역변수 num : "+num);
		System.out.println("지역변수 num1 : "+num1);
		
	}
	
	public void testMethod2(){
		int num = 100;
		
		System.out.println("전역변수 num : " + num);
		
	}
	
	
}





