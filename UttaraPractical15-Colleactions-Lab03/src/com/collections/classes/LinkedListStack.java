package com.collections.classes;

public class LinkedListStack {
	
	private class Node{
		String data;
		Node next;
	}
	
	Node top;
	public void push(String word) {
		Node n1 = new Node();
		n1.data = word;
		n1.next = top;
		top = n1;
	}
	public String pop() {
		if(top == null) {
			throw new IllegalStateException("stack is empty");
		}
		String topItem = top.data;
		top = top.next;
		return topItem;
	}
	public boolean isEmpty() {
		return (top == null);
	}
}
