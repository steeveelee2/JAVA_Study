package logic.home.model;

import java.util.Scanner;

public class BreakSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void sumBreak(){
		
		int i=1,sum=0;
		while(i>0) {
			sum+=i;
			if(i==100) {
				break;
			}
		i++;}
		System.out.println("합계 : "+sum);
		
	}
	
	public void guguDanBreak(){
		
		for(int i=1;i<10;i++) {
			label:
			for(int j=1;j<10;j++) {
				if(j>4) {
					break label;
				}else {
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}				
			}
		}		
	}

}
