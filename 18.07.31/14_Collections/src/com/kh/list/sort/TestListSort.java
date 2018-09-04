package com.kh.list.sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSort {

	public static void main(String[] args) {
		
		// 샘플데이터 3개 추가
		ArrayList list=new ArrayList();
		list.add(new Product("PAV",500000,0.05));
		list.add(new Product("iPhone",700000,0.03));
		list.add(new Product("Gallaxy",600000,0.01));
		
		for(Object obj:list){
			System.out.println(obj);
		}
		
		// price 기준으로 오름차순 만들기
		list.sort(new AscPriceSort());
		
		for(Object obj:list){
			System.out.println(obj);
		}
		
		// price 기준으로 내림차순 만들기
		list.sort(new DescPriceSort());
		
		for(Object o:list){
			System.out.println(o);
		}
		
		// name 기준으로 오름차순 만들기
		list.sort(new AscNameSort());
		
		for(Object o:list){
			System.out.println(o);
		}
		
		// 할인률 기준 오름차순, 내림차순
		list.sort(new AscDiscountRateSort());		
		for(Object o:list){
			System.out.println(o);
		}
		
		list.sort(new DescDiscountRateSort());
		for(Object o:list){
			System.out.println(o);
		}		
	}

}
