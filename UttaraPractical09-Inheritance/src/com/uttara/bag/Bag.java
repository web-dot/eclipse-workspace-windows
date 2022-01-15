package com.uttara.bag;

import java.util.Arrays;

public class Bag {
	
	
	String name;
	private int maxItems;
	private Item[] items;
	private int count = 0;
	
	
	
	public Bag(String n, int size) {
		
		name = n;
		items = new Item[size];
	}
	
	
	public void addItem(Item item) {
		if(count < items.length) {
			items[count] = item;
			count++;
		}
		else {
			System.out.println("Your Bag is Full, can't add more stuff!!");
		}
	}
	
	public Item getItem(int pos) {
		Item ret = null;
		if(pos >= items.length || pos < 0) {
			System.out.println("There is no item at this index");
		}
		else {
			ret =  items[pos];
		}
		count--;
		return ret;
	}
	
	public boolean searchItem(String name) {
		if(items.length > 0) {
			for(Item i : items) {
				if(i.getName().equals(name)) {
					System.out.println(name + " exists");
					return true;
				}
			}
		}
		System.out.println(name + " does not exist in bag");
		return false;
	}
	
	public void printItems() {
		for(Item i : items) {
			System.out.println(i.getName());
		}
	}
	
	public double getItemPrice(String n) {
		for(Item s : items) {
			if(s.getName().equals(n)) {
				return s.getPrice();
			}
		}
		System.out.println("This item is not in your Bag!!!");
		return 0;
	}
	
	
	public double totalPrice() {
		double sum = 0;
		for(Item i : items) {
			sum = sum + i.getPrice();
		}
		return sum;
	}
	
	
}
