package com.kh.op.test2;

public class 비교연산자 {
	/*
	 * @ 비교연산자 (=관계 연산자)
	 * --> 두 개의 변수의 관계를 따지는 연산자.
	 *     해당 연산의 조건을 만족하면 true, 
	 *         만족하지 못하면 false
	 *         
	 * < : ex) A < B : A가 B보다 작은가?
	 * > : ex) A > B : A가 B보다 큰가?
	 * == : ex) A == B : A와 B가 같은가?
	 * != : ex) A != B : A와 B가 다른가?
	 * <= : ex) A <= B : A가 B보다 작거나 같은가?
	 * >= : ex) A >= B : A가 B보다 크거나 같은가?
	 * 
	 */
	
	public void testMethod(){
		
		/*int a = 10;
		int b = 20;*/
		
		int a = 10, b = 20;
		boolean result1, result2, result3;
		
		result1 = (a == b);
		result2 = (a >= b);
		result3 = (a < b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
