
public class ThreadA1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB1 b1 = new ThreadB1();
		b1.start();
		
		synchronized(b1)
		{
			System.out.println("main thread trying to call wait()");
			b1.wait(10000);
		}
		System.out.println(b1.total);

	}

}
