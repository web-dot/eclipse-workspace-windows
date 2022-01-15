package com.uttara.person;

import java.util.Arrays;

public class TestPerson {

	public static void main(String[] args) {
		
		
		Person p = new Person();
		
		p.setName("Karthik");
		p.setAge(33);
		
		
		for(int i = 0; i < 20; i++) {
			p.addPetNames("pn"+i);
		}
		
		p.addPetNames("pn20");
		
		p.dance();
		
		p.sing();
		
		

	}

}
