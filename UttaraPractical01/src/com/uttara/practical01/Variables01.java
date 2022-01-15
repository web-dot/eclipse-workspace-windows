package com.uttara.practical01;

public class Variables01 {
	
	

	//11
	public static void divideInts(int a, int b) {
		int rem = a % b;
		int quo = a / b;
		System.out.println("remander is : " + rem);
		System.out.println("quotient is : " + quo);
	}
	
	
	public static void bitwiseOp(int num) {
		
	}

	public static void main(String[] args) {
		
		
		//method call
		divideInts(10, 5);
		
		
		System.out.println("----------------12----------------------");
		
		byte b = 127;
		byte a = (byte)(b + 10); //explicit cast //overflow
		
	}

}
