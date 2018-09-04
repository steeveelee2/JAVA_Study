package ncs.test5;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("2부터 5까지 정수값을 입력하세요 : ");
		try {
			double result=c.getSum(sc.nextInt());
			System.out.printf("결과값 : %.1f\n",result);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}

	}

}
