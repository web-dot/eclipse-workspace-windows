package com.drive.test;


import com.drive.techround01.*;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		
		
		SinglyLinkedList s1 = new SinglyLinkedList();
		
		s1.print();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		
		s1.print();
		
		s1.insertAtBeginning(100);
		
		System.out.println();
		s1.print();
		
		
		s1.insertAt(200, 2);
		
		System.out.println();
		s1.print();
		
		s1.deleteAt(2);
		
		System.out.println();
		s1.print();
		
		
		System.out.println(s1.contains(20)); 
		
		
		
		
		
		
	}

}
