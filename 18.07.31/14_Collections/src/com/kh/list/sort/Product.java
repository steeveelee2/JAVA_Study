package com.kh.list.sort;

public class Product {
	
	private String name;
	private int price;
	private double discountRate;
	
	public Product(){}

	public Product(String name, int price, double discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String toString(){
		return name+", "+price+", "+discountRate;
	}
	
	

}
