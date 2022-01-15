package com.recap.dsa.uttaraLL;

 class Node {
	private String data;
	//private long position;
	private Node next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Node(String data) {
		super();
		this.data = data;
		//this.position = position;
	}


	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
//	public long getPosition() {
//		return position;
//	}
//	public void setPosition(long position) {
//		this.position = position;
//	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
