package com.uttara.practical05;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	Car car;
	Dog dog;
	Song song;
	
	
	public void commute(String address) {
		car.start();
		car.drive();
		car.stop();
		System.out.println("I have reached " + address);
	}
	
	public void sing() {
		System.out.println("my favourate song is " + song.getName() + " lyrics of this song is " + song.getLyrics());
	}
	
	
	public void takeWalk() {
		System.out.println("I am taking my dog for a walk and the dog is barking ");
		dog.bark();
	}
	
	public void eat(Food food) {
		System.out.println("My name is " + this.name + "  I am eating " + food.name);
	}
	
	public void generatePrime(int num) {
		//int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= num; i++) {
			int count = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count < 2) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
	
}




public class TestPerson {

	public static void main(String[] args) {
		
		
		Person p = new Person();
		//generate prime
		p.generatePrime(55);
		
		System.out.println();
		//car
		Car c = new Car();
		p.car = c;
		c.fuel = 20;
		p.commute("some place");
		
		System.out.println();
		//dog
		Dog d = new Dog();
		p.dog = d;
		p.takeWalk();
		d.setSize(10);
		p.takeWalk();
		
		System.out.println();
		//song
		Song s = new Song();
		p.song = s;
		s.setName("Chaiya Chaiya");
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
