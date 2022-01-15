package com.arunsir.problems;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Task05 {
	
	/*
	public static int longestSub(String s) {
		Set<Character> set = new TreeSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			int count = 0;
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) != s.charAt(j)) {
					System.out.println(s.charAt(i));
					count++;
				}
				System.out.println(count);
				if(s.charAt(i) == s.charAt(j)) {
					count = 0;
					//System.out.println(count);
				}
			}
		}
		if(set.size() == 0) {
			return 1;
		}
		System.out.println(set);
		return set.size();
	}
	*/
	
	public static int lengthOfLongestSub(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		int j = 0;
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i) + 1));
			}
			map.put(s.charAt(i), j);
			max = Math.max(max, i-j+1);
		}
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		
		String s1 = "abcabcbb";
		String s2 = "bbbbbb";
		String s3 = "pwwkew";
		
		System.out.println(lengthOfLongestSub(s1));
	}

}
