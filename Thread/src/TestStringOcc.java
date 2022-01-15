
public class TestStringOcc {

	public static void main(String[] args) {
		try {
		StringOccFromFileJob job1 = new StringOccFromFileJob("D:\\java\\ref\\IO\\booktxt", "and");
		Thread t1 = new Thread(job1);
		t1.start();
		t1.join();//CheckedException -> InturruptedException
		
		CreateLongPrimeJob job2 = new CreateLongPrimeJob(10000);
		Thread t2 = new Thread(job2);
		t2.start();
		//t2.join();
		System.out.println("long prime number : " + job2.getLongPrime());
		System.out.println("searchString occurance : " + job1.getStringCount());
		}catch(Exception e) {e.printStackTrace();}
	}

}
