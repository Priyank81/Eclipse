package Stack;

public class Stack{
	
	int stack[]= new int[5];
	int top=0;
	
	public void push(int d) {
		if(top==4)
			expand();
		
		stack[top]= d;
		top++;		
	}
	
	public int pop() {
		top--;
		return stack[top];
	}
	
	private void expand() {
		int NewStack[] = new int[top*2];
		System.arraycopy(stack, 0, NewStack, 0, top);
		stack = NewStack;
		}
	
	public void show() {
		for(int i: stack) {
			System.out.print(i+"  ");}
	}
	
}
