package com.drive.techround01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetUse03 {

	public static void main(String[] args) {
	
		
		//count occurances of given string
		String line = "all is allover the place and all in all inall allof the all is here";
		String str = "all";
		
		
		int count = 0;
		int pos = 0;
		
		while((pos = (line.indexOf(str, pos))) != -1) {
			++count;
			++pos;
		}
		System.out.println("count of string = " + count);
	
		
		
		//sort
		
		String line1 = "if and there are if and any";
		
		//sort with dupli
		List<String> list = new ArrayList<String>();
		String[] sa1 = line1.split(" ");
		for(String s : sa1) {
			list.add(s);
		}
		Collections.sort(list);
		System.out.println(list);
		
		//sort without dupli
		Set<String> set1 = new TreeSet<String>();
		for(String s : sa1) {
			set1.add(s);
		}
		System.out.println(set1);
		
		//unique string without order
		Set<String> set2 = new TreeSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		for(String s : sa1) {
			if(set2.add(s) == false) {
				set3.add(s);
			}
		}
		set2.removeAll(set3);
		System.out.println(set2);
		
		//unique string preserve order
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("and") || s.equals("if")) {
				iter.remove();
			}
		}
		
		
		
		System.out.println("unique order preserve = " + list);
		
		
		
		
		
		
		
		
		
		
		
	}

}
