package ncs4.test5;

import java.io.Serializable;

public class Book implements Serializable {
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title,String author,int price,String publisher,double discountRate) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
		this.discountRate=discountRate;
	}
	
	@Override
	public String toString() {
		return title+", "+author+", "+publisher+", "+price+"원, "+discountRate*100+"\\% 할인";
	}
	
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}

}
