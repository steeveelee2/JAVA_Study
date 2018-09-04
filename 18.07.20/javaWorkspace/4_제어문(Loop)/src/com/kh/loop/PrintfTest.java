package com.kh.loop;

import java.util.Scanner;

public class PrintfTest {
	
	public void testMethod(){
		// printf 테스트용 메소드
		
		// 점수를 입력 받아
		// 90 점 이상이면 A 학점
		// 80 점 이상이면 B 학점
		// 70 점 이상이면 C 학점
		// 70 점 미만이면 "재수강"
		// 이라고 출력하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력 하세요 : ");
		int score = sc.nextInt();
		String grade = "";
		
		if(score > 89) {
			grade = "A학점";
		} else if ( score > 79 ) {
			grade = "B학점";
		} else if ( score > 69 ) {
			grade = "C학점";
		} else {
			grade = "재수강";
		}
		
		System.out.printf("당신의 점수는 %d 점이고,"
			+ " 학점은 %s입니다. \n", score, grade);
		
		// printf 포맷 형식
		// 앞에서 사용한 포맷문자(%a)와 
		// 같은 개수의 변수와, 같은 자료형을
		// 통해 원하는 형식으로 출력하기 위한
		// 사용자 정의 포맷 출력문을 
		// printf() 메소드로 구현이 가능하다.
		// println() 메소드와는 달리
		// 별도의 줄바꿈(개행)이 일어나지 않는다.
		
		// 포맷문자
		// %d : 정수형 값 ( 10진수 )
		// %o : 정수형 값 ( 8진수 )
		// %x : 정수형 값 ( 16진수 )
		// %f : 실수형 값
		// %e : 지수표현식
		// %c : 문자형 값
		// %s : 문자열 값
		// %b : 논리형 값
		// %5d : 5칸을 먼저 확보하고 오른쪽 정렬
		// %-5d : 5칸을 확보하고 왼쪽 정렬
		// %.2f : 소수점 2자리까지 표현하겠다
		// %% : 일반 문자 '%'로 표현  
		
		// 특수문자 (escape 문자)
		// tab      : \t 
		//     - 정해진 길이만큼 띄어쓰기
		// new line : \n 
		//     - 다음 줄로 줄바꿈을 해주는 특수문자
		// 작은 따옴표 : \'
		//     - 화면에 작은 따옴표를 문자로 표현
		// 큰 따옴표 : \"
		//	   - 화면에 큰 따옴표를 문자로 표현
		// 유니코드 : \u0001 
		//  - 화면에 유니코드로 문자를 작성할 때 사용
		// 역 슬래시 : \\
		//     - 화면에 역 슬래시를 표현
	}
}












