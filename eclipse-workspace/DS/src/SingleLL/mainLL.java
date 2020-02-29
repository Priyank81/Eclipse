package SingleLL;

public class mainLL {
	
	public static void main(String[] args) {
		
		SLL L1 = new SLL();
		
		L1.insert(12);
		L1.insert(2);
		L1.insert(14);
		L1.insert(7);
		L1.insert(18);
		L1.insert(9);
		//L1.print();
		//L1.remove();
		
		L1.insert(0, 22);
		
		//L1.remove(0);
		
		L1.print();
			
	}

}
