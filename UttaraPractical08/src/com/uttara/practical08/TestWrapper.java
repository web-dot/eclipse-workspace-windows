package com.uttara.practical08;

public class TestWrapper {

	public static void main(String[] args) {
		
		
		//primitive to object
		Byte b = 10;
		Short s = 20;
		Integer i = 30;
		
		Long l = 100L;
		Float f = 99f;
		Double d = 50.50;
		
		Character c = 'a';
		
		//object to primitive
		
		byte byt = b.byteValue();
		short sh = s.shortValue();
		int in = i.intValue();
		long lng = l.longValue();
		float flt = f.floatValue();
		double db = d.doubleValue();
		
		char ch = c.charValue();
		
		System.out.println("Object to primitive = " + byt);
		System.out.println("Object to primitive = " + sh);
		System.out.println("Object to primitive = " + in);
		System.out.println("Object to primitive = " + lng);
		System.out.println("Object to primitive = " + flt);
		System.out.println("Object to primitive = " + db);
		System.out.println("Object to primitive = " + ch);
		
		
		//access constants in wrapper classes
		
		int x = Integer.MAX_VALUE;
		double dbl = Double.MAX_VALUE;
		char chr = Character.MAX_VALUE;
		
	
		//parsing
	
		
		
		String s1 = "10";
		String s2 = "32000";
		String s3 = "50.55";
		String s4 = "10L";
		
		
		short sh1 = Short.parseShort(s1);
		int int1 = Integer.parseInt(s2);
		double dbl2 = Double.parseDouble(s3);
		
		
		

	}

}
