
public class TestString {

	public static void main(String[] args) {
		
		
		//String Arun Sir class notes
		
		/*
		 * Heap is the part of JVM memory where all the objects are created. String Constant Pool is a small part of the Heap where String CONSTANTS are stored
		 * and JVM checks the SCP before creating a String object with literal value whether a object with the same state exists or not. If not then only JVM
		 * creates a new object with the state of the literal value if a object with the same state exist in SCP JVM wil REUSE the object and return the address to the 
		 * reference variable. 
		 * */


		//1] String object can be created in two ways:

				//a] using the new keyword passing a string literal to the constructor:

						String s1 = new String("Java");
							
								/*
								Creating a string object like this will first create a object in the heap, return the address and will also create a object with the same 
								state in SCP(STRING CONSTANT POOL), that has a implicit reference from JVM. Thus 2 objects are created.
								
								Even if the object of the heap is dereferenced, JVM will keep a reference to the SCP object for future re-usability.
								If some point in time later another String object with the same state is created with the new keyword as below:
								*/
								
						String s2 = new String("Java"); 
						System.out.println(s1 == s2);	// prints false as s1 and s2 points to different addresses in memory
							
								/*
								Then a new object will be created in the heap but JVM will check if an object with the same state exists in SCP, if not JVM will
								create a new object in SCP. In this case it will not create a new object with "Java" as state in SCP as already there is an object
								with state as "Java".
								*/
					
				//b] using string literal as value
				
						String s3 = "Java";
						
							
							/*
							when a string object is created like this JVM will first check in SCP whether an object with the same state exists or not, if not, JVM will
							create a an object with the state in POOL. In this case JVM will check if there is a string object with state "Java" in SCP, as there is an 
							object with the same state it will not create a object with state as "Java"
							*/
						
						String s4 = "Java";
						
						
						//s3 and s4
						System.out.println(s3.hashCode()); //2301506
						System.out.println(s4.hashCode());	//2301506
						
						System.out.println(s3.equals(s4)); //true
						System.out.println(s3 == s4); // returns true as s3 and s4 points to the same object.
						
						//s2 and s3
						System.out.println(s2.hashCode()); //2301506
						System.out.println(s3.hashCode());	//2301506
						
						System.out.println(s2.equals(s3)); //returns true as both s2 and s3  have same state
						System.out.println(s2 == s3); //return false as the addresses of s2 and s3 are not same
						
						
						String s5 = "Hello";
						
						/*
						 * in the above statement JVM checks in SCP if there is a object with state "Hello", and as there is no such object JVM will create a object with state
						 * "Hello"
						 * */
						
						String s6 = new String("Hello");
						
						System.out.println(s5 == s6); //false
						
						System.out.println(s5.hashCode()); //69609650
						System.out.println(s6.hashCode());	//69609650
						
						System.out.println(s5.equals(s6)); // true
						
	}

}
