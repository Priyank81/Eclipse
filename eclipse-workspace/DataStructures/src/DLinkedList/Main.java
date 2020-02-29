package DLinkedList;

public class Main {

	public static void main(String[] args) {
		
		DLL<Integer> dl1= new DLL<Integer>();
		
		dl1.append(3);
		dl1.append(4);
		dl1.append(3);
		dl1.append(4);
		dl1.append(100,72);
//		dl1.append(8);
//		

		//dl1.print();
		dl1.rprint();
	}

}
