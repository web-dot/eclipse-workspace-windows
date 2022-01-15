package com.recap.dsa;

import java.util.List;
import java.util.LinkedList;

class Node{
	int data;
	Node next;
}


public class TestLinkedList {
	
	public static void main(String[] args) {
		
		Node head = null;
		Node runner;		
		
		//operations
		//add at end		-done
		//print elements	-done
		//size				-done
		
		//remove(data)		
		//remove(position)	-done
		//boo contains(data)-
		//insert(pos, data)	-done 		
		//isEmpty() 		
		
	
	
		
			
		//--------------->> ADD(INSERT AT END)
		
		//first node
		Node n1 = new Node();  //--------> method statement 1
		n1.data = 15;
		//add first node
		if(head == null) {
			head = n1;
		}
		else {
			runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = n1;
		}
		
		//head now point to n1
		//reference stored in head variable is assigned to runner, both head and runner now points where head points
		runner = head;
		
		//second node
		Node n2 = new Node();
		n2.data = 20;
		//add second node
		if(head == null) {
			head = n2;
		}
		else {
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = n2;
		}
	
		//third node
		Node n3 = new Node();
		n3.data = 30;
		//add third node
		if(head == null) {
			head = n3;
		}
		else {
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = n3;
		}
		
		//fourth node
		Node n4 = new Node();
		n4.data = 40;
		//adding fourth node
		if(head == null) {
			head = n4;
		}
		else {
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = n4;
		}
		
				
		
		//--------------->> INSERT AT BEGINNING
		
		//fifth node
		Node n5 = new Node();
		n5.data = 50;
		//adding fifth node at the beginning
		n5.next = head;
		head = n5;
		
		//sixth node
		Node n6 = new Node();
		n6.data = 60;
		//adding sixth node at the beginning
		n6.next = head;
		head = n6;
		
		
		
		//-------------->> INSERT AT INDEX
		//seventh node
		Node n7 = new Node();
		n7.data = 88;
		//adding seventh node at specific index
		int position = 2;
		runner = head;
		if(position == 0) {
			n7.next = head;
			head = n7;
		}
		else {
			for(int i = 0; i < position-1; i++) {
			runner = runner.next;
			}
			n7.next = runner.next;
			runner.next = n7;
		}
		
		
		
		//------------->> CONTAINS
		int data = 10;
		runner = head;
		boolean result = false;
		while(runner != null) {
		//System.out.println(runner.data);
		if(runner.data == data) {
			result = true;
		}
		runner = runner.next;
		}
		System.out.println(result);
		
		
		
		
		
		//--------------->> DELETE AT INDEX
		//int position = 0;
		if(position == 0) {
			head = head.next;
		}
		else {
			runner = head;
			Node t = null;
			for(int i = 0; i < position-1; i++) {
				runner = runner.next;
			}
			t = runner.next;
			runner.next = t.next;
			t = null;
		}
		
		//deleting element at position 4
		position = 4;
		if(position == 0) {
			head = head.next;
		}
		else {
			runner = head;
			Node t = null;
			for(int i = 0; i < position-1; i++) {
				runner = runner.next;
			}
			t = runner.next;
			runner.next = t.next;
			t = null;
		}
		
		//deleting element at position 3
		position = 3;
		if(position == 0) {
			head = head.next;
		}
		else {
			runner = head;
			Node t = null;
			for(int i = 0; i < position-1; i++) {
				runner = runner.next;
			}
			t = runner.next;
			runner.next = t.next;
			t = null;
		}
		
		//deleting element at position 2
		position = 2;
		runner = head;
		Node t = null;
		if(position == 0) {
			head = head.next;
		}
		else {
			for(int i = 0; i < position-1; i++) {
				runner = runner.next;
			}
			t = runner.next;
			runner.next = t.next;
			t = null;
		}
		
		
		
		
		
		//------------------>> PRINT
		runner = head;
		while(runner != null) {
		System.out.println(runner.data);
		runner = runner.next;
		}
		
		//-------------->> SIZE
		int size = 0;
		runner = head;
		while(runner != null) {
			runner = runner.next;
			size++;
		}
		
		System.out.println("size = " + size);
				
		
		List list = new LinkedList();
		
		
	}

}
