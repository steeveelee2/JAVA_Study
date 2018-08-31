package logic.home.model;

import java.util.Scanner;

public class IfSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void maxNumber(){
		
		System.out.print("정수 입력 : ");
		int n1=sc.nextInt();
		System.out.print("정수 입력 : ");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1);
		}else if(n1<n2){
			System.out.println(n2);
		}else {
			System.out.println("크기가 같다");
		}
		
	}
	
	public void minNumber(){
		
		System.out.print("정수 입력 : ");
		int n1=sc.nextInt();
		System.out.print("정수 입력 : ");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n2);
		}else if(n1<n2){
			System.out.println(n1);
		}else {
			System.out.println("크기가 같다");
		}
		
	}
	
	public void threeMaxMin(){
		
		System.out.print("정수 입력 : ");
		int n1=sc.nextInt();
		System.out.print("정수 입력 : ");
		int n2=sc.nextInt();
		System.out.print("정수 입력 : ");
		int n3=sc.nextInt();
		int max=n1,min=n1;
		
		if(n1<n2) {
			if(n2<n3) {
				max=n3;
			}else {
				max=n2;
			}
		}else if(n1<n3) {
			max=n3;
		}
		System.out.println("최대값 : "+max);
		
		if(n1>n2) {
			if(n2>n3) {
				min=n3;
			}else {
				min=n2;
			}
		}else if(n1>n3) {
			min=n3;
		}
		System.out.println("최소값 : "+min);
		
	}
	
	public void checkEven(){
		
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		
	}
	
	public void isPassFail(){
		
		System.out.print("국어 점수 : ");
		double kor=sc.nextDouble();
		System.out.print("영어 점수 : ");
		double eng=sc.nextDouble();
		System.out.print("수학 점수 : ");
		double mat=sc.nextDouble();
		
		if(kor>=65&&eng>=65&&mat>=65) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
	}
	
	public void scoreGrade(){
		
		System.out.print("점수 입력 : ");
		double score=sc.nextDouble();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
	
	public void checkPlusMinusZero(){
		
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		
		if(num==0) {
			System.out.println("0이다");
		}else if(num<0) {
			System.out.println("음수다");
		}else {
			System.out.println("양수다");
		}
		
	}
	
	public void whatCaracter(){
		
		System.out.print("문자 하나 입력 : ");
		char ch=sc.next().charAt(0);
		
		if(ch>='0'&&ch<='9') {
			System.out.println("숫자다");
		}else if(ch>='A'&&ch<='Z') {
			System.out.println("영어 대문자다");
		}else if(ch>='a'&&ch<='z') {
			System.out.println("영어 소문자다");
		}else {
			System.out.println("기타 문자다");
		}
		
	}

}
