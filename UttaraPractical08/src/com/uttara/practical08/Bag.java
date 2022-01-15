package com.uttara.practical08;

import java.util.Arrays;

public class Bag {
	
	private int maxItems;
	private Item[] items;
	private int count = 0;
	
	
	public Bag(int maxItems) {
		this.maxItems = maxItems;
		items = new Item[maxItems];
	}
	
	public void storeItem(Item item) {
		if(count < maxItems) {
			items[count] = item;
			count++;
		}
		else {
			System.out.println("Your Bag is Full, can't add more stuff!!");
		}
	}
	
	public Item retrieveItem(String name) {
		Item releaseItem;
		for(Item i : items) {
			if(i.getName().equals(name)) {
				return i;
			}
			count--;
		}
		System.out.println(name + " does not exist in bag");
		return null;
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
	
	
	public int totalPrice() {
		int sum = 0;
		for(Item i : items) {
			sum = sum + i.getPrice();
		}
		return sum;
	}
	
	
}
