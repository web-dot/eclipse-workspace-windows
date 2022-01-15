package OOP;

/*
class A{
	
	public void test() {
		System.out.println("inside A");
	} 
	public void test() {
		System.out.println("inside B");
	}
}


class B extends A{
	public void test(int num) {
		System.out.println("inside B");
	} 
}
*/

class Animal{
	
	public void test() {
		System.out.println("in Animal class");
	}
	
}

class Canine extends Animal{
	
}


class Dog extends Canine{
	
	public void test() {
		System.out.println("in Dog class");
	}
	
}


class MariDog extends Dog{
	
	public void test() {
		System.out.println("in Dog class");
	}
	
}


class Base{
	
}


class Derived extends Base{
	
}

public class TestOvrloading01 {

	public static void main(String[] args) {
		
		Canine c = new Canine();
		//Dog d = c;    		//  Compile time error
		//Dog d = (Dog)c;			//ClassCastException at runtime as Canine c is not an objct of derived class
		
		Animal a = new MariDog();
		//Dog d = a;   //Compile time error -> type mismatch
		Dog d = (Dog)a; // will compile and run as a is a object of derived class
		
	}
}
