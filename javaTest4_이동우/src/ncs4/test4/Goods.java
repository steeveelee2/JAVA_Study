package ncs4.test4;

public class Goods {
	
	private String name;
	private int price;
	private int quantity;
	
	public Goods() {}
	
	public Goods(String name,int price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return name+", "+price+"원, "+quantity+"개";
	}
	
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
}
