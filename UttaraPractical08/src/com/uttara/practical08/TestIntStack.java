package com.uttara.practical08;

public class TestIntStack {

	public static void main(String[] args) {
		
		
		//STACK -> LIFO
		
		IntStack stk1 = new IntStack();
		
		
		//inseting single elements in STACK
		stk1.push(10);
		stk1.push(20);
		stk1.push(30);
		
		System.out.println(stk1.toString());
		
		//POPPING SINGLE ELEMENTS AT A TIME
		System.out.println(stk1.pop()); //returns 30
		System.out.println(stk1.pop()); //returns 20
		System.out.println(stk1.pop());	//returns 10
		
		System.out.println(stk1.toString());
		
		System.out.println();
		System.out.println("--------INSERTING--------");
		//INSERTING ELEMENTS IN LOOP
		
		
		for(int i = 0; i < 10; i++) {
			stk1.push((int)(Math.random()*100));
		}
		
		stk1.push(100);
		
		System.out.println(stk1.toString());
		
		
		System.out.println();
		System.out.println("--------LIFO POP--------");
		//POP AS LIFO
		for(int i = 0; i < 5; i++) {
			System.out.println(stk1.pop());
		}
		
		System.out.println(stk1.toString());
		
		
		
	}

}
