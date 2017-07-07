package com.cubic.training.ThreadingEx;

public class EvenOdd {
	public static void main(String[] args)   {
		
	
   Even1 e=new Even1();
   Odd1 o=new Odd1();
   
   e.start();
   
   
   
   o.start();
   
	}
}



class Even1 extends Thread{
	
	public void run(){
		for(int i=0; i<20;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2==0)
			System.out.println("" +i);
		}
		}
	}



class Odd1 extends Thread{
	public void run(){
		for(int i=0; i<20;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2!=0)
			System.out.println("\t"+i);
		}
		}
	

	
}