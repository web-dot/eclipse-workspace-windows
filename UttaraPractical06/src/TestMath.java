import java.math.BigDecimal;
import java.math.BigInteger;

public class TestMath {

	public static long add(int a , int b) {
		long sum = (long)a + b;
		return sum;
	}
	
	public static double addInts(int ... arr) {
		double sum = 0.0;
		
		for(int i : arr) {
			sum = (double)(sum + i);
		}
		return sum;
	}
	

	
	
	public static void main(String[] args) {
		

		System.out.println(add(25, 47));
		System.out.println(add(-3, -5));
		System.out.println(add(0, 0));
		
		
		System.out.println();
		
		System.out.println(addInts(new int[] {1143, 1047, 1179, 1284, 1191}));
		System.out.println(addInts(new int[] {1,2,3,4}));
		System.out.println(addInts(new int[] {-1,-1}));
		System.out.println(addInts(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}));

		
		
		
		
	}

}
