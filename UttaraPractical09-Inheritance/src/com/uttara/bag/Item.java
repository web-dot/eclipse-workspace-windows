package com.uttara.bag;

public class Item {
	
	private String name;
	private double price;
	
	public Item(String n, double p) {
		name = n;
		price = p;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
