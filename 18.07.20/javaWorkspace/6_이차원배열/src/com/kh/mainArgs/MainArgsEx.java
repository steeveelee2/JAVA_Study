package com.kh.mainArgs;

public class MainArgsEx {

	public static void main(String[] args) {
		// 사용자의 이름, 나이,
		// 전화번호, 성별(M/F)을 입력 받아
		// 출력하는 프로그램을 만들어 보세요.
		System.out.println("이름 : " + args[0]);
		System.out.println("나이 : " 
				+ Integer.parseInt(args[1]));
		System.out.println("전화번호 : " + args[2]);
		System.out.println("성별 : " + args[3].charAt(0));
	}

}
