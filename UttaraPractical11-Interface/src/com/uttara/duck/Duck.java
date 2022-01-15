package com.uttara.duck;

public class Duck {

	int size;
	static int count;
	
	
	Duck(int size){
		if(size == DuckSize.CHOTA || size == DuckSize.BADA || size == DuckSize.BIGGEST) {
		this.size = size;
		count++;
		}
		else {
		System.out.println("size can be 5, 10, 15 only!!");
		}
	}
	
	void swim() {
		if(size == DuckSize.CHOTA) {
			System.out.println("CHOTA Duck, swimming very fast");
		}
		if(size == DuckSize.BADA) {
			System.out.println("BADA Duck, swimming slow");
		}
		if(size == DuckSize.BIGGEST) {
			System.out.println("BIGGEST, Duck swimming slow");
		}
	}
	
	
}
