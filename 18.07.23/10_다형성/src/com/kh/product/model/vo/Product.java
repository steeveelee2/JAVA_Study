package com.kh.product.model.vo;

// final : 종단 클래스, 자식을 만들지 못하게 막는 클래스
// abstract : 미완성 클래스, 사용하기 위해서는 반드시 자식클래스를 필요로 하며 직접 객체를 new로 생성하지 못한다
// 			   만약 클래스 내에 미완성 메소드가 하나라도 존재할 경우 반드시 클래스 앞에 이 예약어를 붙여야 한다
public abstract class Product {
	// 필드 선언
	private String modelName;
	private int price;
	
	public Product(){
		this.modelName="모델 없음";
		this.price=50000;
	}

	public Product(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// 공통적인 기능
	
	public void powerOn(){
		System.out.println("전원을 켭니다");
	}
	
	public void powerOff(){
		System.out.println("전원을 끕니다");
	}
	
	// 만약 내부에서 실행될 내용을 굳이 구현할 필요가 없으나 다른 자식 클래스들에게 규칙을 ㅈ공하고자 할 경우 미완성된(abstract) 예약어를 사용하여 
	// 자식이 이 메소드를 사용하고자 할 경우 반드시 직접 구현하여(재정의) 사용할 수 있도록 하는 예약어
	public abstract void display(); // 구현부가 필요없다
	
}
