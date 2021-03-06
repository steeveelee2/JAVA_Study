package com.kh.inheritance;
/*
 * 상속
 * 
 * - OOP(객체 지향 언어)의 특징 중 하나로,
 *   기존의 클래스를 조상(부모, super)과 후손(자식, sub)으로
 *   나누어 클래스를 재사용할 수 있게 하는 기술을 말한다.
 *   
 * - 두 클래스 이상일 때 서로 관계가 있거나
 *   공통되는 요소가 있을 경우 상하 관계로 나누어 코드의 중복을 줄인다.
 *   
 * - 자식 클래스는 부모의 모든 멤버변수와 메소드를 상속 받는다.
 * ** 단, 생성자와 초기화 블럭은 상속에 포함되지 않는다.
 * 
 * - 자식의 맴버 변수는 부모보다 적을 수 없다.
 * 
 * ** 사용 형식 **
 * [public] class 자식클래스 extends 부모클래스명 {
 *     . . .
 * }
 * 
 * ** Why ? **
 * 여러 클래스간의 공통되는 부분이 있을 경우
 * 이를 상위의 하나의 클래스를 만들어 통합 관리하기 위함이고
 * 
 * 만약 부모로부터 확장된 기능을 가지는 자식이 여럿 있을 경우
 * 자식을 각각 생성하여 class 로 만들지 않고
 * 부모로부터 이어 받아 코드의 재사용성(개발 속도)을 늘리기 위함
 * 
 * 따라서, 부모 클래스의 변화는 자식 클래스에게 영향을 주지만
 * 자식 클래스의 변화는 부모 클래스에게 영향을 주지 않는다.
 * 
 */
public class Parents {
	private int num1;
	private String str1;
	
	public Parents(){
		num1 = 100;
		str1 = "상속 안녕!!!!!";
	}
	
	public void printStr(){
		System.out.println(str1);
	}
	
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public int getNum1(){
		return num1;
	}
	
}













