package com.uttara.practical03;

public class CheckPalindrome {

	public static int checkIfPalindrome(int num) {
		String s = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		String sub = s.substring(0, s.length()/2);
		if(s.length() % 2 == 0) {
			sb.append(s.substring(s.length()/2, s.length()));
			sb = sb.reverse();
		}
		if(s.length() % 2 != 0) {
			sb.append(s.substring(s.length()/2+1, s.length()));
			sb = sb.reverse();
		}
		String sub2 = sb.toString();
		if(sub.equals(sub2)) {
			return Integer.parseInt(s);
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		//print integer palindromes from 10 to i mill
		for(int i = 500; i <= 1000000; i++) {
			int r = checkIfPalindrome(i);
			System.out.println(i + " = " + r);
		}
		
		
	}

}
