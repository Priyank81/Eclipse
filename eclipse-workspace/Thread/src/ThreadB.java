
public class ThreadB extends Thread{
	
	int total=0;
	public void run()
	{
		for(int i=1; i<=100; i++) {
			total= total+i;
			}
		System.out.println(total);
		
		this.notify();
	}

}
