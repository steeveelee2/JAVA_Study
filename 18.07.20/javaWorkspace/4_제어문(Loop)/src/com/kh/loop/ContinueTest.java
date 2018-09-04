package com.kh.loop;

public class ContinueTest {
	// Continue : 반복문 내에서 특정 조건에 맞을 때
	// 해당 반복 부분을 건너 뛰거나 실행하지 않을 때
	// 사용하는 분기문
	// if(조건식) continue;
	// 
	// continue를 통해 건너 뛸 경우
	// 반복문은 증감식이나, 다음 조건으로 넘어가며
	// continue 하단의 소스 코드를 생략한다.
	
	public void testContinue1(){
		// 1부터 100까지의 합
		// 단, 4의 배수는 제외한다.
		// ( N % 4 == 0 )
		
		int sum = 0;
		
		for(int i = 1; i < 101 ;i++){
			if( i % 4 == 0) {
				continue;
			}
			System.out.print(i + " + ");
			sum += i;
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void testContinue2(){
		// 구구단을 출력하기
		// 단, for문을 활용하고
		// 각 단의 홀수 곱만 출력해보기
		
		// ---- N 단 -----
		// N * 1 = M
		// N * 3 = M
		// N * 5 = M
		//   . . .
		
		for(int dan = 2; dan < 10 ; dan++){
			
			for(int su = 1; su < 10 ; su++){
				if(su % 2 == 0) {
					continue;
				}
				
				System.out.println(
					dan + " * "+ su + " = "+ (dan * su));
			}
			System.out.println("----------------");
		}
		
		
	}
}













