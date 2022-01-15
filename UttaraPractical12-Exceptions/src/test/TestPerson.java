package test;
import com.uttara.ex.DanceFailureException;
import com.uttara.ex.Person;


public class TestPerson {

	public static void main(String[] args) {

		//Person p1 = new Person("Siddharth", 124);

		Person p2 = new Person("Subhash", 25);
		try {
		p2.dance("salsa");
		}
		catch(DanceFailureException e) {
			e.printStackTrace();
		}
		
	}

}
