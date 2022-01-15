
class Node1{
	int data;
	Node1 next;
}


public class LinkedList {
	
	Node1 top;
	
	public void push(int data) {
		Node1 n = new Node1();
		n.data = data;
		top = n;
	}
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	public boolean isEmpty() {
		return (top == null);
	}
}
