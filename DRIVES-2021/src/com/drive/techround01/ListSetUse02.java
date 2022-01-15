package com.drive.techround01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetUse02 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,4,7,4,5,3,7));
		
		//single list----------------------->
			
		//sort with duplicates
		Collections.sort(list);
		System.out.println(list);
		
		//sort without dupli
		Set<Integer> set = new TreeSet<Integer>();
		for(Integer i : list) {
			set.add(i);
		}
		System.out.println(set);
		
		//remove second largest
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			if(i == 5) {
				iter.remove();
			}
		}
		System.out.println(set);
		
		//unique elements
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(Integer i : list) {
			if(set1.add(i) == false) {
				set2.add(i);
			}
		}
		set1.removeAll(set2);
		System.out.println(set1);

		
		//duplicate elements
		System.out.println(set2);
		
		
		//double lists-------------------->
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,7,4,3));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,5,7,6));
		
		//unique elements across lists
		Set<Integer> set3 = new HashSet<Integer>();
		Set<Integer> set4 = new HashSet<Integer>();
		
		for(Integer i : list1) {
			if(set3.add(i) == false) {
				set4.add(i);
			}
		}
		for(Integer i : list2) {
		if(set3.add(i) == false) {
			set4.add(i);
			}
		}
		set3.removeAll(set4);
		System.out.println(set3);
		
		
		//repeating elements across lists
		System.out.println(set4);
		
		
		//find and remove min value across lists
		Set<Integer> set5 = new TreeSet<Integer>();
		for(int i = 0; i < list1.size(); i++) {
			set5.add(list1.get(i));
			set5.add(list2.get(i));
		}
		System.out.println(set5);
		int ci = 0;
		int di = 0;
		for(Integer i : set5) {
			if(ci == di) {
				set5.remove(i);
				break;
			}
			ci++;
		}
		System.out.println(set5);
		
		//max elements across lists
		Set<Integer> set6 = new TreeSet<Integer>();
		for(Integer i : list1) {
			set6.add(i);
		}
		for(Integer i : list2) {
			set6.add(i);
		}
		System.out.println(set6);
		
		int ci1 = 0;
		int di1 = set6.size()-1;
		for(Integer i : set6) {
			if(ci1 == di1) {
				System.out.println("max = " + i);
				break;
			}
			ci1++;
		}
		
		
		
		
		
	}

}
