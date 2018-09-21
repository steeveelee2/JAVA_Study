package remd.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator calc=new Calculator();
		
		// 던지고 받기
		try{
			System.out.printf("%.1f",calc.getSum(sc.nextInt()));
		}catch(InvalidException e){
			System.out.println(e.getMessage());
		}
		
	}

}
