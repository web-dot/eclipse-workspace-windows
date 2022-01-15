public class While{
	 Runnable r = new Runnable() { 
		 public void run() {
		 System.out.print("Cat");
		 }
		 };
		 Thread t = new Thread(r) {
		 public void run() {
		 System.out.print("Dog");
		 }
		 }
		t.start();

}