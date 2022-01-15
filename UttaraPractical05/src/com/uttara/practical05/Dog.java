package com.uttara.practical05;

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
