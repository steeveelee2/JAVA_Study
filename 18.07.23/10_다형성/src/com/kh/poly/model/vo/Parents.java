package com.kh.poly.model.vo;

public class Parents {
	
	protected int inherit;
	protected String lastName;
	
	public Parents(){}
	
	public void sayMyName(){
		System.out.println("나는 부모입니다");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
