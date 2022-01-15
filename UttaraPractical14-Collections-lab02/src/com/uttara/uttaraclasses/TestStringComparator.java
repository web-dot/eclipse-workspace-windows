package com.uttara.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStringComparator {

	public static void main(String[] args) {
		
		String s1 = "January";
		String s2 = "February";
		String s3 = "March";
		String s4 = "October";
		String s5 = "October";
		String s6 = "April";
		String s7 = "May";
		String s8 = "aeiou";
		
		StringLengthComparator2 comp1 = new StringLengthComparator2();
		StringVowelComparator comp2 = new StringVowelComparator();
		
		Set ts = new TreeSet(comp2);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		System.out.println(ts);
		
		List names = new ArrayList(ts);
		names.add(s1);
		names.add(s2);
		names.add(s3);
		names.add(s4);
	
		System.out.println("before sorting names "+names);
		Collections.sort(names);
		System.out.println("after sorting names using natural ordering"+names);
		Collections.sort(names,comp1);
		System.out.println("after sorting names using length comp"+names);
		Collections.sort(names,comp2);
		System.out.println("after sorting names using vowel comp"+names);
	}

}

class StringVowelComparator implements Comparator
{
	public int numOfVowels(String str)
	{
		str = str.toLowerCase();
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c=='u')
				count++;
		}
		return count;
	}
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			
			int num1 = numOfVowels(s1);
			int num2 = numOfVowels(s2);
			
			return num1 - num2;
		}
		else
			throw new IllegalArgumentException("Only strings can be compared!");

	};
}

class StringLengthComparator2 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			
			return s1.length() - s2.length();
		}
		else
			throw new IllegalArgumentException("Only strings can be compared!");
	}
	
}



















