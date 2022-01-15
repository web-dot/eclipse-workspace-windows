package com.uttara.practical10;

/*[7] 
 * 
 * [a] can a abstract be marked final?
 *[Ans] No, Abstract class can not be final and vice versa to remove ambiguity.
 * 			
 * 				*abstract keyword means a class should be extended and extending class must implement 
 * 				 the inherited abstract methods else the extending class will not compile.
 * 
 * 				*final prevents a class to be extended. 
 * 
 * 				*This is ambiguous to the compiler, thus Java does not support it.
 * 
 * abstract final class/method
 * 
 */

/*
abstract final class FinalClass{  
	
	// will not compile
	
	abstract final void test(); 
	  
}
*/

/*
 * [b] can a static class be marked abstract?
 * [Ans]	No, as abstract class is meant to e derived and a static class can not be derived.
 * */

/*
abstract class AbsStatic{
	
	static abstract void test(); 
	
}
*/



/*
 * [c] can abstract class inherit from another abstract class?
 * [Ans] Yes, any concrete subclass must ensure that all the abstract methods are implemented.
 * */


//this works
abstract class SomeAbsClass{
	
	
}

abstract class OtherAbsClass extends SomeAbsClass{
	
}



/*
 * [d]   can a abstract class extend a concrete class?
 * [Ans] Yes, if you want to instantiate the abstract class then you have to subclass it with a concrete
 * 		 implementation of the abstract methods and instantiate it through a concrete class.
 * */

class AClass{
	
}

abstract class AAbsClass extends AClass{
	
}



/*
 * [e] can a abstract class have initializer/constructors
 * [Ans] Yes.
 * */

abstract class AbsC{
	
	{
		int i = 20;
	}
	
	public AbsC() {
		
	}
	
}



/*
 * [f] can you have private abstract methods
 * [Ans] No, as private methods can not be overridden, and abstract methods are supposed to be overridden. 
 * 
 * */


/*
class SomC{

	abstract private void test(); // will not compile
}
*/



/*
 * [g] can you have abstract class with final method?
 * [Ans] Yes.
 * */


abstract class AbC{
	
	final void test() {
		
	}
	
}



/*
 * [h] can you have final class with abstract method?
 * [Ans] No. 
 * */


/*

final class AFinalClass{
	
	public abstract void test();     //a abstract method can only be declared inside a abstract class
}


*/
























public class TestAbstract {

	public static void main(String[] args) {
		
		
		

	}

}
