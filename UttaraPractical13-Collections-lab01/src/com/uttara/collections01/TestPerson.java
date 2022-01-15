package com.uttara.collections01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ramu", 20);
		Person p2 = new Person("Ramu", 20);
		
		
		//before overriding equals in Person class
		//System.out.println("identity check = " + (p1==p2));     	//false	
		//System.out.println("equality check = " + p1.equals(p2));	//false
		
		
		//after overriding equals in Person class
		System.out.println("identity check = " + (p1==p2));			//false
		System.out.println("equality check = " + p1.equals(p2));	//true
				
		//reference of p1
		
		
		//before overriding toString();
		//System.out.println(p1);					//com.uttara.collections01.Person@182decdb
		
		//before overriding toString();
		System.out.println(p1);					//Person [name=Ramu, height=20]
		
		
		System.out.println();
		System.out.println();
		
		Person person1 = new Person("shamu", 21);
		Person person2 = new Person("shamu", 21);
		Person person3 = new Person(null,  21);
	
		
		List list = new ArrayList();
		
		List list2 = new LinkedList();
		
		list.add(person2);
		//list.add(person1);
		//list.add(person3);
		
		list2.add(person1);
		list2.add(person2);
		list2.add(person3);
		
		System.out.println(list);
		
		System.out.println(list.contains(person1));
		System.out.println(list.remove(person1));
	
		//[1]we create a ArrayList and add an user defined object say person1
		//[2]what happens when we list.contains(person1) -> does contains call equals() 
		
		//[3] does contain() and remove() method call equals() method of the Person class
		
		//[4]what happens when we call contains passing reference of an object that
		//has the same state of the object whose reference the ArrayList have, if there are 1 mill
		//elements does the ArrayList have to search through all of its elements
		
		//[5]do we need to check for equality of address in equals()
		
		
		/*
		 * ArthmaticEx - bad user input, bad validation
		 * ClassCastEx -bad user input bad validation
		 * NullPEx	- bad u inp, bad validation
		 * 
		 * OutOfBoundsEx--------------only bad code
		 * ConcurrentModificationEx
		 * 
		 * */
		
		
		
		
		
		System.out.println();
		
		System.out.println(list2.contains(person1));
		System.out.println(list2.remove(person1));
		
		
		//System.out.println(person1.equals(person2));
		
		
	}

}
