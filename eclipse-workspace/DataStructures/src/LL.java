
public class LL {
	
	Node head;
	
	public void insert(int d) {
		
		Node n = new Node(d);
		//n.data = d;
		//n.next = null;

		if(head==null) {
			head = n;
		}
		else {
			
		Node point = head;
		
		while(point.next!=null) {
			point = point.next;
			}
		point.next = n;
		}

	}
	
	public void insert(int d, int i) {
		Node n = new Node (d);
		//n.data =d;
		//n.next = null;
		
		if(head==null|| i==0) {
			n.next = head;
			head = n;
		}
		else {
			Node point= head;
			//Node temp = null;
		
		while(point.next!=null && --i!=0) {
			point = point.next;
			//--i;
			} 
		n.next =point.next;
		point.next = n;
		
		}
		
	}
	
	public void delete (int i) {
		Node p = head;
		if(head==null) {
			System.out.println("node not found");
			}
		else
		if(i==0) {
			head = head.next;
			return;
		}
			
			try {
			while(--i!=0){
			p = p.next;
		} p.next= p.next.next;
			}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception");
		}
	}
	
	public void print() {
	Node start= head;
	while (start.next!=null) {
			System.out.println(start.data);
			start = start.next;
		}
			System.out.println(start.data);
		
	}
	
	/*public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode(int x) { val = x; }
		 * }
		 */
		//code for removing nth node from tail
		    public void removeNode( int n) {
		        
		        Node point= head;
		        Node prev= point;
		        int count=1;
		        
		        while(point.next!=null){
		            count++;
		            prev= point;
		            point=point.next;
		        }
		        //System.out.println(count);
//		        if(count == n){
//		            head= head.next;
//		            return ;
//		        }
		        point=head;
		        for(int i=0; i<=(count-n); i++){
		            point=point.next;
		        }
		        
		        if(head.next==null&&n==1){
		        	System.out.println("null");
		            return;
		        }
		       
		        Node t= point.next;
		        point.next = t.next;
		        return ;
		    }
		}
	

