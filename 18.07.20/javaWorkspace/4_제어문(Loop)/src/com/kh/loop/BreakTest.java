package com.kh.loop;

import java.util.Scanner;

public class BreakTest {
	// Break : 분기문의 하나로
	// 반복문 내에서 특정 조건에 해당 되었을 때
	// 해당하는 반복문을 종료하는 목적으로 사용한다.
	// 단, 예외적으로 switch문에서는 해당 case를
	// 실행한 후 switch를 빠져 나가는 목적으로 사용한다.
	//
	// 일반 적으로 조건을 위한 if문과 함께
	// if(조건문) break; 의 형식으로 사용한다.
	
	Scanner sc = new Scanner(System.in);
	
	public void testBreak1(){
		// 문자열을 입력 받아 글자 개수를 출력하는
		// 반복 프로그램
		// 단, "end"가 입력되면 해당 프로그램을 종료
		
		String str = null;
		
		do{
			System.out.print("문자열 입력 : ");
			str = sc.next();
			
			if( str.equals("end") ){
				break; // 반복을 강제 종료하겠다!
			} else {
				System.out.println(
				   "입력한 문자열의 갯수 : "+ str.length());
			}
			
		} while(true);
	}
	
	public void testBreak2(){
		// 숫자를 입력 받아
		// 1부터 해당 숫자까지의 합 구하기
		// 단, for문으로 무한  반복을 구현하여
		// break 를 사용해 빠져 나가기
		
		System.out.println("숫자 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0;;i++){
			sum += i;
			
			if(i == num){
				break;
			}
		}
		
		System.out.println("1부터 입력한 숫자까지의 합은 : " + sum);
	}
	
}











