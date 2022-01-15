package com.uttara.bag;

public class TestBags {

	public static void main(String[] args) {
		//creating bag object
		Bag b1 = new Bag("workbag", 3);
		
		
		//CREATING ITEMS
		Item i1 = new Item("laptop", 20000);
		Item i2 = new Pen("Hero", 250);
		Item i3 = new NoteBook("Shivam Notebook", 100);
		
		//ADD ITEMS
		b1.addItem(i1);
		b1.addItem(i2);
		b1.addItem(i3);
		
		
		//ADD EXTRA ITEM
		Item i4 = new Pen("Jinhao", 450);
		b1.addItem(i4);		
		
		
		//PRINT ADDED ITEMS
		b1.printItems();
		
		
		//SEARCH ITEM
		b1.searchItem("laptop");
		b1.searchItem("Hero");
		
		//SEARCH NON EXISTING ITEM
		b1.searchItem("Train Ticket");
		
		//GET PRICE OF SINGLE ITEM
		System.out.println(b1.getItemPrice("laptop"));
		
		
		//GET TOTAL PRICE
		System.out.println(b1.totalPrice());
		
		System.out.println("-------GET ITEM AT 1");
		//GET ITEM
		System.out.println(b1.getItem(1).getName());
		
		
		
		
	}

}
