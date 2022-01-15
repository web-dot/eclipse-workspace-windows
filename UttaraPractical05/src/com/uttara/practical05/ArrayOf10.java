package com.uttara.practical05;

import java.util.Arrays;

public class ArrayOf10 {

	public static void main(String[] args) {
		
		System.out.println("----------------2---------------------");
		
		int[] arr = new int[10];
		//int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		//System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("----------------3---------------------");
		
		int[] arr2 = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr.length-i;
		}
		//using for
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		//using enhanced for
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		//System.out.println(Arrays.toString(arr2));
		
		System.out.println();
		
		System.out.println("-----------------4--------------------");
		
		System.out.println("random array");
		int[] randomElementsArr = new int[10];
		
		for(int i = 0; i < randomElementsArr.length; i++) {
			randomElementsArr[i] = (int)(Math.random() * 10);
		}
		
		System.out.println("using for");
		//for
		for(int i = 0; i < randomElementsArr.length; i++) {
			System.out.print(randomElementsArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("using for each");
		//enhanced for
		for(int i : randomElementsArr) {
			System.out.print(i + " ");
		}
		
		
		
	}

}
