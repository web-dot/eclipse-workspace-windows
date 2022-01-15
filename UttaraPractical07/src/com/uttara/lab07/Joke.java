package com.uttara.lab07;

public class Joke {
	
	
	private String text;
	public static int count;
	
	
	private Joke(String text) {
		this.text = text;
	}
	
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public void print() {
		System.out.println(text);
	}
	
	
}
