package com.uttara.animal;

public class Vet {
	
	
	public void treat(Animal a) {
		a.dance();
		a.eat();
		a.sleep();
		
		
		if(a instanceof Croc) {
			Croc c = (Croc)a;
			c.swim();
		}
		
		if(a instanceof Hippo) {
			Hippo h = (Hippo)a;
			h.smoke();
		}
	}
	
	
}
