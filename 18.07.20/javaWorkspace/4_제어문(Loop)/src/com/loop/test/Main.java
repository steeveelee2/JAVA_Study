package com.loop.test;

import java.util.Scanner;

import com.loop.CharacterCheck;
import com.loop.ForWhile;

import home.menu.CashBurgerKing;

public class Main {
	public static void main(String[] args) {
		ForWhile samp = new ForWhile();
		CashBurgerKing samp2 = new CashBurgerKing();
		CharacterCheck samp3 = new CharacterCheck();
		
		System.out.println("***** 메뉴 *****");
		System.out.println("1. printStar1");
		System.out.println("2. printStar2");
		System.out.println("3. selectMenu()");
		System.out.println("4. countInputCharacter()");
		System.out.print("번호 입력 : ");
		
		int sel = new Scanner(System.in).nextInt();
		
		switch(sel){
		case 1: samp.printStar1(); break;
		case 2: samp.printStar2(); break;
		case 3: samp2.selectMenu(); break;
		case 4: samp3.countInputCharacter(); break;
		default:
		}
	}
}
