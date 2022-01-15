package test;

public class Q1 {
	
	
	public static void main(String[] args) {
		
		
		try {
		System.out.println(args[100000]);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("outside try-catch --> ");
	}
}

/*
 * Q.If the stack trace is printed when you do not have try..catch at all, 
 * why do we need try catch?	
 * 
A.When a error occurs in a method, the method creates a exception object and
hands it tO the Java runtime. The exception object contains information
about the type of the error and also the state of the program when the 
error has occurred. The Java run time will search exhaustively in 
reverse order in which the methods were called for an appropriate handler.
If it finds an appropriate handler in the method or any other method down
the stack it will hand over the exception to the appropriate handler. If
the Java runtime does not find a appropriate handler it will hand over the
exception object to the default handler, the default handler will print the
error message and the runtime will shut down(as a result the program will
also shut down abnormally)

 on the other hand if try-catch block is used to handle an exception
 appropriately, the flow of control will continue after the lines of code
 that has the problem.
*/
