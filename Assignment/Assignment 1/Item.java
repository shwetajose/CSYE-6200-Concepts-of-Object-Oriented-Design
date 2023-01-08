package edu.neu.csye6200.assignment1;

public class Item {

	private int id;
	private double price;
	private String name;
	private int quantity;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Item(int id, double price, String name, int quantity) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPrice() {
		return price * getQuantity();
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
