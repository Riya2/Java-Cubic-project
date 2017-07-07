package com.cubic.training.ThreadingEx;

public class MultithreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		Even e= new Even();
		Odd o=new Odd();
		e.setPriority(Thread.MAX_PRIORITY);
		o.setPriority(Thread.MIN_PRIORITY);
		o.start();
		e.start();
		e.join();// wait for thread to complete
		
		
		
		System.out.println("rest of the code");
	}

}
class Even extends Thread{
	public void run(){
		for(int i=0; i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class Odd extends Thread{
	public void run(){
		try {
			Thread.sleep(1000);// without using sleep method we can ue join method
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<10;i++)
		{
			if(i%2==0)
			{
			
			}
			else{
				System.out.println(i);
			}
		}
	}
}