package com.uttara.collections01;

public class Person {
	
	
	String name;
	int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			System.out.println("in Person class equals()");
			Person other = (Person)obj;
			if(this.name.equals(other.name) && this.height == other.height) {
				//the other Person has same name and height as this Person, so
				//they should be considered equal
				return true;
			}
			
		}catch(Exception e) {
			//this will catch NullPointerException that occurs if 
			//obj is null and the ClassCastException that occurs if
			//obj is not of type Person. In this case obj is not equal
			//to this Person, so return false.
			return false;
		}
		return false;
	}



	@Override
	public String toString() {
		return "Person:" + name + "," + height;
	}
	
	
	
	
	
}
