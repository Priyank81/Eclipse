package Queue;

public class Runn {

	public static void main(String[] args) {
		
		Queue q1  = new Queue();
		
		q1.enQ(4);
		q1.enQ(55);
		q1.enQ(6);
		q1.show();
		q1.enQ(5);
		q1.enQ(77);
		q1.enQ(54);
		q1.enQ(9);
		q1.enQ(35);
		q1.show();
		
		System.out.println(q1.deQ());
		System.out.println(q1.front());
		System.out.println(q1.front());
		System.out.println(q1.size);

		//System.out.println(q1.deQ());
		

	}

}
