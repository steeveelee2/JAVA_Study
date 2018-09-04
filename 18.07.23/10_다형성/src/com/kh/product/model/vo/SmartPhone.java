package com.kh.product.model.vo;

public class SmartPhone extends Product {
	
	private boolean telCheck;
	
	public SmartPhone(){}
	
	public SmartPhone(String modelName,int price){
		super(modelName,price);
	}
		
	public boolean getTelCheck() {
		return telCheck;
	}

	public void setTelCheck(boolean telCheck) {
		this.telCheck = telCheck;
	}

	@Override
	public void display(){
		System.out.println("휴대폰 통화 화면을 보여줍니다");
	}
	
	

}
