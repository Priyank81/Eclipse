package RYG;

class MyT extends Thread{
	Signal s;
	String sig;
	int t;
	
	MyT(Signal s, String sig, int t){
		this.s=s;
		this.sig=sig;
		this.t=t;
		}
	
	public void run() {
		s.display(sig,t);
	}

}
