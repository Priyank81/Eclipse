package RYG;

public class Signal {
	public synchronized void read() {
		
	}

	public synchronized void display(String sig, int t) {
		System.out.println("Signal "+sig+" starts");
		System.out.println("runs for"+t+"minutes");
					
		System.out.println("Signal "+sig+" Ends");	
	}

}
