package DLinkedList;

class DLL<k> {
	Node<k> head;
	Node<k> tail;
	
public void append(k d) {
		Node<k> n = new Node<k>(d);
		
		if(head==null) {
			head = n;
			tail= n;
		}
		else {
		Node<k> point = head;
		while(point.next!=null) {
			point = point.next;
			}
		point.next = n;
		n.prev = point;
		tail = n;
		}
	}

void print() {
	Node<k> point = head;
	while(point!=null ) {
		System.out.println(point.data);
		point = point.next;
				}	
}

void rprint() {
	Node<k> point = tail;
	while(point!=null) {
		System.out.println(point.data);
		point = point.prev;
	}
}

void append (int i, k d) {
	Node<k> n = new Node<k>(d);
	
	if(i==0) {
		n.next = head;
		head = n;
		n.next.prev = n;
	}
	else 
	try {
		Node<k> point = head;
		while(point.next!=null&&--i>0) {
			point = point.next;
			}
		n.prev = point;
		n.next = point.next;
		point.next= n;
		n.next.prev= n;
	}catch (Exception e) {
		tail = n;
	}
	
}

}
