package OOP;


class Person{
	
	
	String name;
	/*
	 * CONSTRUCTOR
	 * 
	 * STRUCTURE------------->
	 * 
	 * what distinguishes constructor from a method is not the Identifier
	 * but it is the lack of Return d.t and also Non-Access specifier
	 * 
	 * NOTE** a method can be named as the same name of the class
	 * 
	 * -> A constructor is a special member of class.
	 * -> A constructor might look like a method but it is not a method.
	 * -> Structurally constructor has a header and a body.
	 * -> Header contains Access Specifier.
	 * -> Constructors identifier must be that of class name.
	 * -> Argument list of a constructor can either be empty or parameterized.
	 * -> The body of the constructor can have any number of statements.
	 * -> The constructor can be marked with any of the four Access Specifiers.
	 * 
	 *   USE---------------->
	 *   
	 *  -> A constructor is a member that is automatically executed when a object of the class is created.
	 *  -> The body of the Constructor will be executed each time object of the class is created. 
	 *  -> A Constructor is used to initialize STATE
	 */
	
	public Person(String name) { //this is a constructor
		this.name = name;
	}
}



public class TestConstructor {
	
	/*
	 * 1] JVM searches for Person.class and opens the class
	 * 2] Scans all the members, Calculates memory required to represent one object
	 * 3] Allocates that much memory on the heap.
	 * 4] Physically creates the object.
	 * 5] Executes the constructor 
	 * */
	/*
	 * CONTROL FLOW:
	 * 
	 * 1] The CF is in main() method, and when the below statement executes
	 * 2] If the constructor body has to be executed the CONTROL should jump to Person.class
	 * 3] Whenever the CONTROL jumps, the JVM creates a STACK FRAME, pushes it on top of the stack
	 * 	  then only it enters and alters the FLOW OF CONTROL.
	 * 4] In this case a STACK FRAME for the constructor of the Person will be created 
	 * 5] Now the CONTROL enters Person classes constructor
	 * | 		|
	 * |_______	|
	 * |Person()|
	 * |________|
	 * | main()	|
	 * |________|
	 * 
	 * 
	 * */
	Person p1 = new Person();
	Person p2 = new Person();
	
	
}





