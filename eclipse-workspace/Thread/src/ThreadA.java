//thread wait() method - inter thread communication
public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		
		b.start();
				
		//Thread.sleep(0,1); this is temp fix 
		//b.join(); joining main  thread to b, so main waits for b to complete
		
		b.wait();
		System.out.println(b.total);
	}

}
