package com.uttara.x;

public class TestX {

	public static void main(String[] args) {
		/*
		X obj = new X();
		System.out.println(obj.a);
		System.out.println(X.b);
		
		X obj2 = new X();
		System.out.println(obj.a);
		System.out.println(X.b);
		
		System.out.println();
		*/
		Y obj3 = new Y();
		
		
		//order
		/*
		 *
		 *
		 * 
		 * static init of X
		 * static init of Y
		 * instance init of X
		 * constr of X
		 *
		 * memory allocated -->
		 * objects created -->
		 * 
		 * instance init of Y
		 * constr of Y
		 * 
		 * 
		 * 
		 * */
		
		System.out.println(" :) ");
		
	}

}
