package com.uttara.lab07;

public class TestPersonWithACar {

	public static void main(String[] args) {

		PersonWithACar p = new PersonWithACar();
		//generate prime
		p.generatePrime(55);
		
		System.out.println();
		//car
		Car c = new Car();
		p.car = c;
		c.fuel = 20;
		p.commute("some place");
		p.commute("office");
		System.out.println();
		//dog
		Dog d = new Dog();
		p.dog = d;
		p.takeWalk();
		d.setSize(5);
		p.takeWalk();
		
		System.out.println();
		//song
		Song s = new Song("Chaiya Chaiya");
		p.song = s;
		//s.setName("Chaiya Chaiya");
		s.setLyrics("Yaar misaale ous dhale\r\n"
				+ "Paaon ke tale firdous chale\r\n"
				+ "Kabhi daal daal kabhi paat paat\r\n"
				+ "Main hava pe dhoondhoon uske nishaan");
		
		p.sing();
		
		System.out.println();
		//food
		Food f = new Food();
		f.name = "Biryani";
		f.price = 300;
		p.name = "sudipto";
		p.eat(f);


	}

}
