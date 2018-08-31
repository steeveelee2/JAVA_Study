package logic.home.model;

import java.util.Scanner;

public class StaticMethodSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void testMathRandom(){
		
		System.out.println("1~45 사이 임의의 정수 : "+((int)(Math.random()*45)+1));
		
	}
	
	public void testMathAbs(){
		
		System.out.println("-12.77의 절대값 : "+Math.abs(-12.77));
		
	}
	
	public void testMathMax(){
		
		System.out.println("120과 54중 큰 값은 ? : "+Math.max(120,54));
		
	}

}
