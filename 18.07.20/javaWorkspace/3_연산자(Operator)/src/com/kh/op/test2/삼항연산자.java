package com.kh.op.test2;

import java.util.Scanner;

public class 삼항연산자 {
	// 비교 항목이 3개 
	// (조건식) ? "참일 때 값" : "거짓일 때 값"
	// 조건식 반드시 결과가 참, 거짓이 나오게
	// 설정하여 해당하는 값에 대한 결과를
	// 선택하여 대입할 때 사용한다.
	
	public void testMethod(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		
		int num = sc.nextInt();
		
		// 단일 사용의 예
		// String result 
		//   = (num > 0) ? "양수입니다." : "음수입니다.";
		
		// 삼항연산자를 중첩 사용한 경우
		String result
		  = (num > 0) ? "양수" : 
			      (num == 0) ? "0입니다." : "음수입니다.";
		
		System.out.println("결과 확인 : " + result);
		
	}
}






