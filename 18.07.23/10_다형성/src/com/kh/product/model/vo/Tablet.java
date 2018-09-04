package com.kh.product.model.vo;

public class Tablet extends Product {
	
	private boolean usablePen;
	
	public Tablet(){}

	public Tablet(String modelName,int price) {
		super(modelName,price);
	}

	public boolean getUsablePen() {
		return usablePen;
	}

	public void setUsablePen(boolean usablePen) {
		this.usablePen = usablePen;
	}
	
	@Override
	public void display(){
		System.out.println("잘되나 끄적여 봅니다");
	}
	

}
