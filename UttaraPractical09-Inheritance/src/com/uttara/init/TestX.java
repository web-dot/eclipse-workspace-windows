package com.uttara.init;

public class TestX {

	public static void main(String[] args) {
		
	//--------------------------------------------------------//
		//X obj = new X();
		
		//System.out.println("a = " + obj.a);
		//System.out.println("b = " + X.b);
		
		//X obj2 = new X();
	//--------------------------------------------------------//
		
		System.out.println();
		
	//-------------------------------------------------------//
		/*
		Y obj3 = new Y();
		
		System.out.println();
		
		System.out.println("base instance var a = " + obj3.a + " : assigned in base cons");
		System.out.println("base static var b = " + obj3.b + " : assigned in base static init");
		System.out.println("child instance var c = " + obj3.c + " : assigned in child cons");
		System.out.println("child static var d = " + obj3.d + " : assigned in child static init");
		*/
		//[0] X class loaded
		//[1] X class static fields created
		//[2] X class static field initializers executed
		//[3] X class static initializers executed
			//[4] Y class loaded
			//[5] Y class static fields created
			//[6] Y class static field initializers executed
			//[7] Y class static initializers
		
		
		//ALLOCATES MEM
		//CREATES OBJECT
		//CREATES ALL INSTANCE VARIABLES OF CHILD AND PARENT IRRESPECTIVE OF ACCESS SP
		
		//[8] X class instance fields created
		//[9] X class instance field initializers executed
		//[12] Y class instance fields created
		//[13] Y class instance field initializers executed
		
		//ENTER CONSTRUCTOR
		//EXECUTE FIRST STATEMENT super() TO REACH PARENTMOST CLASS
		
		//[10] X class instance initializers executed
		//[11] X class constructor executed
		
			//[14] Y class instance initializers executed
			//[15] Y class constructor executed
		
	//----------------------------------------------------------------//
		System.out.println();
		
		
		//Y obj1 = new Y();
		//System.out.println();
		//Y obj2 = new Y();   //parent and child class static initializers are not executed second time a child object is created.
	
	//-------------------------------------------------------------//
		
		
		Y obj3 = new Y(99);
		
		
	}

}






