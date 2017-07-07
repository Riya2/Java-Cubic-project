package com.cubic.training.ThreadingEx;

public class ThreadEx extends Thread{
	
	
	public void run(){
		try {
			Thread.sleep(1000); //block state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is running");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}// terminated state
	
	  public static void main(String[] args) {
		ThreadEx td=new ThreadEx(); 
		ThreadEx td1=new ThreadEx();/// new state of thread
		td.start(); 
		td1.start();//Runnable state
		System.out.println("last of  the line");
	}
	

}
