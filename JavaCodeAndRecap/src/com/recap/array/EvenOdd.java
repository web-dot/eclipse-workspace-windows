package com.recap.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class EvenOdd {

	//given an int array create 2 arrays even[] only even numbers and odd[] only odd numbers
	
	public static void evenodd(int[] arr) {
		int countEven = 0;
		int countOdd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				countEven++;
			}
			if(arr[i] == 1 || arr[i] % 2 == 1) {
				countOdd++;
			}
		}
		int[] evenArr = new int[countEven];
		int[] oddArr = new int[countOdd];
		
		int k = 0;
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddArr[k] = arr[i];
				k++;
				}
			}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenArr[j] = arr[i];
				j++;
				}
			}
		System.out.println("array of even numbers = " + Arrays.toString(evenArr));
		System.out.println("array of odd numbers = " + Arrays.toString(oddArr));
	}
	
	//return intersection
	public static int[] intersetionOfArr(int[] a, int[] b) {
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					set.add(a[i]);
				}
			}
		}
		int[] arr = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		int k = 0;
		while(iter.hasNext()) {
			arr[k] = iter.next();
			k++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("------------EVEN ODD------------------->");
		//even odd
		int[] c = {32,59,13,28,73,69,40,1003};
		int[] d = {1,2,3,4,5};
		evenodd(c);
		evenodd(d);
		
		
		System.out.println();
		
		
		
		System.out.println("------------INTERSECTION----------------->");
		//intersection
		int[] nums1 = {4, 9, 5};
		int[] nums2 = {9, 4, 9, 8, 4};
		
		int[] nums3 = {7,4,12,86,13,91};
		int[] nums4 = {7,86,13,21,1001};
		
		
		int[] result1 = intersetionOfArr(nums2, nums1);
		System.out.println("intersection of arrays = " + Arrays.toString(result1));
		
		int[] result2 = intersetionOfArr(nums3, nums4);
		System.out.println("intersection of arrays = " + Arrays.toString(result2));
		
	}

}
