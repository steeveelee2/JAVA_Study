package com.week4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		
		ExamString es=new ExamString();
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str=sc.next();
		System.out.print("찾을 문자 입력 : ");
		
		char ch=sc.next().charAt(0);
		System.out.println("첫 문자를 대문자로 : "+es.preChar(str));
		System.out.println(ch+"의 갯수 : "+es.charSu(str,ch));
		

	}

}
