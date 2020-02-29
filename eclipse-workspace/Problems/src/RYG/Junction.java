package RYG;
import java.util.Scanner;

public class Junction {

	public static void main(String[] args) {
		System.out.println("Welcome to signal. Please select signal to modify");
		System.out.println("Select"+"\nA"+"\tB"+"\tC"+"\tD");
		Scanner scan = new Scanner(System.in);
		char aph = scan.next().charAt(0);
		System.out.println("Enter time required out of 5 min");
		int t= scan.nextInt();
		
		int ta=0,tb=0,tc=0,td=0;
		
		if(aph == 'A') { 
			ta=t;
			tb= (20 - t)/3;
			tc= (20 - t)/3;
			td= (20 - t)/3;}
		else if(aph=='B') {
		tb=t;
		ta= (5 - t)/3;
		tc= (5 - t)/3;
		td= (5 - t)/3;}
		else if(aph=='C') {
		tc=t;
		tb= (5 - t)/3;
		ta= (5 - t)/3;
		td= (5 - t)/3;}
		else if(aph=='D') {
		td=t;
		tb= (5 - t)/3;
		tc= (5 - t)/3;
		ta= (5 - t)/3;}
		
		System.out.println(t+" "+tb+" "+tc+" "+td);
				
		Signal s= new Signal();
		
		MyT a= new MyT(s,"A", ta);
		MyT b= new MyT(s,"B", tb);
		MyT c= new MyT(s,"C", tc);
		MyT d= new MyT(s,"D", td);
				
			a.start();
			b.start();
			c.start();
			d.start();
			
		}

	}

