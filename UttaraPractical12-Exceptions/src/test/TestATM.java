package test;
import com.uttara.ex.*;

public class TestATM {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		
		try {
		ATM a = new ATM();
		
		Card c1 = new Card("1100", 100);
		//a.withDraw(c1, 200);	//TEST : bigger amt than bal
		a.withDraw(c1, 50);		//TEST : lesser amt than bal
		//a.withDraw(c1, -100);	//TEST : negetive amount
		
		Card c2 = null;
		//a.withDraw(c2, 50);	//TEST : trying to access instance method through null reference
		//a.withDraw(c2, 200);	//TEST : null reference, larger amt
		}catch(Exception e) {
			System.out.println("something bad happened!");
			e.printStackTrace();
		}
		
		System.out.println("main ends");

	}

}
