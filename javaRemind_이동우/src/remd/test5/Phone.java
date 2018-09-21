package remd.test5;

public class Phone {
	
	private String model;
	private int price;
	private String manufacture;
	private int quantity;
	
	public Phone(){}
	
	// 이하 자동생성(귀찮기 때문)

	public Phone(String model, int price, String manufacture, int quantity) {
		this.model = model;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return model + ", " + price + ", " + manufacture + ", " + quantity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
