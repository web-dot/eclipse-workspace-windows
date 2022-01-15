package com.uttara.init;

public class X {
	
	//[8][9]
	int a = 10;
	
	//[1][2]
	static int b = 15;
	
	static{
		System.out.println("[3]in static initializer 1 of X, b = " + b);
		b = 20;
	}
	
	static{
		System.out.println("[3]in static initializer 2 of X, b = " + b);
		b = 30;
	}
	
	
	
	{
		System.out.println("[10]in instance initializer 1 of X, a = " + a);
		a = 20;
	}
	
	{
		System.out.println("[10]in instance nitializer 2 of X, a = " + a);
		a = 30;
	}
	
	X(){
		System.out.println("[11]in no argument constructor of X, a = " + a);
		a = 40;
	}
	
	
	public X(int x) {
		System.out.println("in X param constr with x = " + x);
		a=x;
	}
	
}



class Y extends X{
	
	//[12][13]
	int c = 10;
	
	//[5][6]
	static int d = 25;
	
	
	//instance initializers
	{
		System.out.println("[14]in instance initializer 1 of Y c = " + c);
		c = 20;
	}
	
	{
		System.out.println("[14]in instance initializer 2 of Y c = " + c);
		c = 30;
	}
	
	//static initializers
	static {
		System.out.println("[7]in static initializer 1 of Y d = " + d);
		d = 35;
	}
	
	static {
		System.out.println("[7]in static initializer 2 of Y d = " + d);
	}
	
	public Y(){
		System.out.println("[15]in no argument constructor of Y, c = " + c);
		c = 40;
	}
	
	public Y(int y) {
		super(y);
		System.out.println("in Y param constr with y = " + y);
		c = y;
	}
	
	
	
}