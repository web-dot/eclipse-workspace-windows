package com.collections.classes;

public class ArrayStack implements Stack {

	int[] arr = new int[10];
	int count = 0;

	@Override
	public void push(int element) {
		// check if count < length of array
		// store element into arr[count]
		// increment count
			if (count < arr.length) {
				arr[count] = element;
				count++;
			} 
			else if(count == arr.length) {
				System.out.println("stack is full");
			}
		}

	@Override
	public int pop() {
		// check if count > 0
		// return arr[count]
		// decrement count
		if(count > 0) {
			count--;
			return arr[count];
		}
		else if(count == 0) {
			System.out.println("stack is empty");
		}
		return -1;
	}

	@Override
	public int peek() {
		// check if count > 0
		// return arr[count] without decrementing count
		if(count > 0) {
			return arr[count-1];
		}
		return -1;
	}

	@Override
	public void printElements() {
		// loop over arr count num of times
		// print each element via sop
		for(int i = count-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
