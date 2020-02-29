
public class ThreadB1 extends Thread{
		int total=0;
		public void run()
		{
			synchronized(this)
			{
				System.out.println("child starts");
			for(int i=1; i<=100; i++) {
				total= total+i;
				}
			System.out.println(total+" notify");
			this.notify();
	
		}

	}


}
