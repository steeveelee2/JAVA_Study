package com.kh.variable;

public class CastingTest {
	// String, System
	// java.lang 패키지에 소속된
	// 클래스 들은 별도의 선언 없이도
	// 사용이 가능한데, 그 이유는
	// java.lang 패키지가 기본 패키지
	// 이기 때문에 별도 선언 없이도
	// .java 파일을 컴파일 할 때
	// 컴파일러에 의해 자동으로 추가되기
	// 때문이다.
	
	public void castMethod1(){
		// 본래 컴퓨터는 어떠한 값을 처리할 때
		// 같은 자료형 끼리만 계산(처리)이 가능
		// 하지만, 다른 자료형과 계산을
		// 수행할 때도 필요하기 때문에
		// 각각의 자료형으로 변환해주는 
		// 캐스팅(형변환)이라는 기술을 제공한다.
		
		// 기본적으로 정수형은 실수형으로 자동
		// 형변환이 가능하며,
		// 실수형은 정수형으로 자동형변환을
		// 할 수 없다.
		
		// 또한 각각의 자료형이 다르더라도
		// 해당 타입의 자료형 크기보다 
		// 큰 값이면 자동형변환을 지원한다.
		
		// 자동형변환이 일어난 경우
		int num = 'A';
		System.out.println("num : "+ num);
		
		//char 자료형에 정수값 저장이 가능한지 테스트
		char ch = 97;
		System.out.println("ch : "+ ch);
		
		// 음수 값을 저장할 수 없다.
		// char ch2 = -97;
		
		// int로 선언한 변수는 char 변수에 담을 수 없다.
		// 따라서 강제 형변환을 통해 값을 변환해야 한다.
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		
		// 만약 num 안에 음수가 들어있다면..?
		int num2 = -97;
		char ch3 = (char)num2;
		
		System.out.println("ch3 : "+ch3);
		
	}
	
	public void castMethod2(){
		// 다른 자료형끼리 연산을 수행할 경우
		// 두 자료형을 비교하여 더 큰 단위를 가진 자료형으로
		// 자동 형변환이 발생한다.
		
		int num = 100;
		long lNum = 200l;
		
		// 1. 강제로 형변환을 하여 원하는 자료형으로
		//    바꾸어 사용하는 경우
		// int result = num + (int)lNum;
		int result = (int)(num + lNum);
				
		System.out.println("result : "+result);
		
		// 2. 둘 중의 범위가 더 큰 자료형을 확인하여
		// 결과를 해당하는 자료형으로 받는 경우
		long result2 = num + lNum;
		
		System.out.println("result2 : "+result2);
		
		// 3. 해당 데이터를 처리하는 가장 큰 자료형으로
		//    값을 받는 경우
		
		double dNum = num + 10.5f;
		
		System.out.println("result dNum : " + dNum);
		
		// 4. byte와 short의 연산은 결과가 무조건 int이다.
		
	}
	
	public void castMethod3(){
		// 데이터 손실 테스트
		long num = 250l;
		
		byte result = (byte)num;
		
		System.out.println("num --> result");
		System.out.println(num+" --> "+ result);
		
		double dNum = 123.45678912345;
		
		System.out.println("dNum : " + dNum);
		
		float fNum = (float) dNum;
		
		System.out.println("fNum : " + fNum);
	}
	
	
}






