package com.drive.herizen;

import java.util.Arrays;

public class TestBreak01 {

	// check if integer is palindrome
	public static boolean isPalindromeInteger(String str) {
		int num = Integer.parseInt(str);
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			System.out.println("rem = " + rem);
			System.out.println("sum before = " + sum);
			sum = (sum * 10) + rem;
			System.out.println("sum after = " + sum);
			num = num / 10;
			System.out.println("num = " + num);
			System.out.println();
		}
		return false;
	}
	
	public static boolean isPalindromeString(String str) {
		if(str.length() % 2 == 0) {
			System.out.println("even");
			String s1 = str.substring(0, str.length()/2);
			String s2 = str.substring(str.length()/2, str.length());
			
			char[] ca = s2.toCharArray();
			
			for(int i = 0; i < ca.length/2; i++) {
				ca[i] = (char)(ca[i] + ca[ca.length-i-1]);
				ca[ca.length-i-1] = (char)(ca[i] - ca[ca.length-i-1]);
				ca[i] = (char)(ca[i] - ca[ca.length-i-1]);
			}
		
			s2 = new String(ca);
			if(s1.equals(s2)) {
				return true;
			}
		}
		else if(str.length() % 2 == 1){
			System.out.println("odd");
			String s1 = str.substring(0, str.length()/2);
			String s2 = str.substring(str.length()/2+1, str.length());
			
			char[] ca = s2.toCharArray();
			
			for(int i = 0; i < ca.length/2; i++) {
				ca[i] = (char)(ca[i] + ca[ca.length-i-1]);
				ca[ca.length-i-1] = (char)(ca[i] - ca[ca.length-i-1]);
				ca[i] = (char)(ca[i] - ca[ca.length-i-1]);
			}
			s2 = new String(ca);
			if(s1.equals(s2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		// check if passed integer is a palindrome
		// System.out.println(isPalindromeInteger("11511"));
		// System.out.println(111/10);
		
		System.out.println(isPalindromeString("lkvvll")); 
			
	}

}
