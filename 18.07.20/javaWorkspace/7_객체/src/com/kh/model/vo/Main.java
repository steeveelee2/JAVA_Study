package com.kh.model.vo;

public class Main {

	public static void main(String[] args) {
		// Person 접근하기
		
		// 클래스 : 객체를 찍어내기 위한 설계도
		// 참조 자료형 변수 : 객체
		// 객체의 실체화 : Instanciate
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println("p1.hashCode() : "
				+p1.hashCode());
		
		System.out.println("p2.hashCode() : "
				+p2.hashCode());
		
		/*p1.age = 10;
		p1.email = "test@test.com";
		p1.gender = 'M';*/
		
		p1.personInfo();
	}

}








