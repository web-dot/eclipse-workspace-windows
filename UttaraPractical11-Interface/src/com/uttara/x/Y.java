package com.uttara.x;

public class Y extends X{
	
	int c = 10;
	static int d = 15;
	
	
	static
	{
		System.out.println("in static init 1 of Y, d = " + d);
		d = 20;
	}
	
	
	static 
	{
		System.out.println("in static init 2 of Y, d = " + d);
		d = 100;
	}
	
	
	{
		System.out.println("in inst init 1 of Y, c = " + c);
		c = 20;
	}
	
	{
		System.out.println("in inst init 2 of Y, c = " + c);
		c = 30;
	}
	
	
	public Y() {
		System.out.println("in no arg constr of Y, c = " + c);
		c = 40;
	}
}
