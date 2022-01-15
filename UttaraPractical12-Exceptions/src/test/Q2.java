package test;

public class Q2 {

	public static void main(String[] args) {
		
		//NullPointerException
		int[] a = null;
		//System.out.println(a[0]);
		
		
		//ClassCastException
		//Object o = new String("helloclasscast!");
		//Integer i = (Integer)o; 
		
		//NumberFormatException
		//int i = Integer.parseInt("wontparse");

		//OutOfStackMemoryError //a program can not recover from an Error
		String[] sa = {};
		main(sa);
		
		//OutOfMemoryError
		
		
	}

}
