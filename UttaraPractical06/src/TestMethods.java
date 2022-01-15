
public class TestMethods {

	public static void main(String[] args) {
		
		String str = "abcdef";
		
		
		//check length
		System.out.println("length of str = " + str.length());
		
		System.out.println();
		
		//print characters
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
		
		System.out.println();
		
		//convert to char array and print chars
		char[] arr = str.toCharArray();
		for(char c : arr) {
			System.out.println(c);
		}
		
		System.out.println();
		
		//convert to uppercase
		str = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
		
		System.out.println();
		
		//convert to lowercase
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
		
		//check if strings are equal
		String a1 = "Uttara";
		String a2 = "Uttara";
		
		System.out.println();
		System.out.println(a1.equals(a2));
		
		//check bigger or smaller
		String x1 = "programming";
		String x2 = "coding";
		
		
		System.out.println(x1.length() > x2.length()); //returns true
		
		
		
		//if one string occurs in other
		
		String d1 = "Code";
		String d2 = "HashCode";
		
		System.out.println(d2.contains(d1)); // returns true
		System.out.println(d2.indexOf('C')); //prints 4
		
		
		//2) 
		
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1 == s2); //prints true ->  s1 and s2 point to same object in SCP -> same address
		
		
		String s3 = new String("abc");
		
		System.out.println(s1 == s3); //prints false -> s1 and s3 point to different objects (s3->heap, s1->SCP)
		
		System.out.println(s1.equals(s3)); //prints true as both s1 and s3 have same state as per equals() method of String class
		
		//3
		String s01 = "happynew";
		s01.concat("year");
		System.out.println(s01); //prints "happynew"
		/*
		 * concat() method creates a NEW object with state "happynewyear" and returns the reference , 
		 * but that reference is never assigned to a variable, as s01 is a String object and is immutable
		 * so state of s01 remains CONSTANT.
		 * */
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		System.out.println(sb); // return abc as sb points to a mutable object whose state is altered by append()
		sb.reverse();
		//System.out.println(sb.replace(0, 1, "b"));
		System.out.println(sb); //prints cba, reverse changes the state of sb object which is mutable and returns the reference;
		System.out.println(sb.toString()); //prints cba -> returns a String object with the same state as sb object
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
