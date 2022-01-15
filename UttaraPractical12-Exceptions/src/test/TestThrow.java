package test;
import com.uttara.ex.MyException;

public class TestThrow {

	public static void main(String[] args) {
		
		try {
			System.out.println("going to use throw");
			if(1==1) {
			//throw new NullPointerException("null pointer");
				throw new MyException("this is my Exception");
				
				/*
				 * we should write our own exception class if we need an exception that is not in te Java library,
				 * and to help users identify a specific exception thrown by our class
				 * */
			}
		}
		catch(Exception e) {
			System.out.println("in main() -> catch() msg = " + e.getMessage());
			e.printStackTrace();
		}
		

	}

}
