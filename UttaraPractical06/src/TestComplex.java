public class TestComplex
{
	public static void main(String[] args)
	{
		Complex co1 = new Complex(4, 5);
		Complex co2 = new Complex(1, 3);
		ComplexMeth.add(co1, co2);
		
		
		Complex co3 = new Complex(20, 15);
		Complex co4 = new Complex(1031, 3011);
		ComplexMeth.add(co3, co4);
		
		
	}
}

class ComplexMeth
{ 
	public static Complex add(Complex c1, Complex c2)
	{
		int r = c1.getReal() + c2.getReal();
		int i = c1.getImg() + c2.getImg();
		
		Complex c = new Complex(r , i);
		System.out.println("complex real = " + c.getReal());
		System.out.println("complex img = " + c.getImg());
		return c;
	}
}