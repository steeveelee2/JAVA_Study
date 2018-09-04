// -- 한줄 주석 --

/*
 * 여러 줄 주석
 */
// 1. 패키지 선언
//    - 해당하는 자바 소스 파일이
//      어떤 그룹에 속해 있는지 나타내는 그룹의 명칭
// Ex) package test;
//     package com.samsung.galaxy_note4.ui;
//
package com.kh.variableTest;

// 다른 패키지에 있는 클래스나 메소드를 사용하고자
// 할 경우에 해당 클래스의 위치를 import 예약어를
// 통해 등록해서 사용한다.

import com.kh.memoryVar.TestMemoryVar;


/**
 *  javaDoc(자바 문서 용) 주석
 *  @author 유정훈
 */
// 2. 클래스 선언
//    - 사용하는 기능에 대한 소스 코드들의 집합체
public class TestVariable {
	// 3. 메소드
	//   - 특정 기능에 대해서 구현된 소스 코드
	//    - 종류
	//       - 실행용 메소드
	//           - main();
	//       - 기능 제공용 메소드
	//           - 나머지
	
	public static void main(String[] args) {
		
		// new TestVariable().testVariable1();
		// new TestVariable().testVariable2();
		// new TestVariable().testVariable3();
		// new TestVariable().testVariable4();
		new TestVariable().testVariable5();
		
		// new TestMemoryVar().testMethod();
		
	}
	
	public void testVariable1(){
		
		// 자바의 데이터 기본 자료형
		
		// 논리 자료형 (true/ false(참/거짓))
		boolean result1 = true;
		
		System.out.println(result1);
		
		// 문자 한 개 자료형
		char result2 = 'A';
		
		System.out.println(result2);
		
		// 정수 자료형
		
		byte resultByte = 10;
		short resultShort = 30;
		int resultInt = 500;
		long resultLong = 1000l;
		
		System.out.println(resultByte);
		System.out.println(resultShort);
		System.out.println(resultInt);
		System.out.println(resultLong);
		
		// 실수 자료형
		
		float resultFloat = 3.14f;
		double resultDouble = 3.14;
		
		System.out.println(resultFloat);
		System.out.println(resultDouble);
		
		// 참조 자료형
		
		String str = "안녕하세요!";
		
		System.out.println(str);
		
	}
	
	public void testVariable2(){
		
		// 기본 자료형과
		// 문자열 자료형 String을
		// 활용해서 이름, 나이, 주소
		// 신상 정보를 입력해 보세요.
		
		String name = "홍길동";
		int age = 10;
		String address = "서울시 강남구";
		boolean driverLicense = true;
		char gender = 'M';
		byte siblings = 5;
		short hasBrother = 3;
		long todayWork = 12l;
		
		float weight = 60.0f;
		double height = 100.0;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(driverLicense);
		System.out.println(gender);
		System.out.println(siblings);
		System.out.println(hasBrother);
		System.out.println(todayWork);
		System.out.println(weight);
		System.out.println(height);
				
	}
	
	public void testVariable3(){
		
		// 변수와 상수 테스트
		int testNum = 100;
		
		System.out.println(testNum);
		
		testNum = 200;
		
		System.out.println(testNum);
		
		// ------------------------------ //
		
		final int TEST_NUM = 100;
		
		System.out.println(TEST_NUM);
		
		// TEST_NUM = 500;
		
	}
	
	public void testVariable4(){
		
		// 자동 형변환
		// byte = 1 byte;
		// short = 2 byte;
		// int = 4 byte;
		// long = 8 byte;
		
		byte num1 = 10;
		short num2 = num1;
		
		// byte result = num1 + num2;
		
		char ch = 'A';
		int iNum = ch;
		
		System.out.println(iNum);
		
		
		long lNum = 100l;  // 8byte
		float fNum = lNum; // 4byte
		
		System.out.println(fNum);
		
		// 강제 형변환
		
		byte num3 = 10;
		short num4 = num3;
		
		byte result2 = (byte)(num3 + num4);
		
		System.out.println(result2);

		// 숫자를 문자로
		
		int chNum = 40000;
		char chResult = (char)chNum;
		
		System.out.println(chResult);
		
		
		// 실수를 정수로
		
		double dNum = 120.123;
		int resultI = (int)dNum;
		
		System.out.println(resultI);
		
	}
	
	public void testVariable5(){
		
		// System.out.println();
		// System.in -- 입력장치 (키보드)
		// System.out -- 출력장치 (모니터)
		// System.err -- 화면에 에러를 표시하는 역할
		
		// System.out.print()
		// System.out.println()
		// System.out.printf()
		
		// \n : 다음 줄로
		// \r : 그 줄의 처음으로
		// \t : tab과 동일한 효과
		
		System.out.printf("%d\n", 100);
		System.out.printf("%5d\n", 100);
		System.out.printf("%5d\n", 12345);
		System.out.println("-------------");
		System.out.printf("%05d\n", 123);
		
		System.out.println("-------------");
		
		System.out.printf("%f \n", 123.45);
		System.out.printf("%.2f \n", 123.4567);
		System.out.printf("%.2f \n", 123.4); // 123.40
		
	}
	
	
	
}







