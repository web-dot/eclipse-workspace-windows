package com.uttara.lab07;

public class X {
	
	public static void test(long l) {
		System.out.println("long as argument");
	}
	
	public static void test(double d) {
		System.out.println("double as argument");
	}
	
	
	public static void test(short s) {
		System.out.println("short as argument");
	}
	
	
	public static void main(String[] args) {
		
		test(5); //overloaded method with long as parameter is executed ->implicit up-cast,widening conv
		int i = 5;
		long l = i;
		
		test(5.5); // overloaded method with double as parameter is executed -> 5.5 is a double literal
		double d = 5.5;
		
		test(5.5f); // overloaded method with double as parameter is executed  ->->implicit up-cast,widening conv
		float f = 5.5f;
		double d2 = f;
		
		test(10L); //overloaded method with long as parameter is executed -> 10L is a long literal
		long l2 = 10L;
		
	}
	
	
	
}
