package com.wars.test;

class Solution {
	public static String whoLikesIt(String... names) {
		
		String output = "";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names.length);
			if(names.length == 0) {
				output = output +  names[0] + "no one";
			}
			else if(names.length > 0 && names.length <= 2) {
				output = output + names[i] + " ";
			}
			else if(names.length > 2) {
				output = names[0] + " "+ names[1] + " and " + (names.length-2) + " others"; 
			}
		}
		return output + "likes this";
	}
}


public class Test {
	
	public static String check(String... s) {
		String o = "";
		if(s.length == 0) {
			o = "hello";
		}
		return o + " hi";
	}
	

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
	
	public static void main(String[] args) {
		 
		//Solution s1 = new Solution();
		System.out.println(whoLikesIt("jacob", "peter", "mark", "sharon"));

		//System.out.println(check());
		
		
	}

}








