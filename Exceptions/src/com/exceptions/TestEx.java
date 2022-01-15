package com.exceptions;

public class TestEx
{
	public static void test2()
	{
		System.out.println("test2() -> starting");
		Integer.parseInt("ten");
		System.out.println("test2() -> ending");
	}
	public static void test1()
	{
		System.out.println("test1() -> starting");
		test2();
		System.out.println("test1() -> ending");
	}
	public static void main(String[] args)
	{
		System.out.println("main start");
		try
		{
			test1();
			//System.out.println("args[0] = " + args[0]);
			
		}
		catch(Throwable t)//recover flow of control
		{
			System.out.println("something bad happened msg = " + t.getMessage());
			t.printStackTrace();
		}
		System.out.println("main end");
	}
}