package com.kh.loop;

import java.util.*;

public class BeforeLoopTest {
	// 
	// 
	public void beforeTest(){
		// 제어문에서 하나의 조건으로
		// 활용하기 위한 조건식 실습
		
		int num1 = 10;
		double num2 = 10.0;
		
	}
	
	public void beforeTest3(){
		// 참, 거짓에 따른 조건에 대한
		// 결과를 도출하는 연산자
		// OPERLAND(피연산자, 항) 3개
		
		// 삼항 연산자를 사용한 경우
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나를 입력 하세요 : ");
		int num = sc.nextInt();
		
		// String result = (num > 0) ? "양수다" : "양수가 아니다";
		
		// System.out.println("입력하신 숫자는 " +result);
		
		// 조건을 처리하기 위한 if 조건문
		// 사용법 :: if( 조건식 ) { 실행할 내용 }
		// 만약 실행할 내용이 한 줄일 경우,
		//  if ( 조건식 ) 실행할 내용; 의 형태로 사용이 가능하다.
		
		// 조건문 if 를 사용하여 해당 조건이 참일 경우
		// 실행할 내용을 작성하면 된다.
		
		/*if( num > 0 ) { // -- if문 시작
			
			System.out.println("입력하신 숫자는 양수입니다.");
			
		} else {
			
			// if문 조건에 해당되지 않을 경우
			// 실행하는 구문을 작성하면 된다.
			System.out.println("입력하신 숫자는 양수가 아닙니다.");
			
		}*/
		
		// 표현하고자 하는 구문이 3개 이상일 경우
		// if-else if 구문이라는 형태로 구현한다.
		
		if( num > 0){
			
			System.out.println("양수");
		
		} else if ( num == 0) {
			
			System.out.println(" 0 ");
		
		} else {
			
			System.out.println("음수");
		}
		
	}
}


















