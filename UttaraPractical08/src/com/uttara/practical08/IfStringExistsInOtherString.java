package com.uttara.practical08;

public class IfStringExistsInOtherString {
	
	
	public static boolean IfStringExists(String subString, String mainString) {
		
		char[] arr1 = subString.toCharArray();
		char[] arr2 = mainString.toCharArray();
		
		int count = 0;
		if(subString.length() > mainString.length()) {
			System.out.println("substring is can not be longer than mainstring");
		}
		if(subString.equals(" ") && mainString.equals(" ") || subString.isEmpty() && mainString.isEmpty()) {
			return true;
		}
		if(arr1[0] == arr2[0]) {
			return true;
		}
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		if(count < arr2.length) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(IfStringExists("Jdk", "JavaJdk"));
		System.out.println(IfStringExists("conductor", "semi-conductor"));
		System.out.println(IfStringExists("hello world", "hello"));
		System.out.println(IfStringExists("", ""));
		System.out.println(IfStringExists(" ", " "));
		System.out.println(IfStringExists("i", "ai"));
		System.out.println(IfStringExists("i", "i"));
	}

}
