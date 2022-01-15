package com.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
	
		int[] arr = new int[10];
		
		List list = new ArrayList();
		
		
		for(int i = 0; i < 10; i++) {
			
			arr[i] = i*10;
			list.add(i*10);
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr = " + arr[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("aL = " + list.get(i));
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);

	}

}
