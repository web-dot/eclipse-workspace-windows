package com.uttara.lab07;

public class CountVowels {
	
	public static int countVowels(String str) {
		int count = 0;
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for(int j = 0; j < vowels.length; j++) {
				if(c == vowels[j]) {
					count++;
				}
			}
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(countVowels("programmer"));
		System.out.println(countVowels("a"));
		System.out.println(countVowels(""));
		System.out.println(countVowels("aaaaa"));
		
		
	}

}
