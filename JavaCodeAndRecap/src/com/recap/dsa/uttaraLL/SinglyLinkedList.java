package com.recap.dsa.uttaraLL;

public class SinglyLinkedList implements LinkedList {

	private Node head;
	private Node last;
	private long size;
	
	@Override
	public void add(String data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			last = n;
		}
		else {
			last.setNext(n);
			last = n;
		}
		size++;
	}

	@Override
	public void print() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			while(temp != null) {
				System.out.println("Data = " + temp.getData());
				temp = temp.getNext();
			}
		}

	}

	@Override
	public boolean contains(String data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(int pos, String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public String remove(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

}
