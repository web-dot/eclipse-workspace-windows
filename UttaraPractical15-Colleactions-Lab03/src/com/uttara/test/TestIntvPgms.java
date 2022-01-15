package com.uttara.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestIntvPgms {

	public static void main(String[] args) {
		
		String sentence = "johnson and and and and and johnson are not spaced equally";
		
		// print without non-rep words
		String[] words = sentence.split(" ");
		Set nonRepWords = new LinkedHashSet();
		for(String str : words)
		{
			nonRepWords.add(str);
			
		}
		System.out.println("all words without repeats"+nonRepWords);
		
		//print only non-repeating words
		
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		
		for(String str : words)
		{
			if(!set1.add(str))
				set2.add(str);
		}
		set1.removeAll(set2);
		System.out.println("all non-repeating words "+set1);
		
		List allWords = new ArrayList();
		for(String str: words)
		{
			allWords.add(str);
		}
		System.out.println("allWords = "+allWords);
		
		int num = Collections.frequency(allWords, "and");
		System.out.println("num of occ for and = "+num);
		System.out.println("before sorting allwords = "+allWords);
		Collections.sort(allWords);
		System.out.println("after sorting allwords = "+allWords);
		for(String str : words)
		{
			System.out.println("num of times "+str+" occurs in allwords = "+Collections.frequency(allWords, str));
		}
		
		String str = "aaaabbbbcccbbbbdddeeee";
		int[] arr = new int[26];
		for(int i= 0 ; i < str.length() ; i++)
		{
			char c = str.charAt(i);
			arr[c - 'a']++;
		}
		System.out.println("str = "+str);
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println((char)('a'+i) +" occ = " +arr[i]);
		}
	}

}






