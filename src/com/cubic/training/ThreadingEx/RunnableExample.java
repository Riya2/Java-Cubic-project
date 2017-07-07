package com.cubic.training.ThreadingEx;

public class RunnableExample implements Runnable {
       public void run(){
    	   
    	   System.out.println("The thread implments the runnable class");
    	   
       }
       public static void main(String[] args) {
		RunnableExample Re=new RunnableExample();
		Thread t=new Thread();
		Thread t1=new Thread();
		t.start();
		t1.start();
		System.out.println("The code after exection of thread");
		
	}
}
