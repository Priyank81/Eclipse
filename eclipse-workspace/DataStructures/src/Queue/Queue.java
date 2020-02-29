package Queue;

public class Queue {
	int q[]= new int[5];
	int rear, size, front;
	
	public void enQ(int d) {
		if(rear==(q.length-1)) {
			expand();
		}
		
		q[rear]= d;
		rear++;
		size++; 
	}
	
	public int deQ() {
		if(size==0) {
			System.out.println("empty queue");
			return 0;
		}
		
		front++;
		size--;
		return q[front-1];
	}
	
	public int front() {
		return q[front];
	}
	
	public void show() {
		
		for(int i: q) {
			System.out.print(i+"  ");}
	System.out.println(" ");}
	
	private void expand() {
		int NewQ[] = new int[rear*2];
		System.arraycopy(q, 0, NewQ, 0, rear);
		q = NewQ;
		}
	
}
