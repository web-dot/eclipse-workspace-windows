package com.uttara.practical08;

import java.util.Arrays;

public class IntStack {
	private int[] arr = new int[10];
	private int count = 0;
	
	public void push(int n) {
		if(count < arr.length) {
			arr[count] = n;
			count++;
		}
		else {
			System.out.println("IntStack is full");
		}
	}
	
	public int pop() {
		int r = 0;
		if(count >= 0) {
			r =  arr[count-1];
			arr[count-1] = 0;
			count--;
		}
		else {
			System.out.println("array is empty, nothing to pop");
		}
		return r;
	}

	@Override
	public String toString() {
		return "IntStack [arr=" + Arrays.toString(arr) + "]";
	}
	
	
	
}
