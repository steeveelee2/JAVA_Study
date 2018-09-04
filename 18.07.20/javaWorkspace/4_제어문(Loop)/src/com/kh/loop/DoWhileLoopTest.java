package com.kh.loop;

import java.util.Scanner;

public class DoWhileLoopTest {
	// do-while 문 테스트 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void beforeDoWhile(){
		// 기존의 while문은 실행하는
		// 조건이 참이냐, 거짓이냐에 따라
		// 실행이 절대 되지 않는 경우도 있다.
		// 하지만, Do-While문을 사용하면
		// 처음 한 번은 반드시 실행되는
		// 반복문을 만들 수 있다.
		
		// while문 일 경우
		// while문은 반복에 필요한 조건을
		// 먼저 확인하기 때문에
		// 만약 조건에 false 값이 발생하면
		// 아예 실행이 안될 수도 있다.
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt();
		
		// while(num < 5){
		//	System.out.println("실행 확인!!");
		//	num++;
		// }
		
		// Do-While문일 경우
		// 반복을 수행하기 위한 조건식이 최하단에
		// 위치하기 때문에, 최소한 한 번은 반드시 실행된다.
		do {
			System.out.println("실행 확인 !!");
			num++;
		} while(num < 5);
	}
	
	public void testDoWhile1(){
		// 키보드로 문자열을 입력 받아
		// 화면에 출력하는 것을 반복하기
		// 단, "exit"이라는 문자열을 입력하면
		// 프로그램 종료하기
		
		String str = null; // 컴퓨터 상 아무것도 없는 상태 'null'
		// "10byte, 2000byte"
		// 참조 자료형은 heap 메모리에 값이 저장되며
		// 해당 값이 저장되어 있는 메모리의 주소번지를 넘겨준다.
		// 사람 <-- 거리 --> 사람
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.next();
		
			System.out.println("입력한 문자열은 "+str+" 입니다.");
		} while(!str.equals("exit"));
		
		// 문자열 비교 시
		// " == " 은 현재 값 자체를 비교하는 연산자
		// 이기 때문에 사용할 수 없다.
		// 따라서 문자열 비교 시엔 (참조 자료형 비교 시)
		// .equals() 라는 메소드를 사용한다.
		
	}
	
	public void testDoWhile2(){
		// 문자열 입력 시 
		// 해당 문자열을 출력하기
		// 만약 "exit"이 입력되면
		// 프로그램을 종료하되
		// exit 이라는 문자열을 출력하지 않고
		// 그냥 종료하기
		
		String msg = null;
		
		do{
			System.out.println("문자열 입력(exit이면 종료) : ");
			msg = sc.next();
			
			if(msg.equals("exit")){
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("입력한 문자열 : "+ msg);
			}
			
		}while(true);
		
	}
}











