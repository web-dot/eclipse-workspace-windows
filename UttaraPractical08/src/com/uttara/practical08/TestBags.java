package com.uttara.practical08;

public class TestBags {

	public static void main(String[] args) {
		//creating bag object
		Bag b1 = new Bag(3);
		
		
		//creating item object
		Item i1 = new Item("item1", 20000);
		Item i2 = new Item("item2", 350);
		Item i3 = new Item("item3", 300);
		
		
		//storing items in bag
		b1.storeItem(i1);
		b1.storeItem(i2);
		b1.storeItem(i3);
		
		
		//trying to add extra item
		Item i4 = new Item("item4", 250);
		b1.storeItem(i4);		
		
		
		//checking stored items
		b1.printItems();
		
		
		//searching if a item exist
		b1.searchItem("item1");
		b1.searchItem("item2");
		
		//searching a non existing item
		b1.searchItem("item4");
		
		//total value of the items
		System.out.println(b1.totalPrice());
		
		
		//retrieving item
		Item item = b1.retrieveItem("item1");
		System.out.println(item.getName());
		
		
		//trying to retrieve a non exixting item
		b1.retrieveItem("item4");
		
		System.out.println();
		
		//trying to add after retrieving
		b1.storeItem(i4);
		b1.printItems();
		
		
		
		
	}

}
