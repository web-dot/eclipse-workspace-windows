package com.uttara.stack;

import java.util.Arrays;

public interface Stack {
	public void push(int element);
	public int pop();
	public int peek();
	public void printElements();
}



class ArrayStack implements Stack{
	
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
	
	public int peek() {
		if(count == 0) {
			System.out.println("oops, Stack is empty!!");
		}
		return arr[count-1];
	}

	public void printElements() {
		for(int i = count-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
	
}