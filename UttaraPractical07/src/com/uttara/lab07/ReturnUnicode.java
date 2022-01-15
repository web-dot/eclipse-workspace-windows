package com.uttara.lab07;


public class ReturnUnicode {
	
	public static String returnUnicode(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			int j = arr[i];
			sb.append(j).append('.');
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {

		System.out.println(returnUnicode("abd"));
		System.out.println(returnUnicode("happyprogrammer"));

	}

}
