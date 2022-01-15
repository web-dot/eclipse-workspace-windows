
public class Main {
	
	public static void countDown(int x) {

		int y = x - 1;
		if(y > 0) {
		countDown(y);
		}
		System.out.println(y);
	}

	public static void main(String[] args) {
		//recursive();
		countDown(10);

	}

}
