package com.uttara.classes;

public class ParamJob implements Runnable {
	
	int output;
	
	
	@Override 
	public void run() {
		
		output = (int)(Math.random()*1000000);
		//System.out.println(output);
	}
	
	public int getOutput() {
		//System.out.println(output);
		return output;
	}
	
	
}
