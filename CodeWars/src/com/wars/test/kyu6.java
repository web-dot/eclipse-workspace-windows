package com.wars.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class kyu6 {
	
	//check if pangram
	public static boolean checkPangram(String sentence) {
		int[] arr = new int[26];
		StringBuilder sb = new StringBuilder();
		String nsen = sentence.toLowerCase();
		for(int i = 0; i < nsen.length(); i++) {
			char c = nsen.charAt(i);
			if(Character.isLetter(c)) {
				sb.append(c);
			}
		}
		nsen = sb.toString();
		for(int i = 0; i < nsen.length(); i++) {
			char c = nsen.charAt(i);
			arr[(int)c - 'a']++;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 1) {
				count++;
			}
		}
		System.out.println(count);
		if(count >= 26) {
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(checkPangram("The quick brown fox jumps over the lazy dog"));

	}

}
