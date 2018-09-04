package com.loop;

import java.util.Scanner;

public class CharacterCheck {
	public void countInputCharacter() {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		boolean check = false;
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') check = true;
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')	check = true;
			else{ check = false;	break;
			}
		}
		if (check) {
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);

			System.out.println();
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j))
					cnt++;
			}
			System.out.println("포함된 갯수 : " + cnt + "개");
		} else
			System.out.println("영문자만 받을 수 있습니다.");
	}
}