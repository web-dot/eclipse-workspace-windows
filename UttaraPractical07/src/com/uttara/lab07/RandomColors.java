package com.uttara.lab07;

public class RandomColors {

	public static void main(String[] args) {
		
		String[] colors = {"green", "orange", "yellow", "red", "blue"};
		
		
		for(int i = 0; i < colors.length; i++) {
		System.out.println(colors[(int)Math.floor((Math.random()*5))]);
		}
	}

}
