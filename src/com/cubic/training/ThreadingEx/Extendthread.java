package com.cubic.training.ThreadingEx;

public class Extendthread extends Thread{
	public void run(){
     System.out.println("This is thread with extending the Thread class");
		        }

	public static void main(String[] args) {
		Extendthread E=new Extendthread();
		E.start();
      
	}
}
       
    