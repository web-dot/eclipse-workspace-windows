package com.uttara.practical02;
import java.io.IOException;
public class PrintHex {
	
	public static void main(String[] args) throws IOException {
		
		
		//1
		
		//assign hex value to int
		int x = 0XCAFE;
		//check result
		System.out.println("decimal value of hex = " + x);
		
		//assign octal to int
		x = 070;
		//check result
		System.out.println("decimal value of octal = " + x);
		
		
		//DOUBTS
		
		String s = "6F";
		int y = Integer.parseInt(s, 16);
		System.out.println(y);
		
		String s1 = "0XCAFE";
		//int y1 = Integer.parseInt(s1, 16);
		//System.out.println(y1);
		
		
		//--------------------------------------
		
		double d1 = 35673829;
		double d2 = 63573562;
		System.out.println(d1+d2);
		
	}

}
