package com.kh.animal.model.vo;

public class Dog extends Animal {
	// 1. 필드 변수 | 멤버 변수
	
	// ------ [초기화 블록] ------ (생략 가능)
	
	// 2. 생성자
	
	public Dog(){
		// super(); 생략
	}
	
	public Dog(String name, String type, double weight){
		// 부모 객체에 기술된 생성자를 가져다 쓸 수 있다.
		super(name, type, weight);
	}
	
	// 3. 메소드
	// Alt + Shift + 'S'
	// Generate Getter and Setter

}



