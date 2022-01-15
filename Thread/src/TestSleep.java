
public class TestSleep {
	public static void main(String[] args) {
		System.out.println("name of the main thread = " + Thread.currentThread().getName());
		SleepJob job = new SleepJob();
		Thread t1 = new Thread(job);
		t1.setName("Laxman");
		t1.start();
		System.out.println("main ends");
	}
}
