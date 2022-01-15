package com.uttara.collections01;

import java.util.ArrayList;
import java.util.List;

public class TestPersonCollection {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ramu", 21);
		Person p2 = new Person("Gomu", 30);
		Person p3 = new Person("Shamu", 40);
		
		
		List list = new ArrayList();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list);
		
		
		System.out.println("list contains p1 = " + list.contains(p1));
		
		System.out.println("list remove p1 = " + list.remove(p1));
		
		System.out.println(list);

		
	}

}
