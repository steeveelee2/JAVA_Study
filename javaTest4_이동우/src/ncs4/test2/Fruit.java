package ncs4.test2;

public class Fruit {
	
	private String name;
	private int price;
	private int quantity;
	
	public Fruit(){}
	
	public Fruit(String name,int price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return name+", "+price+", "+quantity;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}

}
