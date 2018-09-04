package com.kh.poly.model.vo;

public class Child2 extends Parents{
	
	public Child2(){}
	
	@Override
	public void sayMyName(){
		System.out.println("나는 두번째 자식입니다");
	}
	
	public void study(){
		System.out.println("공부 밖에 못함");
	}
}
