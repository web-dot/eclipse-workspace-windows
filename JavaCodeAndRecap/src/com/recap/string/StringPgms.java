package com.recap.string;

public class StringPgms {

	//reverse a string
	public static String reverseString(String str) { //code   edoc  dynamic  cimanyd
		char[] ca = str.toCharArray();
		for(int i = 0; i < str.length()/2; i++) {
			System.out.println("Bca -> " + ca[i]);
			System.out.println("Bcal -> " + ca[ca.length-i-1]);
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[ca.length-i-1] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
			System.out.println();
			System.out.println("Aca -> " + ca[i]);
			System.out.println("Acal -> " + ca[ca.length-i-1]);
			System.out.println();
		}
		return "";
	}
	
	public static String swapStrings(String s1, String s2) {
		String t = s1;
		s1 = s2;
		s2 = t;
		return s1;
	}
	
	//swap strings using char array
	public static String swapStringsUsingCharArray(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(int i = 0; i < c1.length; i++) {
			//System.out.println("B c1[i] = " + c1[i]);
			System.out.println("B c2[i] = " + c2[i]);
			System.out.println();
			c1[i] = (char)(c1[i] ^ c2[i]);
			c2[i] = (char)(c1[i] ^ c2[i]);
			c1[i] = (char)(c1[i] ^ c2[i]);
			//System.out.println("A c1[i] = " + c1[i]);
			System.out.println("A c2[i] = " + c2[i]);
			System.out.println();
		}
		return new String(c1);
	}
	public static void main(String[] args) {
		
		String r = reverseString("code");
		System.out.println(r);
	}

}