package vendingmachine.domain;

public class Item {
	private String name = "";
	private int price = 0;
	private int stock = 0;

	public Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
