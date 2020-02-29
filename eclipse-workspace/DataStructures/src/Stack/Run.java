package Stack;

public class Run {

	public static void main(String[] args) {
		
		Stack s1= new Stack();
		
		s1.push(16);
		s1.push(2);
		s1.push(3);
		s1.show();
		s1.push(15);
		s1.push(2);
		s1.push(3);
		s1.push(15);
		
		
		System.out.println("\n"+s1.pop());
		
		for(int i: s1.stack) {
			System.out.print(i+"  ");}
	}


}
