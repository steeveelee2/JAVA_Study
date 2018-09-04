package com.loop;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);

	public void printStar1() {
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					if (i == j)
						System.out.print(i);
					else
						System.out.print('*');
				}
				System.out.println();
			}
		} else
			System.out.println("양수가 아닙니다!!");
	}

	public void printStar2() {
		
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();

		int tmp = (b < 0) ? b * -1 : b;

		System.out.println();

		for (int i = 0; i < tmp; i++) {
			for (int j = 0; j <= i; j++) {
				if (b > 0) System.out.print("*");
				else System.out.print(" ");
			}
			if (b < 0) {
				for (int j = 0; j < tmp-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
