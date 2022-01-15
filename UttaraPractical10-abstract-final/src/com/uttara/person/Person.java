package com.uttara.person;

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
		System.out.println(song.getLyrics());
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
