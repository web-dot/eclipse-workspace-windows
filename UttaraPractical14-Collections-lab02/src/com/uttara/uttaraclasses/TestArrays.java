package com.uttara.collections;

import java.util.Arrays;
import java.util.List;

public class TestArrays {

	public static void main(String[] args) {
	
		String[] arr = {"tata","bye","ciao","trulu","chao","yo","peace","adieu","goodbye","barthini"};
		//String [] arr2 = new String[arr.length];
		System.out.println("before sorting "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after sorting "+Arrays.toString(arr));
	
		List msgs = Arrays.asList(arr);
		
		//equals, binarySearch, copyOf
		//Arrays.
	}

}






