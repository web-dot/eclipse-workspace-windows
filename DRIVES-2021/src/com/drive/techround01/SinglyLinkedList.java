package com.drive.techround01;

class Node {
	int data;
	Node next;
}

public class SinglyLinkedList {

	Node head = null;
	Node runner;
	int size = 0;

	
	//ADD------------------------------->[1]
	public void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
		} else {
			runner = head;
			// traverse to last
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = n;
		}
		size++;
	}

	//INSERT AT BEGIN---------------------[2]
	public void insertAtBeginning(int data) {
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;
		n = null;
		size++;
	}

	//INSERT AT---------------------------[3]
	public void insertAt(int data, int pos) {
		if (pos < 0 || pos > size) {
			throw new IllegalArgumentException();
		} else {
			Node n = new Node();
			n.data = data;
			runner = head;
			if (pos == 0) {
				n.next = head;
				head = n;
			} else {
				// traverse 1 before pos
				for (int i = 0; i < pos - 1; i++) {
					runner = runner.next;
				}
				n.next = runner.next;
				runner.next = n;
			}
		}
		size++;
	}

	//DELETE AT---------------------------[4]
	public void deleteAt(int pos) {
		if(pos == 0) {
			head = head.next;
		}
		else {
			runner = head;
			//traverse to 1 before pos
			for(int i=0; i<pos-1; i++) {
				runner = runner.next;
			}
			runner.next = runner.next.next;
		}
	}
	
	//PRINT-----------------------------[5]
	public void print() {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
		runner = head;
		while(runner != null) {
			System.out.println(runner.data);
			runner = runner.next;
			}
		}
	}

	//CONTAINS--------------------------[6]
	public boolean contains(int data) {
		if(head == null) {
			return false;
		}
		else {
			runner = head;
			while(runner != null) {
				if(runner.data == data) {
					return true;
				}
				runner = runner.next;
			}
			return false;
		}
	}

	//GET-------------------------------[7]
	public int get(int pos) {
		if(pos > size || pos < 0) {
			throw new IllegalArgumentException();
		}
		else {
			runner = head;
			for(int i=0; i<=pos; i++) {
				if(i==pos) {
					return runner.data;
				}
				runner = runner.next;
			}
			return -1;
		}
	}

	
	//SIZE------------------------------[8]
	public int size() {
		return size;
	}

	
	//CLEAR-----------------------------[9]
	public void clear() {
		head = null;
		size = 0;
	}

	//ISEMPTY--------------------------[10]
	public boolean isEmpty() {
		return (size == 0);
	}
	
}
