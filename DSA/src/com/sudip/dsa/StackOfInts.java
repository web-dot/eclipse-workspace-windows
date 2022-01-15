package com.sudip.dsa;

public class StackOfInts {
	private static class Node{
		int item;
		Node next;
	}
	private Node top;
	public void push(int N) {
		Node newTop;
		newTop = new Node();
		newTop.item = N;
		newTop.next = top;
		top = newTop;
	}
	public int pop() {
		if(top == null) {
			throw new IllegalStateException("Can't pop fro an empty stack");
		}
		int topItem = top.item;
		top = top.next;
		return topItem;
	}
	public boolean isEmpty() {
		return(top == null);
	}
}
