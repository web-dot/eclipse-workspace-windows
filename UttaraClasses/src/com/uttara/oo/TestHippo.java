package com.uttara.oo;

class Hippo {

int size;  // instance variable
	
	public void sing() // instance method
	{
		System.out.println("I am a Hippo singing...");
	}
	
	// recap when instance var created, when inst method 
	// can be called? how to access both?

}

public class TestHippo
{
	public static void main(String[] args)
	{
	    System.out.println("main()->starting");
	    // Creating Hippo references
	    Hippo h1, h2; // what type of variables are these?..lo..ref..
	    // create object and assign address to reference
	    h1 = new Hippo(); // what will h1 contain?
	    // write and visualize the contents of stack and heap now
	    System.out.println("getting hippos size using h1 before setting size "+h1.size);
	    h1.size = 5; // where is size? is it on heap, stack? in object?
	    System.out.println("getting hippos size using h1 after setting size "+h1.size);
	    System.out.println(h1); // what o/p will you see?
	    
	    h2 = new Hippo();
	    h2.size = 25;
	    System.out.println("created another hippo object with h2. size set to 25");
	    h2.sing(); 
	    // which hippo object will be made to sing?
	    h1.sing(); 
	    // how does JVM manage control flow for these method calls?
	    
	    System.out.println("getting hippos size using h2 "+h2.size);
	    
	    h2 = h1; // where are both h2 and h1 pointing?
	    System.out.println("setting hippos size to 30 using h2");
	    h2.size = 30;
	    System.out.println("getting hippos size using h1 "+h1.size); // what will we get?
	    System.out.println("getting hippos size using h2 "+h2.size); // what will we get?
	    h1.sing();
	    h2.sing(); // which object is singing?
	    
	    //what happened to original hippo object pointed to by h2??
	    
	    h1 = null;  // what is null?
	    h2 = null; // what does setting null to a ref variable mean?
	    
	    System.out.println("main()->ending");
	    
	}
}

