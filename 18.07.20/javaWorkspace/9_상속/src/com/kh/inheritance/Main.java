package com.kh.inheritance;

public class Main {

	public static void main(String[] args) {
		// 상속 테스트용 실행 메소드
		// 부모 클래스 정보 확인
		Parents p = new Parents();
		p.printStr();
		
		// 자식 클래스 정보 확인
		Child1 c1 = new Child1();
		c1.printStr();
		
		Child2 c2 = new Child2();
		c2.printStr();
		
	}

}
