package com.uttara.classes;

class E
{
	int x = 10;
	public void print()
	{
		System.out.println("E->x = "+x);	
	}
}
class F extends E
{
	int x = 20;
	public void print()
	{
		
		System.out.println("F->x = "+x);	
		System.out.println("E`s x = "+super.x);
		E ref = this;
		System.out.println("E`s x = "+ref.x);
	}
	
}
public class TestE
{
	
	public static void main(String[] args)
	{
		F obj = new F();
		System.out.println("obj.x = "+obj.x);
		E obj2 = obj;
		System.out.println("obj2.x = "+obj2.x);
		obj.print();
		obj2.print();
	}
}



