package com.drive.linkedlist01;

public class TestLL01 {

	public static void main(String[] args) {
		
		SinglyLinkedList01 s1 = new SinglyLinkedList01();
		
		System.out.println(s1.isEmpty());
		
		s1.add(10);
		
		System.out.println();
		
		s1.print();
		
		s1.add(20);
		s1.add(30);
		
		System.out.println();
		
		s1.print();
		
		System.out.println();
		
		System.out.println(s1.isEmpty());
		
		s1.insertAtBegin(100);
		
		System.out.println();
		s1.print();
		
		s1.inserAt(200, 2);
		
		System.out.println();
		
		s1.print();
		
		s1.deleteAt(3);
		
		System.out.println();
		
		s1.print();
		
		
		System.out.println();
		
		System.out.println(s1.get(2));
		
		System.out.println();
		
		System.out.println(s1.contains(2000));
		
		
		
		
		
		
		
	}

}
