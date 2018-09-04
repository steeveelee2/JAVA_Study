package com.kh.loop;

import java.util.*;

public class IfTest {
	// if 구문은 특정 조건을 만족하는 경우
	// 실행할 구문을 구현하는 조건문으로써
	// 하나의 조건에 대해서 여러가지의 경우를
	// 구현해야 하는 경우 사용한다.
	
	public void testIfMethod1(){
		// 기본적인 if문
		// 나이를 입력 받아
		// 19세 이상일 경우 성인입니다.
		// 19세 미만일 경우 미성년자입니다.
		
		Scanner sc
		   = new Scanner(System.in);
		
		// 안내 문구
		System.out.print("나이를 입력 하세요 : ");
		
		int age = sc.nextInt();
		
		if(age > 18){
			
			System.out.println("성인입니다.");
			
		} else {
			
			System.out.println("미성년자입니다.");
					
		}
		
		
	}
	
	public void testIfMethod2(){
		// 조건에 따른 결과가 3개 이상일 경우
		// 국어, 영어, 수학 점수를 입력 받아
		// 평균에 따른 학점을 출력하는 프로그램
		// 
		// 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		// 평균이 60점 미만이면 F
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int sum = (kor + eng + mat);
		int avg = sum / 3;
	
		String grade = "";
		
		if( avg > 89 ) {
			
			grade = "A";
		
		} else if ( avg > 79 ) {
			
			grade = "B";
			
		} else if ( avg > 69 ) {
			
			grade = "C";
			
		} else if ( avg > 59 ) {
			
			grade = "D";
			
		} else {
			
			grade = "F";
			
		}
		
		// System.out.println("당신의 학점은 "+grade+" 입니다.");
		System.out.printf("당신의 학점은 %s 입니다.\n", grade);
		
	}
	
	public void testIfMethod3(){
		// if문을 활용하여 메뉴판 만들기
		// 과일
		
		// 1. 메뉴판을 화면에 출력하기
		System.out.println("-- OOO의 과일 가게 ver1.0 --");
		System.out.println("1. 사과 ");
		System.out.println("2. 바나나");
		System.out.println("3. 토마토");
		System.out.println("4. 배");
		System.out.println("5. 오렌지");
		System.out.println("-------------------------");
		
		// 2. 사용자에게 메뉴를 고르게 하기
		// 안내 문구
		System.out.print("원하는 과일 번호를 선택하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt();
		
		if ( select == 1) { 
			
			System.out.println("사과를 선택하셨습니다.");
			
		} else if (select == 2) {
			
			System.out.println("바나나를 선택하셨습니다.");
			
		} else if (select == 3) {
			
			System.out.println("토마토를 선택하셨습니다.");
			
		} else if(select == 4) {
			
			System.out.println("배를 선택하셨습니다.");
			
		} else if(select == 5) {
			
			System.out.println("오렌지를 선택하셨습니다.");
			
		} else {
			
			System.out.println("잘못된 선택입니다.");
			
		}

	}
	
	public void testIfMethod4(){
		// 다중 if문
		// 학생의 점수를 입력받아서
		// 90점 이상이면 A
		// 80점 이상이면 B
		// 70점 이상이면 C
		// 70점 미만이면 F
		// ** 단 F학점 이상이고,
		// 각 점수가 5점이상이면 '+'를 추가하기
		
		Scanner scan = new Scanner(System.in);
		
		// 안내문구
		System.out.print("학생의 점수를 입력하세요 : ");
		
		int score = scan.nextInt();
		
		String grade = "";
		
		if(score > 89) {
			
			grade = "A";
			
			if( score%10 > 4 || score == 100){
				grade += "+"; // grade = grade + "+";
			}
			
		} else if(score > 79){
			grade = "B";
			
			if ( score%10 > 4 )	grade += "+";
			
		} else if(score > 69) {
			grade = "C";
			
			if ( score%10 > 4) grade += "+";
			
		} else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 "+grade+" 학점입니다.");
		
	}
	
	
	
}












