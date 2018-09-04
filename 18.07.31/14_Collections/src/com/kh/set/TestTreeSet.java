package com.kh.set;

import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// Tree구조를 활용하여 데이터를 저장함으로써 자동으로 정렬까지 처리하는 set클래스
		
		TreeSet tset=new TreeSet();
		Set tset2=new TreeSet();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("html");
		tset.add("css");
		
		
		// tset은 자동으로 오름차순 정렬을 한다
		System.out.println(tset);
		
		// 1. iterator사용
		Iterator iter=tset.iterator();
		while(iter.hasNext()){
			Object obj=iter.next();
			String str=(String)obj;
			
			// 한 개의 요소를 꺼내어 대문자로 변경한 뒤에 화면에 출력하기
			System.out.print(str.toUpperCase()+"\t");
		}
		System.out.println();
		
		// 2. 배열로 꺼내기
		Object[] obj=tset.toArray();
		for(int i=0;i<obj.length;i++){
			System.out.print(i==obj.length-1?((String)obj[i]).toUpperCase()+"\n":((String)obj[i]).toUpperCase()+"\t");
		}
	}

}
