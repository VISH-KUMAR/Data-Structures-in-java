package Threads;

public class Thread1 extends Thread{
	public void run()
	{
		System.out.println("child thread started");
		for(int i =0;i<5;i++) {
			System.out.println("child no"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("child thread stopped");
	}
}

