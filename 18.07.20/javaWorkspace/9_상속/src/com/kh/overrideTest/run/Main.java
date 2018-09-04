package com.kh.overrideTest.run;

import com.kh.overrideTest.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		// 오버라이딩 테스트
		Book bk1 = new Book("어린왕자", "생텍쥐페리", 15000);
		Book bk2 = new Book("자바의 정석", "남궁성", 30000);
		Book bk3 = new Book("자바의 정석", "남궁성", 30000);
		
		// 그냥 참조 변수만을 출력하는 경우, 뒤에 .toString()이 생략되어 들어간다.
		System.out.println(bk1);
		System.out.println(bk1.toString());
		
		// equals 메소드 사용하기
		System.out.println("bk1 == bk2 ? "+ bk1.equals(bk2));
		System.out.println("bk2 == bk3 ? "+ bk2.equals(bk3));
	}
}