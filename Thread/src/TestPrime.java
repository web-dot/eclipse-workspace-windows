
public class TestPrime {

	public static void main(String[] args) {
		try {
		CountPrimeJob job1 = new CountPrimeJob(10000000);
		Thread t1 = new Thread(job1);
		t1.start();
		t1.join(); //Throws Interrupted Exception
		
		CountWords job2 = new CountWords("D:\\java\\ref\\IO\\booktxt");
		Thread t2 = new Thread(job2);
		t2.start();
		t2.join();
		System.out.println(job2.getCount());
		System.out.println(job1.getPrime());
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
