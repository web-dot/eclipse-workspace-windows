package com.recap.string;

public class AndroidApp {

	
	//check palindrome
	public static boolean checkPalindrome(String str) {
		
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	//count punctuations
	public static int countPunct(String str) {
		
		int i;
		int punct = 0;
		int letter = 0;
		int spaces = 0;
		
		for(i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				letter++;
			}
			else if(c == ' ' || c == '\t' ) {
				spaces++;
			}
			else {
				punct++;
			}
		}
		
		return punct;
	}
	
	//count occurance of a char
	public static int countChar(String str, char c) {
		int count = 0;
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == c) {
				count++;
			}
		}
		return count;
	}
	
	//count number of words in a sentence
	public static int countWord(String sentence) {
		String[] arr = sentence.split(" ");
		return arr.length;
	}
	
	//print all substrings of a string
	public static void printSubstring(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = 1; j <= str.length()-i; j++) {
				String sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	}
	
	//longest word in a string
	public static String longestWord(String str) {
		String[] arr = str.split(" ");
		String maxWord = arr[0];
		int maxLength = arr[0].length();
		for(String word : arr) {
			if(word.length() > maxLength) {
				maxLength = word.length();
			}
		}
		for(String word : arr) {
			if(word.length() == maxLength) {
				maxWord = word;
			}
		}
		return maxWord;
	}
	
	public static void main(String[] args) {
		
		/*
		System.out.println(checkPalindrome("madam"));
		System.out.println(checkPalindrome("moon"));
		
		System.out.println(countPunct("Java: is a general purpose, object oriented class based, programming language"));
		System.out.println(countPunct("java programs, are compiled to bytecode, than a architecture specific: machine code"));
		
		System.out.println(countChar("java virtual machine", 'v'));
		System.out.println(countChar("java byte code", 'e'));
		
		System.out.println(countWord("java virtual machine"));
		*/
		
		//printSubstring("java");
		//printSubstring("object");
		
		
		System.out.println(longestWord("Java enables application programmers to write once run anywhere"));
		System.out.println(longestWord("which means that java programs compiled into bytecode can run on any platform without being recompiled again"));
		System.out.println(longestWord("Mary has a lamb"));
		

	}

}
