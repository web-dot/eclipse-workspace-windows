package com.uttara.collections;

public class Item implements Comparable 
{

	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name.trim().equals(""))
			throw new IllegalArgumentException("name cannot be blank or null");
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0)
			throw new IllegalArgumentException("price cannot be negative, you -ve yappa!");
		this.price = price;
	}
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Item)
		{
			Item it = (Item) obj;
			if(this.name.equals(it.name) && this.price == it.price)
				return true;
			else
				return false;
			
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		
		return "Item:"+name+","+price;
		
	}
	@Override
	public int hashCode() {
	
		return (name + price).hashCode();
	}
	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Item)
		{
			Item it = (Item) o;
			
			return (int)(this.price - it.price);
		}
		else
			throw new IllegalArgumentException("can only compare items");
	}
}








