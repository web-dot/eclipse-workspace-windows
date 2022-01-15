package com.uttara.animal;

public class TestAnimals {

	public static void main(String[] args) {
		
		
		Animal a1 = new Animal();
		a1.setName("Aslan");
		System.out.println(a1.getName());
		
		a1.dance();
		a1.eat();
		a1.sleep();
		
		
		
		Animal a2 = new Hippo();
		System.out.println(a2.getName());
		
		a2.setName("Horton");
		a2.dance();
		a2.eat();
		a2.sleep();
		
		
		Animal a3 = new Croc();
		a3.setName("Pocho");
		
		a3.dance();
		a3.eat();
		a3.sleep();
		
		
		Vet v = new Vet();
		
		System.out.println();
		System.out.println("--------vet treating Animal--------------");
		v.treat(a1);
		
		
		System.out.println("--------vet treating Hippo--------------");
		v.treat(a2);
		
		
		System.out.println("--------vet treating Croc--------------");
		v.treat(a3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
