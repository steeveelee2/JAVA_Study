package com.week4;

import java.util.Scanner;

public class NumberOk {

	public static void main(String[] args) {
		
		boolean on=true;
		do {
			int rnd=(int)(Math.random()*100)+1;
			System.out.println("랜덤 숫자 생성 완료");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			NumberOk no=new NumberOk();
			int chk=2,count=0;
		
			do {
				System.out.print("정수 입력 : ");
				chk=no.questionNumber(no.getNumber(sc.next()),rnd);
				System.out.println(chk==1?"작다":(chk==0?"정답":"크다"));
				count++;
			}while(chk!=0);
			
			System.out.print(count+"회만에 맞췄습니다\n계속 하시겠습니까?(y/n) : ");
			on=sc.next().toLowerCase().charAt(0)=='n'?false:true;
			
		}while(on!=false);
		System.out.println("프로그램을 종료합니다");

	}
	
	public int getNumber(String num) {
		return Integer.parseInt(num);
	}
	
	public int questionNumber(int num,int rnd) {
		int chk=num==rnd?0:(num<rnd?-1:1);
		return chk;
	}

}
