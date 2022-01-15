package com.uttara.testinterface;



//a --> can a interface extend multiple interfaces --> yes
interface A {}
interface B {}


interface C extends A, B{};

//b --> can a class implement multiple interface --> yes
class D implements A,B{};


//c --> what happens when a class implements multiple interface with same method
// as abstract methods do not have any implementation, implementing class need to 
//implement only one
interface E{
	void test();
}


interface F{
	void test();
}



class G implements E,F{
	public void test() {
		
	}
}




//d


interface I1{
	void m1();
}


interface I2{
	int m1();
	void m2();
}


/*
 * won't compile
 * 
class CS implements I1, I2{
	
	public void m1() {};
	public int m1() {};
	public void m2() {};
}
*/



//e

abstract class A1 implements I2{
	public int m1() {
		System.out.println("in A1 m1()");
		return 1;
	};
}


class C2 extends A1{
	public void m2() {
		System.out.println("in C m2()");
	}
}




















