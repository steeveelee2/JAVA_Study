package com.week4;

import java.io.*;
import java.util.*;

public class TestWork3 {

	public static void main(String[] args) {
		
		int Max = 5; // 사원 수 5명

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Employee[] emp = new Employee[Max];

		ArrayList<Employee> arr = new ArrayList<>();

		for(int i=0;i<Max;i++) {
			emp[i]=new Employee();
			
			System.out.print("사원 명 : ");
			emp[i].setName(bf.readLine());
			System.out.print("사원나이 : ");
			emp[i].setAge(Integer.valueOf(bf.readLine()));
			System.out.print("사원급여 : ");
			emp[i].setSalary(Integer.valueOf(bf.readLine()));
			System.out.print("사원세율 : ");
			emp[i].setTax(Double.valueOf(bf.readLine()));
			arr.add(emp[i]);
		}

		System.out.println("**** 사원의 정보를 출력합니다 ****");
		System.out.println("사원 명\t나이\t급여\t세율\t실제급여");
		for (Employee e:emp) {
			System.out.println(e.output());
		}
		
		Collections.sort(arr);
		
		System.out.println();
		for (Employee i:arr) {
			System.out.println(i.output());
		}

	}

}
