package silsub3;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {
	
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;
	
	public Book() {}

	public Book(String title,String author,int price,Calendar dates,double discountRate) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.dates=dates;
		this.discountRate=discountRate;
	}

	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String autor) {
		this.author=autor;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setDates(Calendar dates) {
		this.dates=dates;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate=discountRate;
	}

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public Calendar getDates() {
		return dates;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		return title+"\t"+author+"\t"+price+"\t"+sdf.format(dates.getTime())+"\t"+discountRate;
	}
	
}
