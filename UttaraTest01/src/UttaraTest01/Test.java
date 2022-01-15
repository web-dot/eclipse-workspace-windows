package UttaraTest01;

class X{
	
	private static void m1() {
		
	}
	
	public  void m2() {
		m1();
		System.out.println("in X class m2()");
	}
	
	
	public void m3() {
		
		m1();
	}
	
	public final void  m4() {
		
	}
	
	private final void p1() {
		
	}
	
}


class Y extends X{
	
	public void m5() {
		
		m2();
		
	}
	
	void p1() {
		
	}
	
}


//class Animal{
//	
//	public static void eat() {
//		System.out.println("animal eating");
//	}
//	
//	private final void sleep() {
//		System.out.println("animal sleeping");
//	}
//	
//}
//
//class Dog extends Animal{
//	
//	
//	public void rest() {
//		
//		eat();
//		sleep();
//	}
//	
//	private final void sleep() {
//		System.out.println("dog sleeping");
//	}
//	
//	
//}

class A{
	
	private final void a1() {};
	
}


class B extends A{
	
	 void a1() {};
}


class Hippo{
	
	public void sing() {}
	public void dance() {
		System.out.println("hippo dancing");
	}
}

abstract class Kid extends Hippo{
	
	public abstract void dance();
	
}


class Toddler extends Kid{
	
	public void dance() {
		System.out.println("toddler dancing");
	}
	
}


class TestA{
	public void start() {System.out.println("TestA");}
}

class TestB extends TestA{

		public void start() {System.out.println("TestB");}
}

class TestC extends TestB{
	public void start() {System.out.println("TestC");}
}




public class Test {

	public static void main(String[] args) {
		
		
		((TestA)new TestB()).start();
		((TestC)new TestB()).start();
		
		
		
		
		
		TestA a = new TestB();
		a.start();
		
		TestA t = (TestA)a;
		t.start();
		
		
		Kid k = new Toddler();
		k.dance();
		
		
		
		Y y = new Y();
		y.m5();
		
		
//		Dog d1 = new Dog();
//		d1.rest();
		//d1.sleep();
		
		X x = new Y();
		//x.p1();
		
		Y y1 = new Y();
		y1.p1();
		
	}

}
