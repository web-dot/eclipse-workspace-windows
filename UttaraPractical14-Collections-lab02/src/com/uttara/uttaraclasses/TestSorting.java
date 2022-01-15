package com.uttara.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {

	public static void main(String[] args) {
		
		String s1 = "happy";
		String s2 = "kushi";
		String s3 = "bliss";
		String s4 = "joy";
		String s5 = "pleasure";
		String s6 = "enjoy";
		
		List<String> words = new ArrayList<String>(); // crtl + shift + o
		words.add(s1);
		words.add(s2);
		words.add(s3);
		words.add(s4);
		words.add(s5);
		words.add(s6);
		words.add(s6);
		System.out.println(words);
		
		Collections.sort(words);
		System.out.println("after sorting words = "+words);

		Set<String> wordSet = new TreeSet<String>(words);
		//wordSet.addAll(words);
		System.out.println("after soriting set = "+wordSet);
		
		StringLengthComparator slc = new StringLengthComparator();
		
		Collections.sort(words, slc);
		System.out.println("sorting based on length = "+words);
		
		Set<String> wordSet2 = new TreeSet<String>(slc);
		wordSet2.addAll(words);
		System.out.println("sorting set based on length = "+wordSet2);
		
		System.out.println("iterator usage...");
		Iterator<String> it = words.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
			//words.remove(s);
			if(s.equals("pleasure"))
				it.remove();
		}
		System.out.println(words);
		//System.out.println(it.hasNext());
		
	}

}





