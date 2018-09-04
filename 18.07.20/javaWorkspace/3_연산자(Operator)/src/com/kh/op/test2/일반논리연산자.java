package com.kh.op.test2;

public class 일반논리연산자 {
	public void testMethod1(){
		// && : (and : 그리고 ) - 11순위
		// || : (or  : 또는, ~거나 ~) - 12순위
		
		// (논리 값) && (논리 값)
		// (논리 값) || (논리 값)
		// ** 논리 값 : 어떠한 결과가 참, 거짓으로
		//            나오는 수식
		
		// 10 <= x <= 100
		// 10 <= x && x <= 100
		
		java.util.Scanner sc 
		 = new java.util.Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100사이인가? "
		              +(num >= 1 && num <= 100));
		
		// 응용 1
		// 문자 -> 숫자
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("대문자인가? "
		               +('A' <= ch && ch <= 'Z'));
		
		System.out.println("대문자인가? "
	               +(65 <= ch && ch <= 91));
		
		// 응용 2
		System.out.print("계속하시려면 y나 Y를 입력하세요 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("영문자 (y/Y) 확인 : "+
				(ch2 == 'y' || ch2 =='Y'));
	}
	
	public void testMethod2(){
		
		// (논리식) && (논리식)
		// - 앞의 논리식이 false면 뒤를 실행하지 않는다. 
		
		// (논리식) || (논리식)
		// - 앞의 논리식이 true면 뒤를 실행하지 않는다.
		
		// 심화 (비트논리 연산자)
		
		// (논리식) & (논리식)
		// - 앞의 논리식이 거짓이어도, 뒤를 실행하여 확인
		
		// (논리식) | (논리식)
		// - 앞의 논리식 참이어도, 뒤를 실행하여 확인
		
		int num = 10;
		
		int result
		     = (false && ++num > 0) ? num : num;
		
		System.out.println("num값 확인 : "+ result);
		
		int result2 =
				(false & ++num > 0) ? num : num;
		
		System.out.println("num값 재확인 : " + result2);
		
		int result3 =
				(true || ++num > 0) ? num : num;
		
		System.out.println("num값 확인 : " + result3);
		
	}
}







