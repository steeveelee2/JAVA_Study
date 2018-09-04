package com.kh.array;

import java.util.Scanner;

public class ArrayExercise {
	// 배열 실습
	
	Scanner sc = new Scanner(System.in);
	
	public void testExercise1(){
		// int형 배열 1개를 생성해서
		// 값을 추가하기 (5부터 1까지)
		
		int[] arr = {5, 4, 3, 2, 1};
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println("값 확인 : "+arr[i]);
		}
		
	}
	
	public void testExercise2(){
		// 문자열을 반복해서 입력받아서
		// 크기가 5인 문자열 배열에 저장하고
		// 배열이 가득 찼을 때 저장한 값을 출력하고
		// 종료하는 프로그램
		String[] arr = new String[5];
		
		// 입력문
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print("값 입력 : ");
			arr[i] = sc.next();
		}
		
		// 출력문
		// for(int i = 0; i)
		
	}
	public void testExercise3(){
		// 길이가 5인 정수 배열을 하나 만들고
		// 100, 200, 300, 400, 500 의 값으로
		// 초기화 한 뒤 숫자를 입력 받아 해당하는
		// 숫자에 맞는 배열의 순번을 출력하고
		// 만약 없다면 "입력한 숫자는 없습니다." 출력
	}
	public void testExercise4(){
		// 문자열을 입력 받아
		// 해당 문자열을 문자 배열에 저장하고
		// 이 배열을 활용해서
		// 문자열을 반대로 출력하는 프로그램
	}
}










