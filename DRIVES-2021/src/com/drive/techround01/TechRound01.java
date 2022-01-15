package com.drive.techround01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TechRound01 {

	public static void main(String[] args) {
		
		//[1]what is the difference between the following
		
		String s1 = "sudip";
		String s2 = new String("sudip");

		
		//[2]can i write the following
		int a = 0;
		Integer b = 0;
		
		//[3]can i write the following
		//int c = null;
		Integer d = null;
		
		//[4]how to find the second largest element in a list
		
		//creating list with elements
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 10, 7, 5, 9, 7, 3));
		
		//sorting the list
		Collections.sort(list);
		System.out.println(list);
		
		//retrieving the second largest
		int n = 0;
		for(int i = list.size(); i > list.size()-2; i--) {
			n = list.get(list.size()-2);
		}
		System.out.println(n); // 9
		
		//removing the second largest value
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 9){
				list.remove(i);
			}
		}
		System.out.println(list);
		
		
		/*
		for(Integer i : set) {
			if(i == 9) {
				set.remove(i);
			}
		}
		*/
		
	}

}
