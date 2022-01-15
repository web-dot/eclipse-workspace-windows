package com.uttara.test2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Item implements Comparable
{
	private String name;
	private double price;
	
	public Item() {
		
	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name.trim().equals(""))
			throw new IllegalArgumentException("name should not be null or blank");
		
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0)
			throw new IllegalArgumentException("price should not < 0!");
		
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item)
		{
	//		System.out.println("in equals() instanceof if block");
			Item it = (Item) obj;
	//		System.out.println("comparing current obj price "+price+" with passed obj price "+it.price+" and current object name "+name+" with passed obj name "+it.name);
			if(price == it.price && this.name.equals(it.name))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		//return string representation of the objects state!
		return "Item:"+name+","+price;
	}
	
	@Override
	public int hashCode() {
		/*
		 * check the state var used in equals to impl object equality
		 * concat all such var to a string
		 * invoke hashCode() on the string and return it
		 * 
		 */
		String s = (name + price);
		return s.hashCode();
	}
	
	@Override
	public int compareTo(Object o) {
	
		if(o instanceof Item)
		{
			Item it = (Item) o;
			return (int)(this.price - it.price); // this.name.compareTo(it.name)
		}
		else
			throw new IllegalArgumentException("item can only be compared with another item, you mutthal!");
					
	}
}

public class TestHS {

	public static void main(String[] args) {
		
		Item it1 = new Item("reylondspen",20);
		Item it2 = new Item("reylondspen",20);
		
		if(it1.equals(it2))
			System.out.println("items are equal");
		else
			System.out.println("items are not equal");
	
		System.out.println("it1 = "+it1);
		System.out.println("it2 = "+it2);
		
		System.out.println("it1.hashCode() = "+it1.hashCode());
		System.out.println("it2.hashCode() = "+it2.hashCode());
		
		Set items = new HashSet();
		
		System.out.println("adding "+it1+" to items set "+items.add(it1)); //true
		System.out.println("adding "+it2+" to items set "+items.add(it2)); //false!!
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		System.out.println("s1.eq(s2) = "+s1.equals(s2));
		
		System.out.println("s1.hashCode() = "+s1.hashCode());
		System.out.println("s2.hashCode() = "+s2.hashCode());
		
		Set ts = new TreeSet();
		ts.add(it1); // root node
		ts.add(it2); // not added as it is a duplicate
		Item it3 = new Item("heropen",100);
		Item it4 = new Item("camlinmarkerpen",30);
		ts.add(it3); // right side of it1 root node
		ts.add(it4); // right side of it1, left side of it3
		
		System.out.println(ts);
	}

}







