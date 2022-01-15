package com.uttara.practical02;

public class AddInt {

	public static int addInt(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static double addDouble(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		//2
		
		//add two ints
		int a = 10;
		int b = 20;
		int r = addInt(a, b);
		System.out.println("int sum = " + r);
		
		//add two doubles
		double d1 = 356728690;
		double d2 = 763452314;
		double d = addDouble(d1, d2);
		System.out.println("double sum = " + d);
		
		//3
		
		char c = 'a' + 100;
		System.out.println("value of char c : " + c);
		System.out.println("int value of c : " + (int)c);
		
	}

}
