package com.silsub;

import java.io.*;
import java.util.*;

public class TestSilsub {

	public static void main(String[] args) {

		TestSilsub test = new TestSilsub();

		test.silsub1();
		test.silsub2();

	}

	public void silsub1() {

		CharacterProcess cp = new CharacterProcess();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자열 입력 : ");
		try {
			int count = cp.countAlpha(br.readLine());
			System.out.println("문자열 내에서 영문자의 갯수 : " + count);
		} catch (CharCheckException | IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void silsub2() {
		NumberProcess np = new NumberProcess();
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int numA = sc.nextInt();
		System.out.print("첫번째 정수 입력 : ");
		int numB = sc.nextInt();
		
		try{
			boolean chk= np.checkDouble(numA, numB);
			if(chk==true){
				System.out.printf("%d는 %d의 배수다\n", numA,numB);
			}else{
				System.out.printf("%d는 %d의 배수가 아니다\n", numA,numB);
			}
			
		}catch(NumberRangeException e){
			System.out.println(e.getMessage());
		}

	}

}