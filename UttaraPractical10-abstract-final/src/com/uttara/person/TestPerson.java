package com.uttara.person;


public class TestPerson {

	public static void main(String[] args) {
		
		//creating Person
		Person p = new Person();
		//creating Car
		Car c = new Car();
		
		//wiring Car with Person
		p.car = c;
		
		//filling up fuel
		c.fuel = 20;
		
		System.out.println("------------Person driving to destination---------");
		//asking Person to commute
		p.commute("Jaisalmer");
		
		
		System.out.println();
		System.out.println("------------Person singing-----------------------");
		
		
		Song s = new Song();
		s.setName("hallelujah");
		s.setLyrics("Now I've heard there was a secret chord\r\n"
				+ "That David played, and it pleased the Lord\r\n"
				+ "But you dont really care for music, do you?\r\n"
				+ "It goes like this, the fourth, the fifth\r\n"
				+ "The minor falls, the major lifts\r\n"
				+ "The baffled king composing Hallelujah");
		
		p.song = s;
		p.sing();
		
		System.out.println();
		System.out.println("------------Person taking a walk-----------------------");
		
		//dog
		Dog d = new Dog();
		p.dog = d;
		d.setSize(5);
		p.takeWalk();
		
		System.out.println();
		System.out.println("------------Person eating food-----------------------");
		//food
		Food f = new Food();
		f.name = "Dal Khichdi";
		f.price = 300;
		p.name = "sudipto";
		p.eat(f);
		
		System.out.println("------------Person calculaing prime number-----------------------");
		System.out.println();
		
		p.generatePrime(5);
		p.generatePrime(11);
		p.generatePrime(555);
		
		
		
		
		
	}

}