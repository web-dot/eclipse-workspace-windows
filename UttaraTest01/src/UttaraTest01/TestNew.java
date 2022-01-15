package UttaraTest01;


interface BB {
	  int a = 1;                        // 1
	  public int b = 2;                 // 2
	  public static int c = 3;          // 3
	  public static final int d = 4;    // 4
	}


interface A111 {
String s = "yo";
public void method1();
}

interface BC {
}


interface C extends A111, BC {
public void method1();
public void method1(int x);
}


 class Atom {
 
	Atom() 
	{ 
		System.out.print("atom "); 
	}
 }
 class Rock extends Atom 
   {
 		Rock(String type) 
		{ 
			System.out.print(type); 
		}
 }
 	 class Mountain extends Rock 
	{
 		Mountain() 
		{
 			super("granite ");
 			new Rock("granite ");
 		}


	}
 	 
 	 
 	abstract class Vehicle { public int speed() { return 0; }}
 	class Car extends Vehicle { public int speed() { return 60; }}
 	class RaceCar extends Car { public int speed() { return 150; }}
 	 
 	 

 	
 		class Foo {
 			 public int a = 3;
 			 public void addFive() 
 			 { 
 				a += 5; 
 				System.out.print("f "); 
 			 }
 		}
 		class Bar extends Foo {
 			 public int a = 8;
 			 public void addFive() 
 			 { 
 				this.a += 5; 
 				System.out.print("b " ); 
 			 }
 		}
 	
 		
 	
 	
public class TestNew {

	public static void main(String[] args) {
		
		
		Foo f = new Bar();
		f.addFive();
		System.out.println(f.a);
		
		
		
		
		
	    Integer x = 400;
	        Integer y = x;
	         x++;
	         StringBuilder sb1 = new StringBuilder("123");
	         StringBuilder sb2 = sb1;
	         sb1.append("5");
	         System.out.println((x == y) + " " + (sb1 == sb2));
		
		
			
		RaceCar racer = new RaceCar();
		Car car = new RaceCar();
		Vehicle vehicle = new RaceCar();
		System.out.println(racer.speed() + ", " + car.speed()
		+ ", " + vehicle.speed());
		
		
		   //StringBuffer sb1 = new StringBuffer("Amit");
		   //StringBuffer sb2= new StringBuffer("Amit");
		   String ss1 = "Amit";
		   System.out.println(sb1==sb2);
		   System.out.println(sb1.equals(sb2));
		   System.out.println(sb1.equals(ss1));
		   System.out.println("Poddar".substring(3)); 
		
		new Mountain();
		
		   Error error = new Error();
		    Exception exception = new Exception();
		    System.out.print((exception instanceof Throwable) + ",");
		    System.out.print(error instanceof Throwable);
		
	}

}
