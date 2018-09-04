package com.kh.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// Map
		// 데이터를 저장할 때 각각의 데이터들을 구분짓는 고유의 값을 정하여 해당 값으로 접근하는 실제 객체를 구별하려고 할 떄 사용하는 자료구조
		// 해당 객체를 저장할 때 key와 value로 나누어서 각각 set, list의 특성으로 관리한다
		// 많이 사용하는 클래스는 HashMap, TreeMap, Properties가 있다
		
		HashMap hmap=new HashMap();
		Map hmap2=new HashMap();
		
		// map에 값을 저장할때에는 put() 메소드를 사용하는데 key와 value 두 가지 객체를 모두 저장해야한다
		hmap.put("one",new Date());
		hmap.put("two","안녕하세요");
		hmap.put("three",12345); //autoboxing 자동박싱커리가 된다
		
		System.out.println(hmap);
		
		System.out.println(hmap.get("one"));
		System.out.println(hmap.get("four"));
		
		// 저장된 객체를 한 개씩 목록화하여 꺼내는 방법
		// 1. keyset() 메소드 활용
		Set keys=hmap.keySet();
		
		Iterator iter=keys.iterator();
		while(iter.hasNext()){
			// key 객체를 한개씩 꺼내오는 구문
			Object obj=iter.next();
			System.out.println(hmap.get(obj));
		}
		
		// 2. values() 메소드 활용
		Collection values=hmap.values();

		Iterator iter2=values.iterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}		
		
		// 3. Map.Entry 객체 활용, key와 value 모두를 출력하는 방법
		Set entrySet=hmap.entrySet();
		Iterator iter3=entrySet.iterator();
		
		while(iter3.hasNext()){
			// key와 value 모두를 가지고 있는 객체를 꺼내어 온다
			Map.Entry entry=(Map.Entry)iter3.next();
			// key와 value를 각각 분리한다
			String key=(String)entry.getKey();
			Object value=(Object)entry.getValue();
			// 출력하여 확인한다
			System.out.println(key+" / "+value);
		}
	}

}
