package com.uttara.practical02;

public class CheckIntValues {
	
	
	public static int subtractInts(int a, int b) {
		return a - b;
	}
	
	public static void divideInts(int a, int b) {
		int rem = a % b;
		int quo = a / b;
		System.out.println("remainder is = " + rem);
		System.out.println("quotient  is = " + quo);
	}
		
		public static void main(String[] args) {
			
			//6 subtract ints
			int a =	Integer.MAX_VALUE + 2;
			int b = 1;
			System.out.println("difference between ints = " + subtractInts(a, b));
			
			//7 multiply ints
			int x = 20;
			int y = 400;
			System.out.println("multiply int values = " + (x * y));
			
			//multiply doubles
			double d1 = 432.5;
			double d2 = 119.5;
			System.out.println("multiply double values = " + (d1 * d2));
			
			//8 divide ints
			int i1 = 100;
			int i2 = (int)20;
			divideInts(i1, i2);
			
			
	}
}


