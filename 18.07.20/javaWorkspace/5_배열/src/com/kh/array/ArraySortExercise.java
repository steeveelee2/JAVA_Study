package com.kh.array;

import java.util.Scanner;

public class ArraySortExercise {
	// 배열 실습 문제 풀어보기
	Scanner sc = new Scanner(System.in);

	public void sortTest1() {
		// 특정 배열을 정렬하기
		int arr[] = { 50, 20, 30, 10, 40 };
		int min, temp;

		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i; j < arr.length; j++) {
				min = (arr[min] > arr[j])? j : min;
			}

			/*temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;*/
			
			swap(arr, min, i);
		}
		
		for(int i = 0; i< arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}

	public void sortTest2() {
		// 사용자로부터 숫자 5개를 입력 받은 뒤
		// 해당 배열을 정렬하여 출력하는 프로그램
		
		int arr[] = new int[5];
		
		// 1. for문을 활용하여 숫자 5개 입력 받기
		for(int i = 0; i < arr.length ; i++){
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		// 2. nextInt() 메소드 특성 활용하기
		// 숫자만 읽고 남은 값은 입력버퍼에 남겨 놓는 특성을
		// 활용하여 입력 한 번에 모두 읽어 오기 
		System.out.println("숫자를 입력하세요 : ");
		System.out.print("각 숫자는 띄어쓰기로 구분하세요  : ");
		// 10 20 30 40 50
		// 10' '20 30 40 50
		int num1 = sc.nextInt();
		// 20' '30 40 50
		int num2 = sc.nextInt();
		// 30' '40 50
		int num3 = sc.nextInt();
		// 40' '50
		int num4 = sc.nextInt();
		// 50
		int num5 = sc.nextInt();
		
		int[] arr2 = {num1, num2, num3, num4, num5};
		
		int min;
		// int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i; j < arr.length; j++) {
				min = (arr[min] > arr[j])? j : min;
			}

			/*temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;*/
			
			swap(arr, min, i);
		}
		
		for(int i = 0; i< arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public void swap(int[] arr, int min, int j){
		
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}
	
	public void sortTest3(){
		// 로또 번호 추첨하는 프로그램 제작하기
		// 1 ~ 45 까지의 임의의 숫자를 이용하여
		// 크기가 6인 배열에 저장하고
		// 이를 정렬하여 출력하는 프로그램을 만들어 봅시다.
		
		// 1. Math.random() 메소드 활용하기
		// 0부터 1 전까지의 임의의 실수를 가져오는
		// 메소드이다.
		// 0.000000001111 . . .
		// 0.999999999999 . . .
		
		// 0 ~ 44
		int num = (int)(Math.random()*45 + 1);
		
		System.out.println("Math.random() : " + num);
		
		
		// 2. java.util.Random 클래스 활용하기
		java.util.Random rnd = new java.util.Random();
		
		int num2 = rnd.nextInt(45) + 1;
		
		System.out.println(
			"Random.nextInt() : " + num2);
		
		int[] arr = new int[6];
		
		// 입력하기 위한 코드 부분 (입력부)
		for(int i = 0; i < arr.length ; i ++){
			// 임의의 숫자를 arr 배열에 저장하기
			arr[i] = rnd.nextInt(45) + 1;
			
			// 중복 체크를 위한 이전 값 비교 반복문
			for(int j = 0; j < i ; j++){
				if(arr[j] == arr[i]){
					i--; // 현재 반복 차수를 무효처리
					break;
				}
			}
		}
		
		// 정렬을 위한 코드 부분 (버블정렬)
		for(int i = arr.length -1 ; i > 0 ; i--){
			for(int j = 0; j < i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// 출력하기 위한 코드 부분 (출력부)
		System.out.println("출력 부 입니다. ");
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}









