package com.mcq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;



public class Test01 {

	public static void main(String[] args) {
		
		
		//Collection.sort() on a String array with decimal elements
		String[] array = {"abc", "def", "15", "10", "5", "2", "0"};
		List<String> list = Arrays.asList(array);
		Collections.sort(list);
		//System.out.println(Arrays.toString(array));
		
		//
		String[] array2 = new String[] {"A", "B", "C"};
		List<String> list1 = Arrays.asList(array2);
		List<String> list2 = new ArrayList<>(Arrays.asList(array2));
		List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		
		System.out.println(list2.toString());
		System.out.println(list3.toString());
		
		System.out.println("apple".compareTo("banana"));
		
		int[] arr = new int[] {1,2};
		
		int i = 5;
		double d = (float)i;
		
		//int num = 6.7;
		
		
		Set set;
		
		
		
		
		

	}

}
