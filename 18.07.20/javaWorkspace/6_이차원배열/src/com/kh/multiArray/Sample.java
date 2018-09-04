package com.kh.multiArray;

public class Sample {
	public void test1(){
		// 5x5 2차원 배열 만들기
		int[][] arr = new int[5][5];
		int num = 1;
		
		// 입력부
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				arr[i][j] = num++;
			}
		}
		
		// 출력부
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test2(){
		// 1 ()  6 11
		// 2  7 12
		// 3  8 13
		// 4  9 14
		// 5 10 15 . . .
		int[][] arr= new int[5][5];
		int num = 1;
		// 입력부
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				arr[j][i] = num++;
			}
		}
		
		// 출력부
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test3(){
		// 0: 1   2   3   4   5
		// 1: 10  9   8   7   6
		// 2: 11  12  13  14  15
		// 3:
		//
		
		
		int[][] arr = new int[5][5];
		int num = 1;
		boolean check = true;
		
		// 입력부
		for(int i = 0 ; i < arr.length ; i++){
			if(check){
				for(int j = 0 ; j < arr[i].length; j++){
					arr[i][j] = num++;
				}
			} else {
				for (int j = arr[i].length -1; j > -1 ; j--){
					arr[i][j] = num++;
				}
			}
			check = !check;
		}
		
		// 출력부
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test4(){
		
		int[][] arr = new int[4][4];
		
		// 3행 3열까지 채우기
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0; j < 3 ; j++){
				arr[i][j] = (int)(Math.random()*100)+1;
			}
		}
		
		// 합계를 구해서 4행 4열 부분에 값 추가하기
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[j][i];
			}
			arr[3][3] += (arr[i][3] + arr[3][i]);
		}
		
		// 출력부
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}













