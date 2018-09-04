package com.silsub;

import java.io.*;
import java.util.Scanner;

public class TestSilsub {
	
	public static void main(String[] args) {
		
		TestSilsub ts=new TestSilsub();
		//ts.silsub1();
		ts.silsub2();
		
	}
	
	public void silsub1() {
		
		CharacterProcess cp=new CharacterProcess();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력 : ");
		try {
			int count=cp.countAlpha(br.readLine());
			System.out.println("문자열 내 영문자 갯수는 "+count+"개 입니다.");
		} catch (CharCheckException|IOException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public void silsub2() {
		
		NumberProcess np=new NumberProcess();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 두 개 입력(띄어쓰기로 구분) : ");
		int numA=sc.nextInt(),numB=sc.nextInt();
		try {
			boolean chk=np.checkDouble(numA,numB);
			System.out.println(numA+"은(는) "+numB+"의 "+(chk!=true?"배수가 아니다":"배수다"));
		}catch(NumberRangeException e) {
			System.out.println(e.getMessage());
		}
	}

}
