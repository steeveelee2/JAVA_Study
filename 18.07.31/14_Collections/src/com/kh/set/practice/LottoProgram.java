package com.kh.set.practice;

import java.util.*;

public class LottoProgram {

	public static void main(String[] args) {
		// 1. 1~45 사이의 랜덤값 6개
		// 2. 중복이 존재하면 안된다
		// 3. 오름차순 정렬을 하여 화면에 보여준다
		// 위 세 개의 조건을 만족하는 프로그램을 set을 사용하여 구현하셈
		
		Set tset=new TreeSet(); 
		while(tset.size()!=6){
			tset.add((int)(Math.random()*45)+1);
		}
		System.out.println(tset);
		
	}

}
