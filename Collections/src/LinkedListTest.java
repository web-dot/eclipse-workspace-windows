import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("dog");
		ll.add("cat");
		ll.add("bear");
		ll.add("cow");
		ll.add(3, "monkey");
		ll.add(3, "donkey");
		
		
		System.out.println(ll);
		System.out.println(ll.get(3));
		ll.set(1, "horse");
		System.out.println(ll);
		ll.remove(3);
		ll.remove(4);
		System.out.println(ll.remove(3));
		System.out.println(ll.indexOf("monkey"));
		System.out.println(ll);
	}

}
