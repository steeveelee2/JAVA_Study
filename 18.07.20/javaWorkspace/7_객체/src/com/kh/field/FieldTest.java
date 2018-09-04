package com.kh.field;

public class FieldTest {
	// 필드 예약어 사용하기
	// 필드 static 테스트
	
	// 공유 용도로 사용할 수 있는 변수
	// static 영역은 모든 객체가 공유할 목적으로
	// 사용하기 때문에 캡슐화 원칙에 위배된다.(private이 아니다.)
	// 프로그램 실행 시에 static 키워드가 붙은 필드 변수들은
	// 전부 정적 메모리(static)에 저장되기 때문에
	// 특별한 용도 이외에는 많이 사용하지 않는다.
	public static int num;
	
	// final은 상수 선언 시에 사용하며,
	// 초기화 값을 기입하지 않으면 JVM이 명시한 초기값이
	// 들어가기 때문에 반드시 초기값을 직접 기입하여
	// 상수로 사용하는 목적을 분명히 해야 한다.
	public final int FINAL_NUM = 10;
	
	// 일반적으로 상수를 선언할 때에는
	// 공유용도로 사용하는 static 예약어도 함께 붙여 사용한다.
	public static final double PI_1 = 3.14;	
	
	// static과 final 순서는 변경되어도 상관없다.
	public final static double PI_2 = 3.14;
	
	// non-static method
	// 객체가 만들어져야 접근이 가능한 메소드
	public void testField1(){
		// 지역변수들은 stack에 저장되어 관리하기 때문에
		// static 예약어를 붙일 수 없다.
		// static int num = 10;
	}
	
	// static-method
	// 프로그램이 실행될 때 생성되는 공용 메소드
	public static void testField2(){
		// 공유용도인 static 메소드에서도 
		// static 예약어가 붙은 변수는 사용할 수 없다.
		// 지역변수는 메소드가 호출될 때, 생성이 되면서
		// stack 영역에 저장이 되기 때문에
		// 메모리 생성 위치가 전혀 다르다.
		// 따라서 지역 변수로는 static을 선언할 수 없다.
		// static int num = 10;
	}
	
	
	
	
	
	
}
