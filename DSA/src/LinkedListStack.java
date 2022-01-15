
class Node{
	Object data;
	Node next;
	public Node(Object d) {
		data = d;
	}
}


public class LinkedListStack {
	Node first;
	Node last;
	public LinkedListStack() {
		
	}
	public void push(Object ele) {
		Node n = new Node(ele);
		if(first == last && last == null) {
			first = last = n;
		}
		else {
			last.next = n;
			last = n;
		}
	}
	public Object pop() {
		Node temp = first;
		while(temp.next != last) {
			temp = temp.next;
		}
		last = temp;
		Object d = last.data;
		last.next = null;
		return d;
	}
}
