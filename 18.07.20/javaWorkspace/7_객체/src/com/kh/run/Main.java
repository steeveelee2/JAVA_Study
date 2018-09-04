package com.kh.run;

import com.kh.model.vo.*;

public class Main {

	public static void main(String[] args) {
		// 실행용 메소드
		// 객체를 선언하여 사용하는 방법
		// 클래스명 변수명 = new 생성자 메소드();
		
		// 1. 기본 생성자를 사용한 경우
		/*Human h1 = new Human();
		
		System.out.println("h1 객체 메모리 할당 확인 : "
							+h1.hashCode());
		
		h1.myNameIs();
		
		// 2. 사용자 정의 생성자를 사용한 경우
		Human h2 = new Human("고길동");
		
		System.out.println("h2 객체 메모리 할당 확인 : "
							+h2.hashCode());
		
		h2.myNameIs();
		*/
		
		Person p1 = new Person();
		Person p2 = new Person(
				"홍길동", 15 , 'M', "test@test.com");
		
		p1.personInfo();
		p2.personInfo();
		
		p2.setName("고길동");
		
		p2.personInfo();
		
		System.out.println("p2의 나이 : "+p2.getAge());
	}
}






