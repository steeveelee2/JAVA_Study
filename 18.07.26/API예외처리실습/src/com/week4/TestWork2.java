package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] args) {
		
		String str="J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 출력 : "+ str);
		
		System.out.println("토큰 처리 전 글자 갯수 출력 : "+str.length());
		
		StringTokenizer strToken=new StringTokenizer(str," ");
		System.out.println("토큰 처리 후 글자 갯수 출력 : "+strToken.countTokens());
		
		System.out.print("char[] 값 출력 : ");
		
		char[] chArr=new char[strToken.countTokens()];
		for(int i=0;i<chArr.length;i++) {
			chArr[i]=strToken.nextToken().charAt(0);
			System.out.print(i==chArr.length-1?chArr[i]+"\n":chArr[i]+", ");
		}
		
		System.out.print("char[]을 다시 String으로 바꾼 후 모두 대문자로 변환하여 출력 : ");
		String[] strArr=new String[chArr.length];
		for(int i=0;i<strArr.length;i++) {
			strArr[i]=String.valueOf(chArr[i]).toUpperCase();
		}
		System.out.println(String.join("", strArr));

	}

}
