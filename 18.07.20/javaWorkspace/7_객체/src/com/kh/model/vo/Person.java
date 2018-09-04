package com.kh.model.vo;

public class Person {
	// 1. 필드 선언하기
	private String name;
	private int age;  // default는 기본 생략일 경우 선언됨
	private char gender;
	private String email;
	
	// 2. 생성자
	public Person(){ }
	
	public Person(String name, int age, 
			      char gender, String email){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	// 3. 기능 제공 메소드
	
	public void personInfo(){
		// 현재 객체가 가진 정보 출력하는 기능 제공 메소드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("이메일 : " + email);
	}
	
	// Getter와 Setter

	// Getter : 현재 객체의 값을 밖으로 꺼내주는 메소드
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public char getGender(){
		return gender;
	}
	
	public String getEmail(){
		return email;
	}
	
	// Setter : 현재 객체의 값을 밖에서 주는 값으로
	//          변경하는 메소드
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setEmail(String email){
		this.email = email;
		// return;
	}
}





