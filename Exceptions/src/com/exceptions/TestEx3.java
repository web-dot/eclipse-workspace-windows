class A
{
	public void m1()
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	public void m2()
	{
		throw new RuntimeException();
	}
}

public class TestEx3
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("main starts");
			A a1 = new A();
			a1.m2();//
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		System.out.println("main ends");
	}
}