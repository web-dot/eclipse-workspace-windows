package com.uttara.immutableclass;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Rahul", 44);
	
		//there is no way to change state as all fields are marked private and final
		//state can be set while creating the instance only
		//and only getters are provided but no setters
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
	}

}
