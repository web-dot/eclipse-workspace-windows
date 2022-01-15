package com.uttara.practical04;

public class SuperDuck
{
	// mark state with private access so
	// that class users cannot access and set whatever state
	// they want
	
	private int size;  
	private String name;
	
	//expose 1 setter and 1 getter method per instance variable
	public void setSize(int n)
	{
		// validate the passed input first and then only 
		// set the state
		if(n > 0 && n <=20)
			size = n;
		else
			System.out.println("Size of Duck must be > 0 and <= 20");
	}
	
	public int getSize()
	{
		return size;	
	}
	public void setName(String str)
	{
		if(str!=null) // what are we checking here?
			name = str;
		else
			System.out.println("should not pass null as name value");
	}
	public String getName() // why do we need getter when user only passes data?
	{
		return name;	
	}
	public void dance()
	{
		if(size!=0) // can you remember why you are checking this?
		{
			if (size < 10)
				System.out.println("Duck with name "+name+" doing cha cha...");
			else
				System.out.println("Duck with name "+name+" doing bharatnatya");
			
		}
		else
			System.out.println("First set the size on Duck correctly and then ask it to dance ri!");
	}

}

class TestDuck
{
	public static void main(String[] args)
	{
		SuperDuck d1 = new SuperDuck(); // create SuperDuck ref, point to SuperDuck obj
		//d1.size = -5;
		//d1.name = "Janu";
		d1.setSize(-5);
		d1.setName("Janu");
		d1.dance(); // check if this works
		
		System.out.println();
		System.out.println("----------------0----------------");
		
		System.out.println();
		
		System.out.println("instantiating duck objects -> CLASS LOADER -> [A]memory calculated and allocated BY JVM -> [B]new Duck1 and Duck2 objects created on HEAP -> [C]local variables duck1 and duck2 created in STACK with NULL value");
		System.out.println("[B]instance variables of objects set to default -> [C]the variables duck1 and duck2 ON stack assigned the memory address value where the object is located in HEAP -> [D]local variables duck1 and duck2 point to two different Duck objects");
		
		System.out.println();
		
		Duck duck1 = new Duck();
		Duck duck2 = new Duck();
		
		System.out.println("------------>[A]insatnce variables of two duck objects set to values 10 and 20, using setter methods of duck1 and duck2----------->");
		duck1.setTailSize(10);
		duck2.setTailSize(20);
		
		System.out.println();
		
		System.out.println("----------->[B]instance methods of duck objects invoked on local reference variables duck1 and duck2------------>");
		System.out.println();
		
		duck1.swim();
		duck2.swim();
		
		System.out.println();
		
		System.out.println("------------->[C]re-assigning duck1 tailsize value to duck2 tailsize value using setter------------->");
		System.out.println();
		
		duck1.setTailSize(duck2.getTailSize());
		
		System.out.println("-------------->[D]invoking getter for tailsize on local reference variables duck1 and duck2------------->");
		System.out.println();
		System.out.println("-------------->[E]AFTER ASSIGNMENT]the tailsize of duck1 has been re-assigned the tailsize value of duck2, both the ducks have same tailsize--------->");
		
		System.out.println("i am duck1 with tailsize " + duck1.getTailSize());
		System.out.println("i am duck2 with tailsize " + duck2.getTailSize());
		
		System.out.println();
		System.out.println("------------->[F]re-assigning tailsize value for duck1 object using setter----------->")
		;
		duck1.setTailSize(30);
		
		System.out.println();
		
		System.out.println("------------->[G]getting tailsize for duck1 and duck2 object---------->");
		System.out.println();
		System.out.println("i am duck1 with tailsize " + duck1.getTailSize());
		System.out.println("i am duck2 with tailsize " + duck2.getTailSize());
		
		System.out.println();
		System.out.println("------------->[H]the tailsize of duck1 has changed and has been set to 30");
		
		duck1.setTailSize(duck2.getTailSize());
		
		System.out.println();
		System.out.println("---------->[I]assigning memory adress of duck2 object to duck1 object------------->");
		duck1 = duck2;
		System.out.println("---------->[J]both reference variables duck1 and duck2 contain the same address now and points to duck2 object ");
		System.out.println("---------->[K]printing value of instance variable tailSize, by invoking getter methods on local reference variables duck1 and duck2------------->");
		System.out.println();
		System.out.println("i am duck1 with tailsize " + duck1.getTailSize());
		System.out.println("i am duck2 with tailsize " + duck2.getTailSize());
		System.out.println("---------->[L]both variables duck1 and duck2 point to duck2 object and thus print the same tailSize value");
		
		duck1 = duck2 = null; //both references are dereferenced and the unused memory is eligible for garbage collection
		
		duck1 = new Duck(); //duck1 holds the reference to the new Duck object
		
		
	}
	
}
