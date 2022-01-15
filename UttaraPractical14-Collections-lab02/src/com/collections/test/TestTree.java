package com.collections.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import com.collections.classes.StringLengthComparator;
public class TestTree {

	public static void main(String[] args) {
		
		Set<String> set1 = new TreeSet<String>(Arrays.asList("aqua", "violet", "orange", "red", "blue", "cyan", "magenta", "green", "teal")) ;
		System.out.println(set1);
		
		String s1 = "yellow";
		String s2 = "violet";
		String s3 = "orange";
		String s4 = "red";
		String s5 = "blue";
		String s6 = "cyan";
		String s7 = "magenta";
		String s8 = "green";
		String s9 = "teal";
		
		Set<String> set2 = new TreeSet<String>(new StringLengthComparator()) ;

		set2.add(s1);
		set2.add(s2);
		set2.add(s3);
		set2.add(s4);
		set2.add(s5);
		set2.add(s6);
		set2.add(s7);
		set2.add(s8);
		set2.add(s9);
		
		System.out.println(set2);
		
		List<String> list = new LinkedList<String>(Arrays.asList("aqua", "violet", "orange", "red", "blue", "cyan", "magenta", "green", "teal"));
		Collections.sort(list);
		
		System.out.println(list);
	}
}
