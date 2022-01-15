package com.uttara.item;

public class TestItem {

	public static void main(String[] args) {
		
		Item i1 = new Item("name");
		System.out.println(i1.name);
		System.out.println(i1.serialNo);
		
		System.out.println("----------------------------------------");
		
		Item i2 = new Item("item2", 1024);
		System.out.println(i2.name);
		System.out.println(i2.price);
		System.out.println(i2.serialNo);
	}

}
