package com.uttara.practical04;


class Dog{
	String name;
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void bark() {
		if(size < 0 || size == 0) {
			System.out.println("dog size can not be negetive or zero");
		}
		else if(size <= 10) {
			int i = this.size;
			while(i > 0 ) {
				System.out.println("Bow WOW");
				i--;
			}
		}
		else if(size > 10){
			System.out.println("mewwooo");
		}
	}
}

public class TestDog {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		//d1.size = 11;
		//d1.setSize(11);
		d1.bark();

	}

}
