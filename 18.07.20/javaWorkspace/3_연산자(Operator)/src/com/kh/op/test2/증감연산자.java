package com.kh.op.test2;

public class 증감연산자 {
	// ++ : 1증가의 의미를 지닌 연산자
	// -- : 1감소의 의미를 지닌 연산자
	
	// 단일로 사용될 경우 값 자체를 증가(감소) 시키는 의미로써
	// 어느 위치에 연산을 해도 동일한 결과가 나온다.
	
	public void testMethod1(){
		int num = 100;
		
		System.out.println("현재 숫자는 ? " + num);
		
		++num; // 전위 연산자
		System.out.println("현재 숫자는 ? " + num);
		
		num++; // 후위 연산자
		System.out.println("현재 숫자는 ? " + num);
		
		--num;
		System.out.println("현재 숫자는 ? " + num);
		
		num--;
		System.out.println("현재 숫자는 ? " + num);
		
	}
	
	public void testMethod2(){
		int num = 10;
		
		// 다른 연산이 먼저 수행된 이후에 증가 처리가 일어난다. 
		int result = num++ + 3;
		
		System.out.println("result : " + result);
		System.out.println("num : " + num);
		
		int num2 = 10;
		
		int result2 = ++num2 + 3;
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
	}

}











