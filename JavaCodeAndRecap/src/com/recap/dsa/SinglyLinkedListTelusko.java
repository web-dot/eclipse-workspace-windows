package com.recap.dsa;

public class SinglyLinkedListTelusko implements LinkedList {

	Node head = null;
	Node runner;
	int size = 0;

	// CHECK IF EMPTY
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	// ADD AT END
	@Override
	public void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
		} else {
			runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = n;
		}
		size++;

	}

	// INSERT AT BEGINNING
	@Override
	public void insertAtBeginning(int data) {
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;
		n = null;
		size++;
	}

	// INSERT AT POSITION
	@Override
	public void insertAt(int data, int position) {
		if (position < 0 || position > size) {
			throw new IndexOutOfBoundsException("List is empty");
		} else {
			Node n = new Node();
			n.data = data;
			runner = head;
			if (position == 0) {
				n.next = head;
				head = n;
			} else {
				for (int i = 0; i < position - 1; i++) {
					runner = runner.next;
				}
				n.next = runner.next;
				runner.next = n;
			}
		}
		size++;

	}

	// CONTAINS
	@Override
	public boolean contains(int data) {
		if (head == null) {
			return false;
		} else {
			runner = head;
			while (runner != null) {
				if (runner.data == data) {
					return true;
				}
				runner = runner.next;
			}
			return false;
		}
	}

	// DELETE AT POSITION
	@Override
	public void deleteAt(int position) {
		if (position == 0) {
			int data = head.data;
			head = head.next;
		} else {
			runner = head;
			for (int i = 0; i < position - 1; i++) {
				runner = runner.next;
			}
			Node remove = runner.next;
			runner.next = remove.next;
			remove = null;
			size--;
		}
	}

	// PRINT
	@Override
	public void print() {
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			runner = head;
			while (runner != null) {
				System.out.println(runner.data);
				runner = runner.next;
			}
		}
	}

	// GET VALUE AT POSITION
	@Override
	public int get(int position) {
		if (position > size || position < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			runner = head;
			for (int i = 0; i <= position; i++) {
				if (i == position) {
					return runner.data;
				}
				runner = runner.next;
			}
			return 0;
		}
	}

	// GET SIZE
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void clear() {
		head = null;
		size = 0;
	}
	
	
	
	

}
