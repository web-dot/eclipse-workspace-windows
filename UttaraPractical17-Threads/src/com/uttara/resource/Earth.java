package com.uttara.resource;

public class Earth {

	private Earth()
	{
		System.out.println("in Earth`s no-arg constr");
	}
	private static Earth obj = null;
	
	public static synchronized Earth getInstance()
	{
		if(obj == null)
		{
			obj = new Earth();
		}
		return obj;
		
	}
	
}
