package logic.home.model;

import java.util.Scanner;

public class SwitchSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void calculator(){
		
		System.out.print("정수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2=sc.nextInt();
		System.out.print("연산문자 입력 : ");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case '+':
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			break;
		case '/':
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			break;
		default:
			System.out.println("다시 입력");
		}		
		
	}
	
	public void fruitPrice(){
		
		System.out.println("-- 파는 과일 --");
		System.out.println("수박");
		System.out.println("키위");
		System.out.println("메론");
		System.out.println("포도");
		System.out.println("블루베리");
		System.out.println("------------");
		System.out.print("가격을 알아볼 과일 : ");
		String fruit=sc.next();
		
		switch(fruit) {
		case "수박":
			System.out.println("개당 20000원");
			break;
		case "키위":
			System.out.println("개당 18900원");
			break;
		case "메론":
			System.out.println("개당 32000원");
			break;
		case "포도":
			System.out.println("알당 6500원");
			break;
		case "블루베리":
			System.out.println("알당 49900원");
			break;
		default:
			System.out.println("그런거 안팜");
		}
		
	}

}
