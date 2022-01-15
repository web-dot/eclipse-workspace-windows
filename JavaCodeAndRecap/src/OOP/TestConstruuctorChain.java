package OOP;

class Human{
	String name;
	public Human(String name) {
		this.name = name;
		System.out.println("in no arg cons of Human");
	}
}

class Man extends Human{
	
	public Man(String name) {
		super(name);
		System.out.println("in no arg cons of Man");
	}
}

class Boy extends Man{
	public Boy(String name) {
		super(name);
		System.out.println("in no arg cons of Boy");
	}
}

Object


public class TestConstruuctorChain {

	public static void main(String[] args) {
		
		Boy b1 = new Boy("rohit");
		System.out.println(b1.name);

	}

}
