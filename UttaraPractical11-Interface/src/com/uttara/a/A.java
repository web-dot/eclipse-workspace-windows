package com.uttara.a;

public class A {
	
	static String name = "A";
	
	public A() {
		System.out.println("in A constr");
	}
	
	public static void print() {
		System.out.println("in A print() " + name);
	}
	
}



class B extends A{
	
	static String name = "B";
	
	
	public B() {
		System.out.println("in B constr");
	}
	
	public static void print() {
		System.out.println("in B print() " + name);
	}

}
