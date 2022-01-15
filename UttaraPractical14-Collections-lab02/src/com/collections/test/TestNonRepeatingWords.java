package com.collections.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestNonRepeatingWords {
	public static void NonRepeatingWords(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] strings = str.split(" ");
		for(int i = 0; i < strings.length; i++) {
			if(map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i]) + 1);
			}
			else {
				map.put(strings[i], 1);
			}
		}
		for(String s : map.keySet()) {
			int value = map.get(s);
			if(value == 1) {
				System.out.print(s + " ");
				}
			}
		}	
	
	public static void main(String[] args) {
		
		String sentence = "this this is is a what how what is";
		NonRepeatingWords(sentence); 

		
	}

}
