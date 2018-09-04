package com.kh.poly.model.vo;

public class Child1 extends Parents {
	
	private String firstName;
	@SuppressWarnings("unused")
	private int loan;
	
	public Child1(){}
	
	// 오버라이드 성립 조건
	// 1. 부모 메소드와 반환 자료형, 메소드명, 매개변수타입이 모두 같아야 한다
	// 2. 접근 제한자는 부모 메소드보다 더욱 큰 범위로만 변경할 수 있다
	// 3. 예외를 발생시켜 throws할 경우 부모 메소드의 예외보다 갯수가 많을 수 없다(같거나 적어야 한다)
	@Override
	public void sayMyName(){
		System.out.println("나는 첫번째 자식입니다");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
