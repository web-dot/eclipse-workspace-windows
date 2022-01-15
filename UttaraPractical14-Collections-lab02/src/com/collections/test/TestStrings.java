package com.collections.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestStrings {

	public static void main(String[] args) {


		
		System.out.println("checking equality for String literals");
		String s1 = "Java";
		String s2 = "Java";
	
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println("checking equality for new objects");
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println();
		
		System.out.println("creating HashSet object ad adding elements----->");
		Set<String> set1 = new HashSet<String>();
		
		System.out.println();
		System.out.println("printing add() return values for duplicates");
		System.out.println(set1.add(s3));
		System.out.println(set1.add(s4));
		
		System.out.println();
		System.out.println("printing set1");
		System.out.println(set1);
		
		
		System.out.println("creating TreeSet object ad adding elements----->");
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("hello");
		set2.add("world");
		set2.add("how");
		set2.add("do");
		set2.add("you");
		set2.add("do");
		
		
		
		System.out.println();
		System.out.println("printing TreeSet");
		System.out.println(set2);
		
		set2.add("ramanna");
		set2.add("ramanuja");
		set2.add("rameshwara");
		set2.add("eshwara");
		set2.add("someshwaraa");
		set2.add("marirama");
		
		
		for(String s : set2) {
			if(s.contains("rama")) {
				System.out.println(s);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
