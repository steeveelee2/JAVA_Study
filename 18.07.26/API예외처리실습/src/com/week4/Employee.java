package com.week4;

public class Employee {
	
	private String name;
	private int age;
	private int salary;
	private double tax;
	
	public Employee(){}
	
	public Employee(String name, int age, int salary, double tax) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.tax = Math.round(tax*100)*0.01;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setTax(double tax) {
		this.tax = Math.round(tax*100)*0.01;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public double getTax() {
		return tax;
	}
	
	public String empInfo(){
		return name+"\t"+age+"\t"+salary+"\t"+tax+"\t"+(int)(salary*(1-tax));
	}
	
	public int compareTo(Employee o) {
		if(this.name.compareTo(o.getName()) > 0)
			return 1;
		else if (this.name.compareTo(o.getName()) < 0)
			return -1;
		return 0;
	}

}
