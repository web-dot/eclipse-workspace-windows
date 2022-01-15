package com.uttara.practical04;


class Cow{
	String name;
	public void moo() {
		System.out.println("I am a Cow, my name is : " + this.name + "oooo");
	}
}


public class TestCow {

	public static void main(String[] args) {
		Cow c1 = new Cow();
		c1.name = "Ramu";
		c1.moo();
		
		Cow c2 = c1;
		
		c1.name = "Gomuuu";
		c2.moo();
		

	}

}
