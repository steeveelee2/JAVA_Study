package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void printUniCode(){
		
		System.out.print("문자 하나 입력 : ");
		char ch=sc.next().charAt(0);
		
		while(ch!='0') {
			System.out.println((int)ch);
			System.out.print("문자 하나 입력 : ");
			ch=sc.next().charAt(0);		
		}
		
	}
	
	public void sum1To100(){
		
		int sum=0,i=1;
		
		while(i<101) {
			sum+=i;
			i++;
		}
		System.out.println("합계 : "+sum);
		
	}
	
	public void numberGame(){
		
		int answer=(int)(Math.random()*100)+1;
		int choice=0;
		
		while(answer!=choice) {
			System.out.print("숫자를 맞춰보세요 : ");
			choice=sc.nextInt();
			if(choice==answer) {
				continue;
			}else if(choice<answer){
				System.out.println("틀렸습니다 업");
			} else {
				System.out.println("틀렸습니다 다운");
			}
		}
		System.out.println("정답입니다");		
		
	}
	
	public void countCharacter(){
		
		System.out.print("문자열 입력 : ");
		String word=sc.next();
		int count=0;
		
		while(count!=word.length()) {
			if(word.charAt(count)!=0) {
				count++;
			}
		}
		System.out.println(word+"의 글자 수는 "+count+"개 입니다");
		
	}
	
	public void countInChar(){
		
		System.out.print("문자열 입력 : ");
		String word=sc.next();
		System.out.print("찾을 문자 : ");
		char ch=sc.next().charAt(0);
		int i=0,count=0;
		
		while(i!=word.length()) {
			if(word.charAt(i)==ch) {
				count++;
			}
			i++;
		}
		System.out.printf("%s에 들어있는 %c의 갯수는 %d개 입니다\n",word,ch,count);
		
	}

}
