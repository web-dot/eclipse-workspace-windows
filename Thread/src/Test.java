
class CountAll implements Runnable {
@Override
public void run() {
	for(int i = 0; i < 10; i++) {
		System.out.println("Hi");
		}
	}
}

class Random extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " :random thread" );
		}
	}
}
public class Test {

	public static void main(String[] args) {

		
		Random r = new Random();
		r.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i +" :main thread");
		}
	}

}
