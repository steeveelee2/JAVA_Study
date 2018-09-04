package com.kh.product.model.vo;

public class Tv extends Product {
	
	private int channel=1;
	
	public Tv(){}
	
	public Tv(String modelName,int price){
		super(modelName,price);
	}
	
	public int setChannel(){
		return channel;
	}
	
	public void setChannel(int channel){
		this.channel=channel;
	}
	
	@Override
	public void display(){
		System.out.println(channel+"번 채널을 보여줍니다");
	}

}
