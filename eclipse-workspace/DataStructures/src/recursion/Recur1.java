package recursion;

public class Recur1 {

	public static double factorial(double n) {
		
		if(n==0) return 1;
		
		else return n*factorial(n-1);
			
	}
	public static void main(String[] args) {
		//System.out.println(factorial(6));
		System.out.println(factorial(16));
		System.out.println(factorial(10));
		System.out.println(factorial(22));
		System.out.println(factorial(7));
		
	}
}
