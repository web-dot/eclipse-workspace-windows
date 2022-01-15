package com.drive.techround01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortsearch01 {
	
	
	public static int binarySearch(int[] arr, int data) {
		int left = 0;
		int n = arr.length;
		int right = n-1;
		int mid;
		while(left < right) {
		mid = (left+right)/2;
		if(data == arr[mid]) {
			return mid;
		}
		else if(data < arr[mid]) {
			right = mid-1;
		}
		else {
			left = mid+1;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 4, 5, 3, 7));
		int[] arr = new int[] {2, 4, 7, 4, 5, 3, 7, 9};
		
		
		// bubblesort
		
		for (int i = 0; i < list.size()-1; i++) {
			int flag = 0;
			for (int j = 0; j < list.size()-1-i; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					flag = 1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		System.out.println(list);
		
		
		//insertion sort
		for(int i = 1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(arr));

		//binary search
		System.out.println(binarySearch(arr, 7)); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
