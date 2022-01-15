package com.uttara.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestStringTree {

	public static void main(String[] args) {
		
		Set ts = new TreeSet();
		String s1 = "chotu";
		String s2 = "motu";
		String s3 = "Lambu";
		String s4 = "kunta";
		String s5 = "gunda";
		String s6 = "Soda";
		String s7 = new String("gunda");
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		
		System.out.println(ts);
		
	}

}







