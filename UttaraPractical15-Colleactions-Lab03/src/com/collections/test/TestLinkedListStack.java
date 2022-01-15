package com.collections.test;

import com.collections.classes.*;


public class TestLinkedListStack {

	public static void main(String[] args) {
		
		LinkedListStack ls1 = new LinkedListStack();
		
		ls1.push("hello");
		ls1.push("world");
		
		System.out.println(ls1.pop());
		System.out.println(ls1.pop());
		
		
		System.out.println();
		System.out.println("using stack to reverse a sentence----->");
		
		String senetence = "long long time ago, on a very high mountain";
		
		String[] sa = senetence.split(" ");
		
		//creating stack object
		LinkedListStack ls2 = new LinkedListStack();
		
		//pushing elements in stack
		for(String s : sa) {
			ls2.push(s);
		}
		
		//popping from stack
		String out = "";
		for(int i = 0; i < sa.length; i++) {
			out = ls2.pop() + " ";
			System.out.print(out);
		}
		

	}

}
