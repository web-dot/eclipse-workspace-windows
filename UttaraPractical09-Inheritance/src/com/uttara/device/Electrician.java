package com.uttara.device;


class Electrician{
	
	
	
	public void testDevice(Device d){
		
		if(d == null){
			throw new IllegalArgumentException("you can not pass a null reference");
		}
		else
			d.doSomething();
		
		
		//STEP-12
		if(d instanceof TV){
			TV t = (TV)d;
			t.switchChannel();
		}
	}
	
	
	
	
}