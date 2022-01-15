package com.uttara.stack;

public class TestStack {

	public static void main(String[] args) {

		
		//creating stack
		ArrayStack myStack = new ArrayStack();

		//push
		myStack.push(5);
		myStack.push(10);
		myStack.push(15);
		
		//printing elements
		System.out.println("---------printing stack elements--------");
		myStack.printElements();
		
		
		System.out.println("----------peek-----------");
		System.out.println( myStack.peek());
		
		System.out.println();
		System.out.println("----------pop-----------");
		System.out.println(myStack.pop());
		
		System.out.println("----------peeking again-----------");
		System.out.println(myStack.peek());
		
		System.out.println("----------printing elements-----------");
		myStack.printElements();
		
		
		myStack.push(20);
		
		System.out.println("----------printing after last push-----------");
		myStack.printElements();
		
		
		
		
	}

}
