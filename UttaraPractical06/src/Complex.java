public class Complex
{
	private int real;
	private int img;
	
	public Complex(int r, int i)
	{
		real = r;
		img = i;
	}
	public void setReal(int re)
	{
		real = re;
	}
	public int getReal()
	{
		return real;
	}
	public void setImg(int im)
	{
		img = im;
	}
	public int getImg()
	{
		return img;
	}
}