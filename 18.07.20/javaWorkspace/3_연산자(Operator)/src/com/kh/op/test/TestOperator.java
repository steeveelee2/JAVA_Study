package com.kh.op.test;

public class TestOperator {
	public void testOperator(){
		int a = 10;
		int b = 20;
		int c = 30;
		
		 // 10 ---> 11
		System.out.println(a++);
		
		// 10, 30
		b = (--a) + b;
		System.out.println(b);
		
		// 10 + 29 ---> 39
		// 11, 29
		c = (a++) + (--b);
		System.out.println(c);
		
		int x = 100, y = 33, z = 0;
		x--; // 99
		z = x-- + --y; // 99 + 32 = 131 / 98, 32, 131
		x = 99 + x++ + x; // 99 + 98 + 99 / 296, 32, 131
		y = y-- + y + ++y; // 32 + 31 + 32 / 95
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		System.out.println("z = "+ z);
	}
	
	
	
	
}
