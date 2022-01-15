package test;
import com.uttara.ex.*;

public class TestEx{
	public void m3(Animal a) {
		System.out.println("in m3()");
		if(a instanceof Pig) {
		Pig p = (Pig)a;
		}
		
	}
	public void m2() {
		System.out.println("in m2()");
		Animal a = new Animal();
		m3(a);
		Pig p = new Pig();
		m3(p);
	}
	public void m1() {
		System.out.println("in m1()");
		m2();
	}
	
	
	public static void main(String[] args) {
		
		TestEx tEx01 = new TestEx();
		try {
		tEx01.m1();
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
	}
	
}

