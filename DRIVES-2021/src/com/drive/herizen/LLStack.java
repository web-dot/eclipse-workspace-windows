package com.drive.herizen;

public class LLStack {
	private static class Node{
		int data;
		Node next;
	}
	private Node top;
	public void push(int N) {
		Node newTop;
		newTop = new Node();
		newTop.data = N;
		newTop.next = top;
		top = newTop;
	}
	public int pop() {
		if(top == null) {
			throw new IllegalStateException("can not pop from emty stack");
		}
		int topData = top.data;
		top = top.next;
		return topData;
	}
	public boolean isEmpty() {
		return(top == null);
	}
}
