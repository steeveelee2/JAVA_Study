package com.kh.set;

import java.util.*;

public class TestLinkedSet {

	public static void main(String[] args) {
		// 각각의 요소를 링크로 연결하여(주소를 저장하여) 순서를 형성하는 set 클래스
		
		Set lset=new LinkedHashSet();
		
		lset.add("사과");
		lset.add(12345);
		lset.add(true);
		lset.add(12.5);
		lset.add('A');
		
		// 1. 순서를 유지하기 때문에 넣은 자료 순서로 출력되는 것을 확인할 수 있다
		System.out.println(lset);
		
		
	}

}
