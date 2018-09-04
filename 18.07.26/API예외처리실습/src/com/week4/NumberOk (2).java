package com.week4;

import java.util.*;

public class NumberOk {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean chk = true;
		do {
			int ran = (int) (Math.random() * 100) + 1;
			System.out.println("1~100사이의 랜덤한 숫자 생성");
			
			NumberOk ok = new NumberOk();
			int ans = 0, count = 0;
			

			do {
				System.out.println("정답 입력 : ");
				ans = ok.getNumber(sc.next());
				if (ran > ans) {
					System.out.println(ans + "보다 큰 수입니다");
					count++;
				} else if (ran < ans) {
					System.out.println(ans + "보다 작은 수입니다");
					count++;
				} else {
					System.out.println("정답입니다.");
					count++;
				}
			} while (ans != ran);
			System.out.print(count + "회만에 맞췄습니다\n계속 하시겠습니까?(y/n) : ");
			char con = sc.next().toLowerCase().charAt(0);
			if (con == 'n') {
				chk = false;

			} else {
				chk = true;
				System.out.println("다시 시작합니다.");
			}

		} while (chk!=false);
		System.out.println("프로그램을 종료합니다");

	}

	public int getNumber(String num) {

		return Integer.parseInt(num);
	}

	// public int questionNumber(int num, int ran) {

	// }
}
