package com.kh.op.test2;

import java.util.*;

public class 논리부정연산자 {
	// !논리값 : 해당하는 논리값을 반대로 바꾸는 연산자
	// !true => false, !false => true
	
	public void testMethod(){
		
		System.out.println("true의 부정 : "+ !true);
		System.out.println("false의 부정 : "+ !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력하기 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수인가 ? "
		                 +(num % 2 == 0));
		System.out.println("입력한 정수가 짝수인가 ? "
				         +!(num % 2 != 0));
		
		System.out.println("입력한 정수가 양수인가? "
				         +(num > 0));
		System.out.println("입력한 정수가 양수인가? "
		                 +!(num < 0));
	}
}


