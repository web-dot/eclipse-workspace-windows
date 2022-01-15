package com.wars.test;

import java.util.Arrays;

public class kyu8 {
	
	
	//Write a function that will take the number of petals of each flower and 
	//return true if they are in love and false if they aren't.
	
	public static boolean isLove(final int flower1, final int flower2) {
		if(flower1 == 1 && flower2 == 1) {
			return false;
		}
		else if(flower1 % 2 == 0 && flower2 % 2 == 0) {
			return false;
		}
		return true;
	}
	
	//Create a function that accepts 2 string arguments and returns an 
	//integer of the count of occurrences the 2nd argument is found in the first one.
	public static int strCount(String str, char letter) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}
	
	
	//speed of cockroach
	public static int cockroachSpeed(double x) {
		double cSpeed = x * (250.0 / 9.0);
		return (int)cSpeed;
	}
	
	//check if x exist in array
	public static boolean check(Object[] a, Object x) {
		if(a[0] instanceof String) {
			for(int i = 0; i < a.length; i++) {
				if(a[i].equals(x)) {
					return true;
				}
			}
		}
		if(a[0] instanceof Integer) {
			for(int i = 0; i < a.length; i++) {
				if(a[i].equals(x)) {
					return true;
				}
			}
		}
		if(a[0] instanceof Character) {
			for(int i = 0; i < a.length; i++) {
				if(a[i].equals(x)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	//twice as old
	public static int twiceAsOld(int dadYears, int sonYears) {
		int count = 1;
		if(sonYears < dadYears/2) {
			int countA = 1;
			while(dadYears / 2 != sonYears) {
				dadYears++;
				sonYears++;
				countA++;
			}
			return countA;
		}
		if(sonYears > dadYears/2) {
			int countB = 0;
			while(dadYears / 2 != sonYears) {
				dadYears--;
				sonYears--;
				countB++;
			}
			return countB;
		}
		return count;
	}
	
	//sort and star
	public static String sortAndStar(String[] s) {
		Arrays.sort(s);
		StringBuilder sb = new StringBuilder();
		String f = s[0];
		String n = "";
		for(int i = 0; i<f.length()-1; i++) {
			char c = f.charAt(i);
			n = sb.append(c+"***").toString();
		}
		return n + f.charAt(f.length()-1);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sortAndStar(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
		
		//System.out.println(twiceAsOld(45, 30));
		
		//System.out.println(check(new Object[] {'c', 'd'}, 'f'));	
		//System.out.println(cockroachSpeed(1.08));
		//System.out.println(strCount("Hello", 'l'));
		//System.out.println(isLove(1, 1));

	}

}
