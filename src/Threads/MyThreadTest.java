package Threads;

import java.io.IOException;

public class MyThreadTest {
	public static void main(String args[])throws IOException {
		System.out.println("Main thread Started");
		Thread1 t = new Thread1();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("M T = "+i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main thread Stopped");
		
	} 
}
