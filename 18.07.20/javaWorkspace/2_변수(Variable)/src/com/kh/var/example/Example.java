package com.kh.var.example;

import java.util.*;

public class Example {
	
	public void example1(){
		// 입력 받아야 한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(num1 + num2));
		System.out.println("빼기 결과 : "+(num1 - num2));
		System.out.println("곱하기 결과 : "+(num1 * num2));
		System.out.println("나누기 결과 : "+(num1 / num2));
		System.out.println("나머지 결과 : " + (num1 % num2));
	}
	
	public void example2(){
		
		// 가로, 세로 값을 실수형으로 입력받아
		// 사각형의 면적과 둘레를 계산하여 출력
		// 계산공식 - 면적 : 가로 * 세로
		//	둘레 : (가로 + 세로) * 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 길이 : ");
		double height = sc.nextDouble();
		
		double result1 =  width * height;
		double result2 = (width + height) * 2;
		
		System.out.println("면적 : " + result1);
		System.out.println("둘레 : " + result2);
	}
	
	public void example3(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영단어를 입력하세요 : ");
		String str = sc.next();
		
		System.out.println("첫번째 문자 : "+ str.charAt(0));
		System.out.println("두번째 문자 : "+ str.charAt(1));
		
		//   ... 
		//   ... 
	}
}












