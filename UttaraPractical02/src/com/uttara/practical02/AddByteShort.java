package com.uttara.practical02;

public class AddByteShort {

	public static void main(String[] args) {
		
		//4
		
		byte a = 28;
		short b = 100;
		//short s = a + b; //compile time error // incompatible types from int to short
		short s = (short)(a + b); //explicit cast // compiles sucessfully
		System.out.println("s = " + s);
	}

}
