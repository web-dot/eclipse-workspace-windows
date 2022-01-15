package com.arunsir.problems;

public class Task02 {

	//Task 02
	public static int lastWordLength(String s) {
		int length = 0;
		if(s.length() <= 1) {
			return s.length();
		}
		else if(s.length() > 1) {
			String[] strArr = s.split(" ");
			for(int i = strArr.length-1; i > 0; i--) {
				length = strArr[i].length();
				break;
			}
		}
		return length;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int l1 = lastWordLength("hello world");
		int l2 = lastWordLength("I am");
		int l3 = lastWordLength("I");
		int l4 = lastWordLength("");
		int l5 = lastWordLength("Java is my passion");
		
		
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
	}

}
