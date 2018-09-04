package com.kh.poly.model.vo;

public class Child3 extends Parents{
	
	public Child3(){}
	
	@Override
	public void sayMyName(){
		System.out.println("나는 세번째 자식입니다");
	}
	
	public void sing(){
		System.out.println("딴따라임");
	}

}
