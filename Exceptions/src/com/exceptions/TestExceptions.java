public class TestExceptions
{
	public static double divide(String s1, String s2)
	{
		System.out.println("in divide() s1 = " + s1 + " s2 = " + s2);
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		double res = (num1*1.0)/num2;
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println("main start");
		try
		{
			res = divide(args[0], args[1]);
			System.out.println("res = " + res);
			
		}
		catch(Throwable e)
		{
			System.out.println("Throwable catch");
		}
		e.printStackTrace();
		e.getMessage();
		System.out.println("main end");
	}
}