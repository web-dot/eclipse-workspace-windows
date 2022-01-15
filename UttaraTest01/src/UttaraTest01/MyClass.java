package UttaraTest01;









public class MyClass {
	
	
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		
		
	    String s1 = "Amit"; 
	    String s2 = "Amit"; 
	    String s3 = new String("abcd"); 
	    String s4 = new String("abcd"); 
	    System.out.println(s1.equals(s2)); 
	    System.out.println((s1==s2)); 
	    System.out.println(s3.equals(s4)); 
	    System.out.println((s3==s4)); 
	    
	    
	    
		try {
			return;
		} 
		finally {
			System.out.println( "Finally" );

		}
		
		
	}

}
