package LinkedListStack;



class Singleton{
	
	int data;
	String name;
	static int count = 0;
	
	
	public void checkFinal() {
		if(count == 1) {
			
		}
		
	}
	
	private Singleton(int data, String name) {
		this.data = data;
		this.name = name;
		count++;
	}
	
	public static Singleton callConstructor() {
		if(count == 0) {
			Singleton s = new Singleton(10, "Java");
			count++;
			return s;
		}
		else {
			
		}
	}
	
}



public class TestSingle{
	
	
	public static void main(String[] args) {
		
		Singleton s = Singleton.callConstructor();
		
		Singleton s2 = Singleton.callConstructor();
		
	}
	
	
}