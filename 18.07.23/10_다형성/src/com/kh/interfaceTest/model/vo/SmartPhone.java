package com.kh.interfaceTest.model.vo;

import java.io.Serializable;

/*-상속
 * 추상클래스, 일반클래스 : extends
 * 인터페이스 : implements * 
 */

public class SmartPhone extends Product implements IProduct,Serializable {

	@Override
	public void abstMethod() {
		// 메소드의 강제화
		// 부모가 미완성한 메소드로 미완성된 구현부를 자식으로써 완성해야 한다.

	}

	@Override
	public void abstMethod2() {
		// TODO Auto-generated method stub
		
	}

}
