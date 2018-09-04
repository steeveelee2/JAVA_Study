package com.kh.interfaceTest.model.vo;

import java.io.Serializable;

/* 인터페이스
 * 추상 메소드와 공용으로 사용할 상수들을 한데 묶어 놓은 추상클래스를 인터페이스라고 한다
 * 필드 변수는 반드시 상수만 가능, 메소드는 반드시 추상메소드만 가능
 * 
 * 인터페이스는 클래스를 상속할 수 없다
 * 미완성된 클래스인 인터페이스끼리만 상속관계로 구성할 수 있다
 * 이때, 상속 받고자 하는 인터페이스를 선언할 경우 클래스에서 extends를 사용한 것과 동일하게 extends 인터페이스명 으로 상속받을 수 있다
 */

public interface IProduct extends Serializable {
	// 인터페이스의 필드 상수
	// 인터페이스는 상수를 public static final 로 선언하는 것을 기본으로 하기 때문에 만약 앞의 예약어들을 생략할 경우 자동으로 public static final 예약어를 붙여준다
	public static final int NUM=100;
	int NUM2=200;
	
	//인터페이스의 메소드 선언
	// 메소드는 public abstract를 기본으로 하기 때문에 예약어를 붙이지 않으면 자동으로 public abstract를 붙여준다
	public abstract void abstMethod();	
	void abstMethod2();

}
