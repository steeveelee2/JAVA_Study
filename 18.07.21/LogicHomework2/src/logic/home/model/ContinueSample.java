package logic.home.model;

import java.util.Scanner;

public class ContinueSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void sumJumpThree(){
		
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				continue;
			}else {
				sum+=i;
			}
		}
		System.out.println("합계 : "+sum);
		
	}
	
	public void rowColJump(){
		
		for(int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
				if(r==0&&c>1) {
					continue;
				}else if(r==0&&c==1) {
					System.out.println(c);
				}else if(c==4) {
					System.out.println(c);
				}else {
					System.out.print(c);
				}				
			}
		}
	}
	

}
