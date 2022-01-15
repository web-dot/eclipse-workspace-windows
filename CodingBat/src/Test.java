





public class Test {
	
	public static double closestToAvg(int a, int b, int c) {
		
		double avg = (a + b + c) / 3;
		System.out.println("avg = " + avg);
		double d1 = avg - a;
		double d2 = avg - b;
		double d3 = avg - c;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		if(d1 < d2 && d1 < d3) {
			return a;
		}
		else if(d2 < d1 && d2 < d3) {
			return b;
		}
		else {
			return c;
		}
	}
	
	public static void printPattern() {
		
		for(int i = 1; i < ) {}
	}
	
	public static void main(String[] args) {
		double r = closestToAvg(33, 44, 55);
		System.out.println(r);
	}
}
