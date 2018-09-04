package com.kh.array;

import java.util.Arrays;
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
			
			if(i == arr.length - 1) System.out.println("---- 문자열 입력 끝! ----");
		}
		
		// 출력문
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("출력 결과 : "+arr[i]);
		}
		
	}
	public void testExercise3(){
		// 길이가 5인 정수 배열을 하나 만들고
		// 100, 200, 300, 400, 500 의 값으로
		// 초기화 한 뒤 숫자를 입력 받아 해당하는
		// 숫자에 맞는 배열의 순번을 출력하고
		// 만약 없다면 "입력한 숫자는 없습니다." 출력
		
		int[] arr = {100, 200, 300, 400, 500};
		
		System.out.print("숫자를 입력 하세요 : ");
		int selectNum = sc.nextInt();
		
		for(int i = 0; i < arr.length ; i++) {
			
			if(arr[i] == selectNum) {
				System.out.println(i+"번째 인덱스에 들어 있습니다.");
				break;
			} 
			
			if(i == arr.length - 1) {
				System.out.println("입력한 숫자는 없습니다.");
			}
		}
		
		// 자바에서 제공하는 배열 관련 클래스 (Short Hands)
		// Arrays.binarySearch() 메소드를 이용한다면...
		// System.out.println(((index = Arrays.binarySearch(new int[]{100, 200, 300, 400, 500}, sc.nextInt())) > -1) ? index + "번째 인덱스에 있습니다." : "입력한 숫자는 없습니다.");
		
	}
	public void testExercise4(){
		// 문자열을 입력 받아
		// 해당 문자열을 문자 배열에 저장하고
		// 이 배열을 활용해서
		// 문자열을 반대로 출력하는 프로그램
		
		System.out.print("문자열을 입력 하세요 : ");
		String str = sc.next();
		char[] chArr = new char[str.length()];
		
		// 문자 배열에 입력하는 부분
		for(int i = 0 ; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		
		// 문자 배열로 출력하는 부분
		System.out.print("결과 확인 : ");
		for(int i = str.length() - 1 ; i > -1 ; i--) {
			System.out.print(chArr[i]);
		}
	}
}










