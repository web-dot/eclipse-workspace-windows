package com.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import com.collections.classes.*;




public class WordOccuranceTest {
	
	public static void checkOccurance(String sentence, String word) {
		String[] sa = sentence.split(" ");
		List<String> list = new ArrayList<String>();
		for(String s : sa) {
			list.add(s);
		}
		int n = Collections.frequency(list, word);
		System.out.println("count of " + word + " is " + n);
	}
	
	public static void sort(String sentence) {
		String[] sa = sentence.split(" ");
		List<String> list = new ArrayList<String>();
		for(String s : sa) {
			list.add(s);
		}
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void sortwithoutDupli(String sentence) {
		Set<String> set = new TreeSet<String>();
		String[] sa = sentence.split(" ");
		for(String s : sa) {
			set.add(s);
		}
		System.out.println(set);
	}
	
	public static void sortOnLength(String sentence) {
		String[] sa = sentence.split(" ");
		List<String> list = new ArrayList<String>();
		for(String s : sa) {
			list.add(s);
		}
		Collections.sort(list, new NameLengthComparator());
		System.out.println(list);
	}
	
	public static void removeOccurancesOfWord(String sentence, String word) {
		String[] sa = sentence.split(" ");
		//Set<String> set = new TreeSet<String>();
		List<String> list = new ArrayList<String>();
		for(String s : sa) {
			list.add(s);
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals(word)) {
				iter.remove();;
				}
			}
		System.out.println(list);
		}


	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sentence = sc2.nextLine();
		System.out.println("Enter a word");
		String word = sc1.nextLine();
		
		
		//check word occurance
		//checkOccurance(sentence, word);
		
		//sort the sentence
		//sort(sentence);
		
		//sort without duplicates
		//sortwithoutDupli(sentence);
		
		//sort sentence based on length
		//sortOnLength(sentence);
		
		
		//remove all occurrances of word
		removeOccurancesOfWord(sentence, word);
		
		
		
	}

}












