package com.uttara.practical08;

public class X {

	//---(4)----instance field created
	//---(5)----instance field initializer executed
	int a = 10;
	
	//---(1)----static field created
	//---(2)----static field initializers executed
	static int b = 15;
	
	//static initializer----->1
	static{
		System.out.println("---(3)----static initializer executed");
		System.out.println("in static init 1 b = " + b);
		b = 20;
	}
	
	//static initializer----->2
	static{
		System.out.println("---(3)----static initializer executed");
		System.out.println("in static init 2 b = " + b);
		b = 30;
	}
	
	//instance initializer---->1
	{
		System.out.println("---(6)----instance initializer executed");
		System.out.println("in inst init 1 a = " + a);
		a = 20;
	}
	
	//instance initializer---->2
	{
		System.out.println("---(6)----instance initializer executed");
		System.out.println("in inst init 2 a = " + a);
		a = 30;
	}
	
	//constructor
	public X() {
		System.out.println("---(7)----constructor executed");
		System.out.println("in no argument const a = " + a);
		a = 40;
	}
	
	public X(int p) {
		a = p;
		System.out.println("---(7)----constructor executed");
		System.out.println("in parameterized const a = " + a);
	}
	
	
	static void process(int i) {
		System.out.println("int as argument");
		int j = i;
		
	}
	
	static void process(long l) {
		System.out.println("long as argument");
	}
	
	static void process(float f) {
		System.out.println("float as argument");
	}
	
	
	
	
	
	
	
	

}


