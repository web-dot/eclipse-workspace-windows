package com.uttara.practical05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayPgms {

	//10
	public static int maxAcrossArrays(int[] a1, int[] a2) {
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i : a1) {
			set.add(i);
		}
		for(int i : a2) {
			set.add(i);
		}
		int max = 0;
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int i = iter.next();
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	//REFACTOR
	public static int maxAcrossArrays2(int[] a1, int[] a2) {
		int max = a1[0];
		
		for(int i = 0; i < a1.length; i++) {
			if(a1[i] > max) {
				max = a1[i];
			}
		}
		for(int i = 0; i < a2.length; i++) {
			if(a2[i] > max) {
				max = a2[2];
			}
		}
		return max;
	}	
	//11
	public static double avgOfArrays(int[] a1, int[] a2) {
		double sum = 0;
		int l1 = a1.length;
		int l2 = a2.length;
		int l = l1+l2;
		for(int i : a1) {
			sum = sum + i;
		}
		for(int i : a2) {
			sum = sum + i;
		}
		double avg = sum / l;
		return avg;
		
	}
	
	//12
	public static int secondHighest(int[] a1, int[] a2) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i : a1) {
			list.add(i);
		}
		for(int i : a2) {
			list.add(i);
		}
		Collections.sort(list, new ArrayComparator());
		int max = list.get(0);
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i) < max) {
				max = list.get(i);
				break;
			}
		}
		return max;
		
	}
	//13
	/*
	public static int[] printUniqueArray(int[] a1, int[] a2) {
		int length = 0;
		if(a1.length > a2.length || a1.length == a2.length) {
		for(int i = 0; i < a1.length; i++) {
			if(a2[i] != a1[i]) {
				length++;
				}
			}
		}
		else if(a2.length > a1.length) {
			for(int i = 0; i < a2.length; i++) {
				if(a2[i] != a1[i]) {
					length++;
					}
				}
		}
			int[] arr = new int[length];
			
			for(int i = 0; i < length; i++) {
				if(a1[i] != a2[i]) {
					arr[i] = a1[i];
				}
			}
		return arr;
	}
	*/
	
	public static int[] printUniqueArray(int[] a1, int[] a2) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : a1) {
			set.add(i);
		}
		for(int i : a2) {
			set.add(i);
		}
		
		int[] arr = new int[set.size()];
		
		
		Iterator<Integer> iter = set.iterator();
		int i = 0;
		while(iter.hasNext()) {
			arr[i] = iter.next();
			i++;
		}
		return arr;
	}
	
	

	
	
	
	public static void main(String[] args) {
		
		
		//10
		int[] a1 = {1, 9, 11, 11};
		int[] a2 = {1, 2, 4};
		int r = maxAcrossArrays(a1, a2);
		System.out.println("max value = " + r);
		
		
		int max = maxAcrossArrays2(a1, a2);
		System.out.println("max = " + max);
		
		
		//11
		int[] a3 = {12, 35, 78};
		int[] a4 = {1, 7, 9 };
		double r1 = avgOfArrays(a3, a4);
		System.out.println("avg = " + r1);
		
		
		//12
		int r3 = secondHighest(a1, a2);
		System.out.println("second highest = " + r3);
		
		//13
		int[] r4 = printUniqueArray(a1, a2);
		System.out.println(Arrays.toString(r4));
		
		
		/*
		WAP to create a 2 dimensional int array with 3 as first dimension
		size. Create unidimensional arrays with size 2 and store numbers in the
		2-D array. Now loop over the arrays and display the value accordingly.
		*/
		
		int[][] arr = new int[3][];
		int[] arr1 = {1, 2};
		int[] arr2 = {3, 4};
		int[] arr3 = {5, 6};
		
		arr[0] = arr1;
		arr[1] = arr2;
		arr[2] = arr3;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
		
		
		
	}

}
