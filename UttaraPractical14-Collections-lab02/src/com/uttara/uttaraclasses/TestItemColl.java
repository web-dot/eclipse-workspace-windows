package com.uttara.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestItemColl {

	public static void main(String[] args) {
		
		List<Item> items1 = new ArrayList<Item>();
		
		Item i1 = new Item("pen",100);
		Item i2 = new Item("pen",100);
		Item i3 = new Item("cap",400);
		Item i4 = new Item("duster",50);
		Item i5 = new Item("notebook",90);
		
		System.out.println("is i1==i2 ? "+(i1==i2));
		System.out.println("is i1.equals(i2) ? "+i1.equals(i2));
		System.out.println("i1.hashCode() = "+i1.hashCode());
		System.out.println("i2.hashCode() = "+i2.hashCode());
		System.out.println("i1 = "+i1);
		
		items1.add(i1);
		items1.add(i2);
		items1.add(i3);
		items1.add(i4);
		items1.add(i5);
		
		System.out.println("unsorted "+items1);
		Collections.sort(items1);
		System.out.println("sorted "+items1);

		ItemNameComparator inc = new ItemNameComparator();
		Collections.sort(items1, inc);
		System.out.println("sorted names "+items1);
		
		
		
	}

}








