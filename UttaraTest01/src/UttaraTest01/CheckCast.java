package UttaraTest01;
class Animal{
	public void eat() {System.out.println("Animal eating");}
	public void sleep() {System.out.println("Animal sleeping");}
}
class Canine extends Animal{
	public void tear() {System.out.println("Canine tearing flesh");}
}
class Dog extends Canine{
	public void bark() {System.out.println("Dog barking");}
	public void sleep() {System.out.println("Dog sleeping");}
}
class Maridog extends Dog{
	public void roam() {System.out.println("maridog roaming");}
}
class Poodle extends Maridog{
	public void hop() {System.out.println("poodle hopping");}
}
class Beagle extends Poodle{
	public void bloop() {System.out.println("beagle blopping");}
}
class Bird extends Animal{
	public void fly() {System.out.println("bird flyin");}
}

public class CheckCast {
	public static void main(String[] args) {
		
		
		//parent object cannot be assigned to child reference
		//Canine c = new Animal();
		
		
		//parent reference can be down-casted to any of its sub-type
		Animal a1 = (Animal)new Dog();
		a1.sleep();
		
		((Animal)new Dog()).sleep();
		
		//child object can be assigned to parent reference
		//will compile nad also run
		Canine c = (Canine)a1;  //a1 is a Canine
		Dog d = (Dog)a1;		//a1 is a Dog
		
		//will compile but parent object can not be assigned to child reference
		//ClassCastException at runtime
		//Dog is parent to Maridog, Poodle and Beagle
		
		//Maridog m = (Maridog)a1;//a1 is not a Maridog (Maridog m = new Dog() // CE)
		//Poodle p = (Poodle)a1;	//a1 is not a Poodle(Poodle p = new Dog())
		//Beagle b = (Beagle)a1;	//a1 is not a Beagle
		
		//c.tear();
		
		
		
		
		
		
		
	}

}








