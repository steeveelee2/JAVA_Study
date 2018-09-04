package com.week4;

import java.util.*;

public class ExamTest {

	public static void main(String[] args) {
		ExamString ex = new ExamString();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열과 문자를 입력하세요.");
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("\n첫글자를 대문자로 변환 : ");
		System.out.println(ex.preChar(str));
		System.out.print("입력한 문자 개수 : ");
		System.out.println(ex.charSu(str, ch));
		
		
	}

}
