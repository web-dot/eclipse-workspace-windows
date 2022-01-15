package com.drive.herizen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
	
	public static boolean checkAnagram(String s1, String s2) {
		
		char[] ca1 = s1.toCharArray();
		char[] ca2 = s2.toCharArray();

		Arrays.sort(ca1);
		Arrays.sort(ca2);
		
		String str1 = String.valueOf(ca1);
		String str2 = String.valueOf(ca2);
		
		
		if(str1.equals(str2)) {
			return true;
		}
		return false;
		
	} 
	
	
	
	public static boolean checkPalindrome() throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		
		char[] ca = str.toCharArray();
		
		if(Character.isDigit(ca[0])) {
			int num = Integer.parseInt(str);
			int rem = 0;
			int sum = 0;
			int temp = num;
			while(num > 0) {
				rem = num % 10;
				sum = (sum * 10) + rem;
				num = num / 10;
			}
			if(temp == sum) {
				return true;
			}
			return false;
		}
		if(Character.isLetter(ca[0])) {
			
			if(str.length() == 1) {
				return false;
			}
			else if(str.length() == 2) {
				if(str.charAt(0) == str.charAt(1)) {
					return true;
				}
			}
			else if(str.length() > 2 && str.length() % 2 == 0) {
				String sub1 = str.substring(0, str.length()/2);
				String sub2 = str.substring(str.length()/2, str.length());
				StringBuilder sb = new StringBuilder(sub2);
				String sub3 = sb.reverse().toString();
				if(sub1.equals(sub3)) {
					return true;
					}
				}
			else if(str.length() > 2 && str.length() % 2 == 1) {
				String sub1 = str.substring(0, str.length()/2);
				String sub2 = str.substring(str.length()/2 + 1, str.length());
				StringBuilder sb = new StringBuilder(sub2);
				String sub3 = sb.reverse().toString();
				if(sub1.equals(sub3)) {
					return true;
					}
			}
		}
		return false;
	}
	
	
	public static int pagination(int totalRecords, int recordsPerPage) {
		
		if((totalRecords % recordsPerPage == 0)) {
			return  totalRecords / recordsPerPage;
		}
		else
			return totalRecords / recordsPerPage + 1;
	}

	public static void main(String[] args) throws IOException {
		
		String s1 = "CAT";
		String s2 = "TAT";
		
		//System.out.println(checkAnagram(s1, s2));

		//System.out.println(checkPalindrome());	
		
		System.out.println(pagination(70, 12)); 
		
		
	}

}
