package com.kh.list;

import java.util.*;

public class TestList {
	
	// List
	// 자료 구조 중 순서가 유지되고, 중복이 허용되는 자료 구조 기법을 이야기하며, 자바에서는 ArrayList, Vector, LinkedList 등이 있다
	// 이 중 ArrayList와 Vector는 기능이 동일하나 ArrayList에는 Thread Safe 기능이 없다
	
	public static void main(String args[]){
		// ArrayList 테스트
		
		ArrayList alist=new ArrayList();
		
		// 다형성을 적용한다면
		List blist=new ArrayList();
		Collection clist=new ArrayList();
		
		// List를 포함한 Collection 객체들은 여러 자료형을 하나에 담을 수 있다
		alist.add("사과");
		alist.add(12345); // 자동으로 래퍼클래스로 박싱처리된다
		alist.add(true);  // (값-->클래스)
		alist.add(12.5);
		alist.add('A');
		
		// 1. 순서가 유지된다
		// 2. toString()이 재정의되어 있다
		System.out.println("alist : "+alist);
		
		// index(순번)를 기준으로 for문을 통해 반복할 수 있다
		for(int i=0;i<alist.size();i++){
			System.out.println(i+" : "+alist.get(i));
		}
		
		// 중복이 허용된다
		alist.add("사과");
		System.out.println("alist : "+alist);
		
		// 배열 중간에 값을 쉽게 추가할 수 있으며, 추가할 때 자리를 밀어낸다
		alist.add(2,"추가");
		System.out.println("alist : "+alist);
		
		// 배열 중간 값을 쉽게 삭제할 수 있으며 빈자리를 자동으로 채운다
		alist.remove(5);
		System.out.println("alist : "+alist);
		
		// 값 변경 시에 set() 메소드를 통해 해당 위치의 값을 변경할 수 있다
		alist.set(3,"포도");
		System.out.println("alist : "+alist);
		
		// 정렬 확인용
		ArrayList sortList=new ArrayList();
		for(int i=0;i<10;i++){
			sortList.add((int)(Math.random()*100)+1);
		}
		System.out.println("정렬 전 : "+sortList);
		// 오름차순 정렬
		Collections.sort(sortList);
		System.out.println("오름차순 정렬 후 : "+sortList);
		// 내립차순 정렬
		Iterator iter=new LinkedList(sortList).descendingIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
