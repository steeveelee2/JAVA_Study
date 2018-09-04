package com.kh.interfaceTest.model.vo;

public class Product {
	
	public Product(){}
	
	public void printProduct(){
		System.out.println("제품 정보 조회 메소드");
	}
	
	@Override
	public String toString(){
		return "Product toString() 메소드 실행";
	}
	
	// 추상 메소드
	// 구현부인 {}가 없고 단순 메소드의 헤더만 정의된 메소드
	// 직접 가져다 사용할 수는 없으나 상속 받는 자식 클래스에게 해당 내용을 구현할 수 있게 강제화를 시켜주는 역할
	

}
