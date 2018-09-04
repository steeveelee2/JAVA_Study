package ncs.test9;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// 계산기 실행용 메소드
		Calculate c = new Calculate();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력하세요 ' '구분 ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		c.sum(num1, num2);
		c.subtract(num1, num2);
		c.multiply(num1, num2);
		c.divide(num1, num2);
	}

}
