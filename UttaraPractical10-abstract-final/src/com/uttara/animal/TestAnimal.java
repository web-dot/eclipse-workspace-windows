package com.uttara.animal;

class AAnimal{
	String name;
	public void eat() {
		System.out.println("animal eat");
	};
	public void sleep() {};
}

class ADog extends AAnimal{
	public void eat() {
		System.out.println("dog eat");
	}
}



class TestAnimal {
	public static void main(String[] args) {
		
		//Animal a1 = new Animal(); //can not instantiate type Animal
		
		ADog d1 = new ADog();
		d1.name = "max";
		d1.eat();
		d1.eat();
		d1.sleep();
	}
}
