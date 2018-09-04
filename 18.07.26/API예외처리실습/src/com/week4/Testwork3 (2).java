package com.week4;

import java.io.*;
import java.util.*;

public class Testwork3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int max = 5; // 사원 수 5명

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Employee[] emp = new Employee[max];
		
		ArrayList<Employee> arr = new ArrayList<>();
		
		for(int i = 0; i<max; i++){
			emp[i] = new Employee();
			
			System.out.print("사원이름 : ");
			emp[i].setName(bf.readLine());
			System.out.print("사원나이 : ");
			emp[i].setAge(Integer.valueOf(bf.readLine()));
			System.out.print("사원급여 : ");
			emp[i].setSalary(Integer.valueOf(bf.readLine()));
			System.out.print("사원세율 : ");
			emp[i].setTax(Double.valueOf(bf.readLine()));
			arr.add(emp[i]);
			
			
		}
		System.out.println("----- 사원 정보 -----");
		
		for (Employee e:emp) {
			System.out.println(e.empInfo());
		}
		
	
		
		System.out.println();
		for (Employee e:arr) {
			System.out.println(e.empInfo());
		}

	}

}
