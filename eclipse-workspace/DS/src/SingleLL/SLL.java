package SingleLL;

public class SLL {
	NodeLL head= null;
	
	void insert(int data){
		NodeLL node = new NodeLL(data);
		
		if(head==null) {
			head = node;
		}
		else {
			NodeLL point = head;
			while(point.next!=null) {
				point = point.next;
			}			
			point.next= node;
		}
	}
	
	void print() {
		NodeLL point = head;
		while(point!=null) {
			System.out.println(point.data);
			point= point.next;
		}
	}
	
	void insert(int i,int  data) {
		NodeLL n= new NodeLL(data);
		NodeLL point = head;
		
		if(i==0) {
			n.next= head;
			head = n;
		}else {
		 //try {
		while(point!=null&&i>1) {
			i--;
			point= point.next;
		}
		n.next = point.next;
		point.next = n;}
	}
		//} catch (Exception e){System.out.println("chutiye"+e);
	
	void remove() {
		NodeLL p1 = head;
		//NodeLL p2= p1;
		while(p1.next.next!=null) {
			p1 = p1.next;
		}			
		p1.next= null;
	}
	
	void remove(int i) {
		NodeLL point = head;
				
		while(point!=null&&i>1) {
			i--;
			point= point.next;
		}
		point.next = point.next.next;
	}
}


//	
//	
//	
//	
//	
//	remove(int i)
//
//}
