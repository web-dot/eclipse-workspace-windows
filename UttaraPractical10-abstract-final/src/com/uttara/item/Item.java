package com.uttara.item;

public class Item {
	
	double price;
	String name;
	int serialNo;
	
	public Item(String name) {
		this.name = name;
		serialNo = (int)(Math.floor(Math.random()*1000));
		System.out.println("in Item class single args constr");
	}
	
	
	public Item(String name, double price) {
		this(name);
		this.price = price;
		serialNo = (int)(Math.floor(Math.random()*1000));
		System.out.println("in Item class double args constr");
	}
	
}
