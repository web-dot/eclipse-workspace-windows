package test;

public class TestFinally {
	public int m1() {
		int x = 10;
		try {
			System.out.println("in m1() x = " + x);
			String s = null;	
			s.charAt(0);	//[b][c]Line 9 : NullPointerException --> x = 10 --> catch
			return x++; 	//[b][c]Line 10 : will not execute
		}catch(Exception e) {
			System.out.println("in catch of m1() " + e.getMessage());
			int[][] m = new int[3][];
			System.out.println(m[0][1]); //[c]Line 20: NullPointerException in catch --> catch fails --> x = 10 --> finally
			return ++x;	//[b]catch succeeds --> x = 11 --> finally
		}
		finally {
			System.out.println("in finally() of m1() x = " + x);
			Object o = null;
			o.toString(); // [d]Line 10 : NullPointerException --> x = 10
			//return ++x; //[b]x = 12
						//[c]x = 11;
		}
	}
	
	public static void main(String[] args) {
		
		TestFinally tf01 = new TestFinally();
		System.out.println("in main x = " + tf01.m1()); //[b] x = 12 [c] x = 11
							
	}
}
