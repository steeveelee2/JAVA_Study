package com.kh.loop;

import java.util.Scanner;

public class WhileLoopTest {
	// While 반복문 테스트 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void beforeWhileLoop(){
		
		// 1부터 10까지의 합을 구하세요.
		for(int i = 1; i <= 10; i++){
			// ...
		}
		
		// while 문은 특정 조건식만 일치하면
		// 계속 반복하는 특성이 있다.
		// 사용 방법
		// while(조건식){
		//   // . . .
		// }
		
		while(true){
			System.out.println("Hello While Loop!!");
		}
	}
	
	public void testWhileLoop1(){
		// for문은 특정 범위 안에 반복을 수행할 때
		// 사용하는 반복문 이지만,
		// while 문은 조건만 충족 시키면 계속
		// 반복하는 무한 반복문이다.
		//
		// 특정 조건을 위해 조건식에 들어가는 
		// 변수를 먼저 선언하고 사용한다.
		
		// 1부터 10까지 정수의 합
		int i = 1, sum = 0;
		
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		
	}
	
	public void testWhileLoop2(){
		// 문자열을 입력 받아서
		// 문자열의 인덱스(각 문자의 자리수)만큼
		// 문자를 출력하기
		
		System.out.print("문자열을 입력 : ");
		String str = sc.next();
		
		// zero-index
		int index = 0;
		while(index < str.length()){
			// 정해진 횟수가 존재하지 않을 때
			// 정해진 만큼 반복하지 않을 때
			// 반복 횟수가 부정확할 때 사용하는 반복문
			
			System.out.println(index+"번째 문자 : "+ str.charAt(index));
			index++;
		}
	}
	
	public void testWhileLoop3(){
		// 1부터 입력받은 수까지의 합 계산
		
		int sum = 0;
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i <= num){
			if( i != num){
				System.out.print(i+ " + ");
			} else {
				System.out.println(i);
			}
			
			sum += i;
			i++;
		}
		
		System.out.println("정수들의 합 : "+ sum);
		
	}
	
	public void testWhileLoop4(){
		// while 반복문 중첩 사용하기
		// 2 ~ 9단까지 구구단 전부 출력하기
		
		int dan = 2;
		
		while(dan < 10){ // 각 단을 반복
			System.out.println("--- "+dan+"단 ---");
			int su = 1;
			
			while(su < 10){ // 각 단에 대한 1 ~ 9 배수 출력
				System.out.println(
				  dan+ " * "+su+" = "+ (dan * su));
				su++;
			}
			
			System.out.println("-----------------");
			dan++;
		}
	}
	
	public void testWhileLoop5(){
		// while문 이중 반복을 통한
		// 직사각형 * 찍기
		// 가로, 세로 길이를 입력받아
		// 직사각형의 별 찍기
		
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		int r = 1;
		
		while(r <= row){
			// 세로 반복 ( row )
			
			int c = 1;
			while(c <= col){
				// 가로 반복 ( col )
				
				if(c != col){
					System.out.print("*");
				} else {
					System.out.println("*");
				}
				
				c++;
			}
			
			r++;
		}
		
	}
	
	public void testWhileLoop6(){
		// * 직각 삼각형으로 출력하기
		
		/*System.out.print("줄 수 : ");
		int row = sc.nextInt();
		
		int r = 1;
		while(r <= row){
			// 세로 길이 담당
			int c = 1;
			while(c <= r){
				if(c == r){
					System.out.println("*");
				} else {
					System.out.print("*");
				}
				c++;
			}
			r++;
		}*/
		
		// 마지막 칸에는 숫자 표기하기
		//
		// 1
		// *2
		// **3
		// ***4
		// ****5
		//
		
		System.out.print("줄 수 : ");
		int row2 = sc.nextInt();
		
		int r2 = 1;
		while(r2 <= row2){
			// 세로 길이 담당
			int c = 1;
			while(c <= r2){
				if(c == r2){
					System.out.println(r2);
				} else {
					System.out.print("*");
				}
				c++;
			}
			r2++;
		}
	}
	
	public void testWhileLoop7(){
		// for문과 while문은 서로
		// 변경이 가능하다.
		
		// for --> while
		
		// 1 ~ 5 까지의 합
		int sum = 0;
		/*for(int i = 1; i <= 5; i++){
			sum += i;
		}*/
		
		int i = 1;
		while(i <= 5){
			sum += i;
			i++;
		}
		
		
		// while --> for
		
		/*while(true){
			sum += 1;
		}*/
		
		for(;true;){
			sum += 1;
		}
	}
	
}












