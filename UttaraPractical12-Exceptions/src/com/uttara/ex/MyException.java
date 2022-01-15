package com.uttara.ex;

public class MyException extends Exception {
	public MyException() {
		
	}
	public MyException(String msg) {
		super(msg); //so that we can pass a String(message) to the parameterized constructor of the Exception class which will be displayed as a message when the exception occurs 
	}
}
