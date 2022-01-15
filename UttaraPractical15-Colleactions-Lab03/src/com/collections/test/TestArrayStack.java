package com.collections.test;

import java.util.Arrays;

import com.collections.classes.*;

public class TestArrayStack {

	public static void main(String[] args) {
		
		ArrayStack myStack = new ArrayStack();
		myStack.push(5);
		myStack.push(10);
		myStack.push(15);
		
		System.out.println();
		System.out.println("printElements()->-> should print 15 10 5");
		myStack.printElements(); //-> should print 15 10 5
		
		System.out.println();
		System.out.println("peek()->-> should print 15");
		System.out.println((myStack.peek()));  //-> should print 15
		
		
		System.out.println();
		System.out.println("pop()->-> should print 15");
		System.out.println((myStack.pop()));  //-> should print 15
		
		System.out.println();
		System.out.println("peek()->-> should print 10");
		System.out.println((myStack.peek()));  //-> should print 10
		
		System.out.println();
		System.out.println("printElements()-> should print 10 5");
		myStack.printElements(); //-> should print 10 5
		myStack.push(20);
		
		
		System.out.println();
		System.out.println("printElements-> should print 20 10 5");
		myStack.printElements(); //-> should print 20 10 5


		


		
		
	}

}
