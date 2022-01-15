package com.uttara.womanandman;

public class TestMarriage {

	public static void main(String[] args) {
		
		
		//a
		Man m1 = new Man();
		m1.setName("Rahul");
		
		//m1.printWife();
		
		//b
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		Man m2 = new Man();
		Woman w2 = new Woman();
		
		m2.setName("Arbaz");
		w2.setName("Malaika");
		
		System.out.println("---------MARRYING--------------");
		
		m2.marry(w2);
		
		System.out.println();
		System.out.println();
		
		System.out.println("---------SAYING NAMES--------------");
		
		m2.printWife();
		w2.printHubbysName();
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------TRYING TO MARRY ONCE MARRIED----------------");
		
		Woman w3 = new Woman();
		w3.setName("Rosie");
		m2.marry(w3);
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------DIVORCING----------------");
		
		m2.divorce();
		
		
		System.out.println();
		System.out.println();
		System.out.println("------------MARRIED AGAIN----------------");
		
		m2.marry(w3);
		
		w3.printHubbysName();
		
		
		
	}

}
