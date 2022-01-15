package com.uttara.practical08;


public class ParseStringWithoutLib {
	
	//accept a string and parse into int without using library parse functions
	
	
	//FOLLOWING ROUTINE FAILS FOR NEGETIVE INTEGERS
	//I AM TRYING TO RREFACTOR
	
	public static int parseWithoutLib(String str) {
		int res = 0;
		int len = str.length();
		
		char[] arr = str.toCharArray();
		
		//checking if string is empty
		if(str.equals("")) {
			throw new NumberFormatException();
		}
		
		//iterating over string to check if character is a digit
		for(int i = 0; i < arr.length; i++) {
			char c = str.charAt(i);
			int s = 0;
		
			if(c < 48 || c > 57) {
				throw new NumberFormatException();
			}
			else if(c >= 48 && c <= 57) {
				int v = (c-48)*(int)(Math.pow(10, len-i-1));
				res = res + v;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(parseWithoutLib("1764"));
		System.out.println(parseWithoutLib("12"));
		System.out.println(parseWithoutLib("0"));
		//System.out.println(parseWithoutLib("")); //NFE
		//System.out.println(parseWithoutLib("-1")); //NFE
		
		
	}
	
}
