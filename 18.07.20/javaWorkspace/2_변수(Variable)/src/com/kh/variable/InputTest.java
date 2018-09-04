package com.kh.variable;

import java.io.*;
import java.util.Scanner;

public class InputTest {
	// 기능 제공 메소드 구현용 클래스
	
	public void inputMethod1(){
		// 컴퓨터 내장 키보드 입력 자원과
		// 현재 자바 파일 간의 연결 통로를 만들어서
		// 우리가 입력하는 키보드의 값을 
		// 자바 파일에서도 사용할 수 있다.
		BufferedReader br =
			new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("숫자 한 개를 입력하세요 : ");
		
		try {
			// readLine() 메소드를 통해서 입력하는 값을
			// 받아올 수 있다.
			String value = br.readLine();
			
			// 입력한 값이 문자열 값이기 때문에,
			// 숫자로 바꿀 수 있는 parseInt() 메소드를
			// 사용한다.
			int num = Integer.parseInt(value);
			
			System.out.println("입력하신 숫자는 " + num +"입니다.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void inputMethod2(){
		// 자료형 별로 값을 각각 입력 받을 수 있는 객체 
		
		Scanner sc = new Scanner(System.in);
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름을 입력 하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력 하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력 하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("키 : "+ height);
	}
}












