package com.kh.cast.practice;

import java.util.*;

public class CastingSample {
	
	// 키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함
	public void printUniCode(){
		Scanner sc 
		    = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch+" -> "+(int)ch);
		
	}
	
	// 국어, 영어, 수학 세과목의 총점과 평균
	public void calculatorScore(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 점수 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 점수 : ");
		double mat = sc.nextDouble();
		
		int sum = (int)(kor + eng + mat);
		int avg = sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	// 2진수 변환 시 1의 개수
	public void printBitCount(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num+"에(2진수) 포함된 1의 개수 : "
		                   +Integer.bitCount(num));
	}
}







