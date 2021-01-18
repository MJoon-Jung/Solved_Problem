package Data_Structure;

public class Linkedlist {
	Node header;
	static class Node{
		int data;
		Node next = null;
	}
	Linkedlist(){
		header = new Node();
	}
	void append(int d) {
	Node end = new Node();
	end.data = d;
	Node n = header;
	while(n.next != null) {
		n = n.next;
	}
	n.next = end;
	}
	void delete(int d) {
		Node n = header;
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			}
			else {
				n = n.next;
			}
		}
	}
	void retrieve() {
		Node n = header.next;
		while(n.next != null) {
			System.out.print(n.data + " คั> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		for(int i = 1; i < 5; i++) {
			ll.append(i);
		}
		ll.retrieve();
		ll.delete(1);
		ll.retrieve();
		ll.delete(3);
		ll.retrieve();
//		Node head = new Node(1);
//		head.append(2);
//		head.append(3);
//		head.append(4);
//		head.append(5);
//		head.retrieve();
//		head.delete(4);
//		head.retrieve();
	}

}
//class Node{
//	int data;
//	Node next = null;
//	
//	Node(int d){
//		this.data = d;
//	}
//	void append(int d) {
//		Node end = new Node(d);
//		Node n = this;
//		while(n.next != null) {
//			n = n.next;
//		}
//		n.next = end;
//	}
//	void delete(int d) {
//		Node n = this;
//		while(n.next != null) {
//			if(n.next.data == d) {
//				n.next = n.next.next;
//			}
//			else {
//				n = n.next;
//			}
//		}
//	}
//	void retrieve() {
//		Node n = this;
//		while(n.next != null) {
//			System.out.print(n.data + " คั> ");
//			n = n.next;
//		}
//		System.out.println(n.data);
//	}
//}