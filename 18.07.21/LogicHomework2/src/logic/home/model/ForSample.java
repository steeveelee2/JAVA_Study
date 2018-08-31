package logic.home.model;

import java.util.Scanner;

public class ForSample {
	
	Scanner sc=new Scanner(System.in);	
	
	public void sum1To10(){
		
		int sum=0;
		
		for(int i=1;i<11;i++) {
			sum+=i;
		}
		System.out.println("합계 : "+sum);
		
	}
	
	public void sumEven1To100(){
		
		int sum=0;
		
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("합계 : "+sum);
		
	}
	
	public void oneGugudan(){
		
		System.out.print("구구단을 볼 정수 : ");
		int dan=sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
	}
	
	public void sumMinToMax(){
		
		System.out.print("정수 입력 : ");
		int max=sc.nextInt();
		System.out.print("정수 입력 : ");
		int min=sc.nextInt(),sum=0;
		
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		System.out.println("작은 정수부터 큰 정수까지 합계 : "+sum);
		
	}
	
	public void printStar(){
		
		System.out.print("줄 수 입력 : ");
		int row=sc.nextInt();
		System.out.print("칸 수 입력 : ");
		int col=sc.nextInt();
		
		for(int r=0;r<row;r++){
			for(int c=0;c<col;c++) {
				if(c==col-1) {					  
					System.out.println("*");
				} else {
					System.out.print("*");
				}
			}			
		}
		
	}
	
	public void printNumberStar(){
		
		for(int r=1;r<=7;r++){
			for(int c=1;c<=7;c++) {
				if(c==r) {
					System.out.print(c);
				}else if(c==7) {
					System.out.println("*");
				}else {
					System.out.print("*");
				}
			}			
		}
		System.out.println("");
		
	}
	
	public void printTriangleStar(){
		
		System.out.println("삼각형 만들 숫자 : ");
		int row=sc.nextInt();
		
		if(row==0) {
			System.out.println("못만든다");
		}else if(row>0) {
			for(int r=0;r<row;r++) {
				for(int c=0;c<=r;c++) {
					if(c==r) {
						System.out.println("*");
					} else {
						System.out.print("*");
					}				
				}				
			}
		}else {
			for(int r=0;r<-row;r++) { 				
				for(int c=0;c<-row;c++) {					
					if(c==(-row)-1) {
						System.out.println("*"); 
					}else if(c<r) {
						System.out.print(" ");
					}else {
						System.out.print("*"); 
					}					
				}
			}
		}
		
	}
	
	public void guguDan(){
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		
	}	

}
