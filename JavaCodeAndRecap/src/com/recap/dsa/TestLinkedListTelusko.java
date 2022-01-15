package com.recap.dsa;

public class TestLinkedListTelusko {

	public static void main(String[] args) {
		
		LinkedList l = new SinglyLinkedListTelusko();
		
		
		l.insertAt(109, 0);
		
		System.out.println("isEmpty = " + l.isEmpty());
		
		l.print();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(1133);
		
		l.insertAt(33, 1);
		l.insertAt(40, 2);
		l.insertAt(100, 1);
		
		l.add(999);
		
		
		l.insertAtBeginning(555);
		l.insertAtBeginning(111);
		
		l.insertAt(222, 0);
		l.insertAt(333, 0);
		
		l.insertAtBeginning(101);
		
		
		
		System.out.println();
		
		l.print();
		
		System.out.println();
		
		
		
		l.deleteAt(0);
		l.deleteAt(0);
		
		System.out.println("data at 3 = " + l.get(3));
		System.out.println("data at 0 = " + l.get(0));
		
		System.out.println(l.contains(222));
		System.out.println(l.contains(888));
		
		System.out.println();
		
		System.out.println("size = " + l.size());
		
		System.out.println();
		
		System.out.println("isEmpty = " + l.isEmpty());
		
		System.out.println();
		
		l.print();

		System.out.println("size = " + l.size());
		
		l.insertAt(777, 10);
		l.insertAt(256, 0);
		
		System.out.println();
		
		
		l.print();
		
		
		System.out.println();
		
		l.deleteAt(10);
		
		System.out.println();
		l.print();
		
		
		
		l.clear();
		
		System.out.println();
		
		l.print();
		

	}

}
