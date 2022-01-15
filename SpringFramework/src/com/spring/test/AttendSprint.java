package com.spring.test;

public class AttendSprint implements Task{
	
	public void doTask() {
		System.out.println("I am a developer employee, attending Sprint");
	}

	@Override
	public String toString() {
		return "AttendSprint";
	}
	
	
	
}
