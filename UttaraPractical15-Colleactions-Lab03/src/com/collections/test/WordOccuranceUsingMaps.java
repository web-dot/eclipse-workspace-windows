package com.collections.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordOccuranceUsingMaps {
	
	public static void wordsOccuranceUsingMap(String sentence) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] sa = sentence.split(" ");
		for(int i = 0; i < sa.length; i++) {
			if(map.containsKey(sa[i])) {
				map.put(sa[i], map.get(sa[i]) + 1);
			}
			else {
				map.put(sa[i], 1);
			}
		}
		for(String s : map.keySet()) {
			String word = s;
			int value = map.get(s);
			System.out.println(s + " : " + value);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a senetence");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String sentence = br.readLine();
		
		wordsOccuranceUsingMap(sentence);

	}

}
