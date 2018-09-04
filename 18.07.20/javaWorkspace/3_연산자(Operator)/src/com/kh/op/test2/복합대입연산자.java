package com.kh.op.test2;

public class 복합대입연산자 {

	// 다른 연산자와 대입 연산자를 함께 사용하는 연산자
	// 산술 대입 연산자 : +=, -=, *=, /=, %=
	// 증감연산자와 같이 연산을 위해 CPU를 거치지 않고
	// 메모리에 직접 연산을 수행하기 때문에
	// 처리 속도가 빠르다.
	
	public void testMethod(){
		/*
		 * += : 왼쪽과 오른쪽의 값을 더한 후 왼쪽 공간에
		 *      다시 대입하는 연산자.
		 * -= : 왼쪽과 오른쪽의 값을 뺀 후 왼쪽 공간에
		 *      다시 대입하는 연산자.
		 * *= : 왼쪽과 오른쪽의 값을 곱한 후 왼쪽 공간에
		 *      다시 대입하는 연산자.
		 * /= : 왼쪽과 오른쪽의 값을 나눈 몫을 왼쪽 공간에
		 *      다시 대입하는 연산자.
		 * %= : 왼쪽과 오른쪽의 값을 나눈 나머지를
		 *      왼쪽 공간에 다시 대입하는 연산자.
		 */
		
		int num = 10, result;
		
		System.out.println("num : " + num);
		
		// num의 값에서 3 증가시
		
		num = num + 3;
		System.out.println(
				"연산 후 num의 값 : " + num
				);
		
		// -- 복합대입 연산자 적용 시 --
		
		num += 3;
		System.out.println("num : " + num);
		
		num -= 3; // num = num - 3;
		System.out.println("num : " + num);
		
		num *= 2; // 현재 num 값의 2배
		System.out.println("num : " + num);
		
		num /= 2; // 현재 num 값의 1/2배
		System.out.println("num : " + num);

	}
	
}





