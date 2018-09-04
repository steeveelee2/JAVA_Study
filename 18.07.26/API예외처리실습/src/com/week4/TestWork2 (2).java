package com.week4;

import java.util.*;

public class TestWork2 {

	public static void main(String[] args) {

		String str = "J a v a P r o g r a m ";

		System.out.println("토큰 처리전 출력 : " + str);
		System.out.println("토큰 처리전 글자 수 출력 : " + str.length());

		StringTokenizer strt = new StringTokenizer(str, " ");
		char[] chArr = new char[strt.countTokens()];

		System.out.println("토큰 처리후 글자 수 출력 : " + strt.countTokens());

		System.out.print("char[] 값 : ");
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = strt.nextToken().charAt(0);
			System.out.print(chArr[i]);

		}
		System.out.println();
		System.out.println("char[]을 다시 String으로 바꾼뒤 모두 대문자로 출력 : " + String.valueOf(chArr).toUpperCase());

	}

}
