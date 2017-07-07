package com.cubic.training.ThreadingEx;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		
	}
     public static void main(String[] args) {
		RunnableDemo rd=new RunnableDemo();
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t1.setName("for loop thread");
		Thread.currentThread().setName("main method threads");
		System.out.println(Thread.currentThread().getName());// name of main thread
	    System.out.println(t1.getName());
		
	}
}
