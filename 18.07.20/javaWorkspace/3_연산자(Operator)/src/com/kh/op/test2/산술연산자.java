package com.kh.op.test2;

public class 산술연산자 {
	
	public void testMethod(){
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = "
		                   + (num1 + num2));
		System.out.println("num1 - num2 = "
				           + (num1 - num2));
		System.out.println("num1 * num2 = "
				           + (num1 * num2));
		System.out.println("num1 / num2 = "
				           + (num1 / num2));
		System.out.println("num1 % num2 = "
				           + (num1 % num2));
		
		// 문자와 숫자, 문자열과 숫자를 연산할 때 주의사항
		
		System.out.println(10 + 'A'); // 75
		
		System.out.println("10" + 'A'); // 10A
		
		// 1. 30_test
		System.out.println(10 + 20 + "_test");
		
		// 2. 10_test_20
		System.out.println(10 + "_test_"+ 20);
		
		// 3. test_1020
		System.out.println("test_" + 10 + 20);
		
	}
	
}
