package com.arunsir.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task04 {

	
	//task04
	public static void groupAnagrams(String[] arr) {
		
		Map<String, List<String>> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			String word = arr[i];
			//System.out.println(word);
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String newWord = new String(letters);
			if(map.containsKey(newWord)) {
				map.get(newWord).add(word);
			}
			else {
				List<String> words = new ArrayList<String>();
				words.add(word);
				map.put(newWord, words);
			}
		}
		for(String s : map.keySet()) {
			List<String> values = map.get(s);
			System.out.println(values);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(arr);
	}

}
