package com.uttara.practical05;

public class PassLiteralToMethod {

	public static void test(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int add(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum = sum + i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40};
			
			//test() method
			test(arr);
			
			System.out.println();
			
			//add() method
			int r = add(arr);
			System.out.println("sum = " + r);
			

	}

}
