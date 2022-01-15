package com.sudip.dsa;

import java.util.Arrays;

public class StackOfIntsArr {
	private int[] items = new int[10];
	private int top = 0;
	public void push(int N) {
		if(top == items.length) {
			items = Arrays.copyOf(items, 2*items.length);
		}
		items[top] = N;
		top++;
	}
	public int pop() {
		if(top == 0) {
			throw new IllegalStateException("Cant't pop from empty stack");
		}
		int topItem = items[top-1];
		top--;
	}
}
