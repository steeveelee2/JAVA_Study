package com.kh.loop;

import java.util.Scanner;

public class ForLoopTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void beforeForLoop(){
		
		System.out.println("Hello World");
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		// . . . //
		
	}
	
	public void testForLoop1(){
		// 반복문
		// 어떠한 문자, 혹은 계산식,
		// 혹은 반복할 수 있는 코드를
		// 직접 작성하지 않고
		// 컴퓨터를 통해서 자동으로 
		// 반복을 수행시키는 문법
		// 
		// ★ 1. For 문
		// ★ 2. While 문
		//   3. Do-While 문
		// 
		
		// For 문
		// 사용형식
		// for(시작할 변수 ; 끝값 비교 조건식 ; 증감식){...}

		// 1부터 10까지의 합을 구하세요.
		
		// 일반 연산
		// System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		// for문 사용하여 반복을 수행할 경우
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			// sum = sum + 1;
			// sum += 1;
			System.out.println("값 확인 : "+ i);
			
			// sum = sum + i;
			sum += i;
			
		}
		
		System.out.println("sum = " + sum);
		
	}
	
	public void testForLoop2(){
		// For문의 특징
		// 반복 횟수가 정해져 있을 때 사용하는 반복문
		
		// 단순 반복 확인 (기본 형식)
		// 0 ~ 9 ( 10회 반복 )
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		// 1 ~ 5 까지 단순 출력
		for(int i = 1 ; i < 6; i++){
			System.out.println("반복 회수 확인 : " + i);
		}
		
		System.out.println("------------");
		
		// 5 ~ 1 까지 단순 출력
		for(int i = 5; i > 0 ; i--){
			System.out.println("반복 회수 확인 : " + i);
		}
		
		// 1 ~ 10 까지의 합
		int sum = 0;
		
		for(int i = 1 ; i <= 10; i++){
			sum = sum + i;
		}
		
		System.out.println("sum 값 : "+ sum);
	}
	
	public void testForLoop3(){
		// for 반복문 응용하기 1
		
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// . . . 
		// 2 * 8 = 16
		// 2 * 9 = 18
		
		// 구구단 2단 출력하기
		for(int i = 1; i < 10 ; i++){
			System.out.println("2 * "+ i +" = "+ (2*i));
		}
		
		// for문 안에 if문을 사용해서
		// 1부터 10까지 중 홀수들의 합을 구하기
		int sum = 0;
		
		for(int i = 1 ; i < 11 ; i++){
			if(i%2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("1부터 10까지 중 홀수들의 합 : "+ sum);
		
		// for문 만을 활용하여 홀수들의 합 구하기
		int sum2 = 0;
		
		for(int i = 1 ; i < 11 ; i += 2){
			sum2 += i;
		}
		
		System.out.println("1부터 10까지 홀수들의 합 : "+sum2);
		
		// 1 부터 100까지의 짝수들의 합
		// if문 없이 작성해 보세요.
		// --- 조건 구하기 --- (방청소 순서 정하기)
		// 1. for문 을 사용할 것
		//     - 초기값
		//     - 조건식 (몇까지 갈 것인가?)
		//     - 증감식 (몇 씩 증가시킬 것인가?)
		// 2. 초기값 
		//     int i = 2
		// 3. 조건식
		//     i <= 100 / --> i < 101
		// 4. 증감식 
		//     i + 2 /--> i = i + 2
		///--> i += 2
		// 
		// 5. int sum; 
		// 
		// 6. sum = sum + i;
		//    sum += i;
		
		int sum3 = 0;
		
		for(int i = 2; i < 101; i += 2){
			sum3 += i;
		}
		
		System.out.println("결과 : "+sum3);
		
	}
	
	public void testForLoop4(){
		// for문 응용하기 2
		
		// 실습 1
		// 정수 하나를 입력 받아
		// 1부터 해당 숫자까지의 합을 구하세요.
		
		System.out.println("정수 입력 : ");
		
		int num = sc.nextInt(), sum = 0;
		
		for(int i = 1; i <= num; i ++){
			sum += i;
		}
		
		System.out.println("sum : "+ sum);
		
		// 실습 2
		// 한 자리의 수를 입력 받아
		// 1 부터 해당 숫자까지의 짝수들의 합을
		// 구해 보세요.
		System.out.print("한 자리 정수 입력 : ");
		int num2 = sc.nextInt();
		int sum2 = 0;
		
		if (num2 > 0 && num2 < 10) {
			for(int i = 2; i < num2 ; i+=2){
				sum2 += i;
			}
			
			System.out.println("합계 : "+ sum2);
			
		} else {
			System.out.println("한 자리의 정수를 입력해 주세요!");
		}
		
		// 실습 3
		// 한 자리의 수(2~9)를 입력 받아
		// 해당 숫자에 맞는 구구단을 출력해보세요.
		//
		// -- 출력 양식 --
		// ----- N 단 -----
		//  N * 1 = M
		//  N * 2 = M
		//   . . .

		System.out.print("한 자리의 수를 입력(2~9) : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9){
			System.out.println("----- " + dan + " 단 -----");
			for(int i = 1; i < 10; i++){
				System.out.println(dan+" * "+i
						+" = "+(dan*i));
			}
		} else {
			System.out.println("지원하지 않는 정수 입니다.");
		}
		
	}
}















