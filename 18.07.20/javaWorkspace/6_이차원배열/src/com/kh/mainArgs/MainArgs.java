package com.kh.mainArgs;

public class MainArgs {
	// 프로그램을 실행 시에 옵션을 직접 선택하여
	// 프로그램 실행에 도움이 되는 변수들을 받을 수 있다.
	// 일반적으로 main 메소드 실행 시 받는
	// 옵션 값들을 main Arguments (실행인자) 라고 말하고
	// 문자열로 이루어진 배열에 받아서 사용한다.
	
	public static void main(String[] args) {
		// 메소드명(변수 선언)에 사용되는
		// 변수를 매개변수라고 하고,
		// 메소드를 실행할 때 기본적으로 사용할 수 있는
		// 변수, 혹은 반드시 메소드에 필요한 변수를
		// 선언할 때 만약 그 변수의 값이 현재 메소드 자신이 아닌
		// 다른 메소드나 다른 인자 값에 의해서 전달되는 경우
		// ()안에 작성하여 사용한다.
		
		System.out.println("메인 인자값 확인하기");
		System.out.println("args 길이 : " + args.length);
		System.out.println("args 0번째 값 : " + args[0]);
		
		// 일반적으로 이클립스에서 main 메소드를 통해
		// 프로그램을 실행할 때 메인 인자값을 받지 않는다.
		// 이를 사용하기 위해서는 
		// Run - Run Configuration 에서
		// 사용하기 위한 variable 옵션값에 {string.prompt}
		// 라는 조건을 추가 해주어야 한다.
	
		// 안에 있는 args 전부 출력해보기
		for(int i = 0; i <args.length ; i++){
			System.out.println("값 확인하기 : "+args[i]);
		}
		
		// 문자열을 숫자로 바꾸기
		// "100" ==> 100
		String str1 = "100";
		int num1 = Integer.parseInt(str1);
		
		// "1.23" ==> 1.23
		String str2 = "1.23";
		double dNum1 = Double.parseDouble(str2);
		
		// "100" + "1.23" = "1001.23"
		// 101.23
		System.out.println("결과 확인 : " + (num1 + dNum1));
		
		// 숫자를 문자열로 바꾸기
		int num2 = 200;
		String str3 = num2+"";
		String str4 = String.valueOf(num2);
		
	}

}







