package com.kh.array;

public class ArraySort {
	// 배열 안의 값들을 특정 형식(오름차순, 내림차순)에 따라 
	// 정렬하는 방법
	
	public static void testSwapLogic(){
		// 두 변수의 값을 교환하기
		// 배열의 값들을 정렬하기 위해서는
		// 각각의 값들을 교환하기 위한 로직이 필요하다.
		// 우선 2개의 변수의 값을 교환하는 것부터
		// 실습해본다.
		
		int num1 = 10;
		int num2 = 20;
		int temp = 0;  // 두 값의 교환을 위한 임시 변수
		
		// 컴퓨터 Swap logic
		temp = num2;
		num2 = num1;
		num1 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 배열의 두 공간의 값 교환하기
		int[] arr = { 2, 1, 3 };
		
		int temp2=0; // 배열 값 교환용 임시 변수
		
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		// 반복문을 활용하기
		for(int i = 0; i < arr.length - 1; i++){
			
			temp2 = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp2;
			
		}
		
		// 출력 확인하기
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void testArraySort1(){
		// 선택 정렬( Selection Sort )
		// 기존의 배열을 전부 탐색하여
		// 가장 작은 값(최소값)을 찾고,
		// 그 값을 왼쪽부터 채워 나가는 방식의
		// 정렬 알고리즘(순서도)
		// 정렬하고자 하는 데이터의 양이 적을 때 
		// 좋은 성능(시간복잡도)을 가지지만,
		// 배열의 길이가 클 때 (데이터 양이 많을 때)
		// 성능이 급격하게 저하된다.
		
		int[] array = { 2, 4, 6, 1, 3, 5 };
		
		int min; // 최소값을 가진 데이터의 인덱스를
		         // 저장할 변수 선언
		int temp; // 값 교환용 임시변수
		
		for(int i = 0; i <array.length - 1; i++){
			// 배열을 처음부터 끝까지 반복할 때
			// 최초의 min 값을 정해놓고 
			// 내부의 반복문을 통해 값을 비교 및 교환한다.
			min = i;
			
			for(int j = i + 1 ; j < array.length; j++){
				// 현재 인덱스의 다음 값 부터 비교하기 위해
				// j는 i + 1로 시작한다.
				System.out.printf("현재 인덱스 위치 : %d, %d\n", i, j);
				
				// 최소값을 찾자!!
				if(array[min] > array[j]){
					min = j;
				}
				
			}
			
			System.out.println("--- 교환 시작합니다 ---");
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
		}
		
		System.out.println("정렬 후 : ");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]+ " ");
		}
		
	}
	
	public static void testArraySort2(){
		// 버블 정렬 (Bubble Sort)
		// 인접한 두 개의 값을 비교하여
		// 더 큰 값을 우측으로 보내는 정렬 알고리즘
		// 이미 정렬이 어느 정도 되어 있는 데이터에
		// 대한 수행속도가 매우 빠르며, 구현이 쉽다.
		// 단, 역으로 정렬되어 있는 배열을 정렬 할 때에는
		// 시간복잡도가 제곱수 배로 증가하여
		// 효율이 급격히 떨어진다. = O(n^2)
		
		int[] array = {2, 4, 6, 1, 3, 5};
		int temp = 0; // 교환을 위한 임시 변수
		
		for(int i = array.length - 1 ; i > -1; i--){
			for(int j = 0; j < i; j++){
				// System.out.println(
				// 	"비교할 인덱스 확인 :"+ i +", " + j);
				
				if(array[j] > array[j+1]){
					// 앞의 수가 더 크기 때문에
					// 교환을 수행한다.
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				// 내부에서 일어나는 정렬 확인하는 코드
				for(int k = 0; k < array.length; k++){
					if(k < array.length -1){
						System.out.print(array[k]+", ");
					} else {
						System.out.println(array[k]);
					}
				}
			}
		}
		
		// 정렬 후 결과 확인 출력용 코드
		System.out.println("정렬 후 확인 : ");
		
		for(int i = 0 ; i < array.length; i++){
			System.out.print(array[i]+ " ");
		}
	}
}












