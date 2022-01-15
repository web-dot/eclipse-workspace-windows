package com.sudip.dsa;

public class TestStack {

	public static void main(String[] args) {
		
		StackOfInts stk01 = new StackOfInts();
		stk01.push(1);
		stk01.push(2);
		stk01.push(3);
		stk01.push(4);
		System.out.println(stk01.pop());
		System.out.println(stk01.pop());
		System.out.println(stk01.pop());
		System.out.println(stk01.pop());
		//System.out.println(stk01.pop());
	}

}
