package com.arrays;

import java.util.Arrays;

public class Sorting {
	
	//BUBBLE SORT
	
	
	
	
	//INSERTION SORT
	public static int[] insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
				System.out.println(Arrays.toString(arr));
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {5, 4, 10, 1, 6, 2};
		int[] r = insertionSort(arr);
		System.out.println(Arrays.toString(r));
		

	}

}
