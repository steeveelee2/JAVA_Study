package com.kh.method;

public class OverloadingTest {
	// 오버로딩(Overloading)
	// 다른 매개변수를 가진 같은 이름의 메소드를 선언하는 기법
	//
	// 일반적으로 메소드는 주어진 매개변수를
	// 사용하여 정해진 소스를 실행하는 기능 제공의 의미를
	// 지니고 있다.
	// 하지만, 동일한 역할을 수행하는 메소드라면
	// 이름을 굳이 나누지 않고 사용할 경우
	// 하나의 메소드 명으로 동일한 작업을 수행할 수 있는데,
	// 이렇게 같은 이름의 메소드 이름을 가지고 
	// 여러 종류의 메소드 내용을 구현하는 것을
	// 오버로딩이라고 한다.
	// Ex) public int sum(){
	//        
	//     }
	//     public double doubleSum(){
	// 
	//     }
	//     public long longSum(){
	//
	//     }
	
	// 1. 오버로딩 샘플
	public void printZero(){
		System.out.println("0 입니다.");
	}
	
	public int printZero(int num){
		return 0;
	}
	
	// 2. 덧셈에 대한 오버로딩
	public int sum(int num1, int num2){
		return num1+num2;
	}
	
	public double sum(double num1, double num2){
		return num1 + num2;
	}
	
	// *** 주의할 점
	//  * 1. 메소드 명은 반드시 같아야 한다.
	//  * 2. 매개 변수의 갯수나 자료형, 선언 순서가
	//       반드시 달라야 한다.
	//  * 3. 반환자료형이나 접근제한자는 오버로딩과 상관이 없다.
	
	public double sum(int num1, double num2){
		return num1 + num2;
	}
	
	public double sum(double num1, int num2){
		return num1+num2;
	}
	
	public double sum(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	// 에러가 발생하는 경우
	// 1. 매개변수도 같고, 메소드 명도 같은 경우
	//    컴파일러가 에러를 발생시킨다.
	/*public int sum(int num1, int num2){
		return num1 + num2;
	}*/
	
	// 2. 반환자료형만 다른 경우, 오버로딩 조건에 성립되지 않는다. 
	// == 반환 자료형은 오버로딩과 관련이 없다.
	/*public int sum(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}*/
	
	// 3. 접근 제한자는 오버로딩과 관련이 없다.
	/*private double sum(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}*/
}