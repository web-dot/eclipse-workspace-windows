package com.uttara.x;

public class X {
	
	int a = 10;
	static int b = 15;
	
	
	static
	{
		System.out.println("in static init 1 of X, b = " + b);
		b = 20;
	}
	
	
	static 
	{
		System.out.println("in static init 2 of X, b = " + b);
		b = 100;
	}
	
	
	{
		System.out.println("in inst init 1 of X, a = " + a);
		a = 20;
	}
	
	{
		System.out.println("in inst init 2 of X, a = " + a);
		a = 30;
	}
	
	
	public X() {
		System.out.println("in no arg constr of X, a = " + a);
		a = 40;
	}
	
}
