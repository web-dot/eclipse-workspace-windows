package com.collections.test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestDisplayDuplicatesPreservingOrder {

	public static void DisplayDuplicatesPreservingOrder(String str) {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] strings = str.split(" ");
		for(int i = 0; i < strings.length; i++) {
			if(!map.containsKey(strings[i])) {
				map.put(strings[i], 1);
			}
			else {
				map.put(strings[i], map.get(strings[i]) + 1);
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
		
		String str1 = "long long time ago in a very very deep forest";
		DisplayDuplicatesPreservingOrder(str1);
		
	}

}
