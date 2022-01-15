package com.drive.techround01;

/*
class Node {
	int data;
	Node next;
}
*/
public class TestSinglyLL {

	public static void main(String[] args) {

		Node head = null;
		Node runner;

		// add first node
		Node n1 = new Node();
		n1.data = 10;
		if (head == null) {
			head = n1;
		} else {
			runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = n1;
		}

		// add second node
		Node n2 = new Node();
		n2.data = 20;
		if (head == null) {
			head = n1;
		} else {
			runner = head;
			// traverse to last
			while (runner.next != null) {
				runner = runner.next;
			}
			// copy n1 addr to runnner.next
			runner.next = n2;
		}

		// insert at beginning
		Node n3 = new Node();
		n3.data = 30;
		
		n3.next = head;
		head = n3;

		//insert at index
		Node n4 = new Node();
		n4.data = 40;
		//position
		int position = 2;
		
		runner = head;
		if(position == 0) {
			n4.next = head;
			head = n4;
		}
		else {
			//traverse 1 before position
			for(int i=0; i<position-1; i++) {
				runner = runner.next;
			}
			n4.next = runner.next;
			runner.next = n4;
		}
		
		//delete at index
		runner = head;
		position = 2;
		if(position == 0) {
			head = head.next;
		}
		else {
			//traverse 1 before position
			for(int i=0; i<position-1; i++) {
				runner = runner.next;
			}
			runner.next = runner.next.next;
		}
		
		
		//size
		int size = 0;
		runner = head;
		while(runner != null) {
			runner = runner.next;
			size++;
		}
		System.out.println("size = " + size);
		
		
		
		
		
		//print
		runner = head;
		while(runner != null) {
			System.out.println(runner.data);
			runner = runner.next;
		}
		
		
		
		
		
		
		
		
	}

}
