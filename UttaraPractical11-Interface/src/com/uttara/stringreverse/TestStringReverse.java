package com.uttara.stringreverse;

public class TestStringReverse {

	public static void main(String[] args) {
		
		ReverseString sr01 = new ReverseString();
		
		
		//checking reverseStringFast
		
		System.out.println(sr01.reverseStringFast("hello"));
		System.out.println(sr01.reverseStringFast("programming language"));
		
		

		System.out.println();
		
		System.out.println(sr01.reverseStringABitSlow("hello"));
		System.out.println(sr01.reverseStringABitSlow("programming language"));
		
		
		
		
	}

}
