package com.uttara.collections01;

public class CompareString {

	public static void main(String[] args) {


		String str1 = new String("Collections");
		String str2 = new String("Collections");
		
		System.out.println("using == : " + (str1 == str2));	//false
		System.out.println("calling equals() on str1 : " + str1.equals(str2)); // true
		
		//overridden equals() implementation of String class is picked up
		
		
		/*
		String str3 = "Collections";
		String str4 = "Collections";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		*/

	}

}
