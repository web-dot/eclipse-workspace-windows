package com.recap.dsa01;

class Node{
	int value;
	Node next;
	Node(int num){
		value = num;
	}
}


class LinkedList{
	Node firstNode;
	public LinkedList(int num) {
		firstNode = new Node(num);
		firstNode.next = null;
	}
	public void addAtEnd(Node node) {
		firstNode.next = node;
		node.next = null;
	}
}


public class TestLinkedList01 {

	public static void main(String[] args) {
		
		//creating linked list object
		LinkedList l1 = new LinkedList(10);
		//System.out.println(l1.firstNode.value);
		
		//adding node at end
		l1.addAtEnd(new Node(20));
		l1.addAtEnd(new Node(30));
		l1.addAtEnd(new Node(40));
		l1.addAtEnd(new Node(50));
		
		//traversal
		Node node = l1.firstNode;
		
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
		
		
		
		
	}

}
