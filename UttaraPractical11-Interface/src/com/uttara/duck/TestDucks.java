package com.uttara.duck;

public class TestDucks {

	public static void main(String[] args) {
		
		Duck d1 = new Duck(15);
		Duck d2 = new Duck(10);
		Duck d3 = new Duck(5);
		
		
		d1.swim();
		d2.swim();
		d3.swim();
		
		
		//trying to create Duck object with wrong value
		Duck d4 = new Duck(11);
		
		
		//creating duck by passing constantname as parameter
		Duck d5 = new Duck(DuckSize.BIGGEST);
		Duck d6 = new Duck(DuckSize.CHOTA);
		
		
		//printing total duck objects
		System.out.println(Duck.count);

	}

}
