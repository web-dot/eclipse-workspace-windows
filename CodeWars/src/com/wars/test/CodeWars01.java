package com.wars.test;
import java.util.ArrayList;
import java.util.List;

public class CodeWars01 {	

	
	//whoLikesIt
	
	public static String whoLikesIt(String... names) {
		String output = "";
		if(names.length == 1) {
				return names[0] + " likes this";
		}
		else if(names.length == 2) {
				return names[0] + " and " + names[1] + " like this";
		}
		else if(names.length == 3) {
				return names[0] + ", "+ names[1] + " and " + names[2] + " like this"; 
		}
		else if(names.length > 3) {
			return names[0] + ", "+ names[1] + " and " + (names.length-2) + " others like this"; 
		}
		else
			return "no one likes this";
	}
	
	
	//calculate factorial of a number
	public static int factorial(int n) {
		int factorialOf = 1;
		for(int i = 1; i <= n; i++) {
			factorialOf = factorialOf * i;
		}
		return factorialOf;
	}
	
	
	public static String decomp(int n) {
		
		//calculating factorial of n
		int factorialOf = 1;
		for(int i = 1; i <= n; i++) {
			factorialOf = factorialOf * i;
		}
		System.out.println("factorial = " + factorialOf);
		//putting prime factors of n into a list
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				list.add(i);
			}
		}
		System.out.println(list);
		String out = "";
		for(int i = 0; i < list.size(); i++) {
			int d = factorialOf / list.get(i);
			out = out + list.get(i) + "^" + d + " * ";
		}
		return out.replace('*', ' ');
    }
	
	//Check to see if a string has the same amount of 'x's and 'o's. 
	//The method must return a boolean and be case insensitive. 
	//The string can contain any char.
	
	
	
	
	public static void main(String[] arguments) {
		
		System.out.println(decomp(12));
		
		
		
		//Solution s1 = new Solution();
		//System.out.println(whoLikesIt("jacob", "peter", "mark", "sharon"));
	}

}








