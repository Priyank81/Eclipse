package factorial;
import java.util.*;

public class Factorial {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter number between 5 to 50");
	int num= scan.nextInt();
	long f=1;
	
	for(int i =1; i<=num ; i++) {
		f= f * i;
		}
	System.out.println("fact is"+f);
	}

}
