package com.uttara.practical04;


class Person{
	int age;
	String name;
	public void eat() {
		if(age < 0) {
			System.out.println("kindly assign positive value for age");
		}
		else if(age > 0 && age < 40) {
			System.out.println("My name is " + name + ", I eat more but sleep less and study hard!!!" );
		}
		else {
			System.out.println("My name is " + name + ", I eat less but sleep more" );
		}
	}
	
	public void sleep() {
		if(age < 0) {
			System.out.println("kindly assign positive value for age");
		}
		else if(age > 0 && age < 40) {
			System.out.println("My name is " + name + ", I sleep less but eat more" );
		}
		else {
			System.out.println("My name is " + name + ", I sleep more but eat less...yayyyy" );
		}
	}
}

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Anil Kumar";
		
		p1.age = 40;
		
		p1.eat();
		p1.sleep();
		
		
		Person p2 = new Person();
		p2.name = "Sunil Kumar";
		
		p2.age = 20;
		p2.eat();
		p2.sleep();
		
		
		Person p = null;
		p.eat(); //throws a NullPointerException as a instance member is invoked on a null reference
		
		
		for(int i = 0; i < 10; i++) {
			Person person  = new Person();
		}
		
		//person points to one Person object
		

	}

}
