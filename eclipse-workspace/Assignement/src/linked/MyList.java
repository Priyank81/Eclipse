package linked;

public class MyList {
	public Node head;
	
	class Node{
	int data;
	Node next;
		
	public Node(int d) {
		data=d;
		next=null;
	}
	}
	
	
	
	public void add(int d) {
		New new_node = node Node();
		if (head==null) {
			head= new_node;
		}
		else {
			Node last = head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next= new_node;
		}
		
	}
	public void insertNode(int pos, int val) {
		
	}
	public void deleteNode(int val) {
		
	}
	public void display() {
		
	}

	

}



