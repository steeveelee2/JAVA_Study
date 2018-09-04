package com.kh.member.model.vo;

public class Member {
	/* protected */
	private String name;
	private String grade;
	private int point;
	
	// 공통된 요소를 하나로 모으고,
	// 서로 다른 요소를 배제하여 부모 클래스를 만든다.
	
	// 부모 클래스는 자식을 위해서 생성자를 반드시 정의해야 한다.
	public Member(){}
	
	public Member(String name, String grade, int point){
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public String getName(){
		return name;
	}
	
	public String getGrade(){
		return grade;
	}
	
	public int getPoint(){
		return point;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	public void setPoint(int point){
		this.point = point;
	}
	
	public double getIncen() {
		// 모든 자식들이 사용할 수 있는
		// 포인트 적립율을 계산하는 메소드
		
		// 기본값은 포인트 적립율 없음
		return point * 0.0;
	}
	
}






