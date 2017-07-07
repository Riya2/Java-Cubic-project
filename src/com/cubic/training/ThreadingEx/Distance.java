package com.cubic.training.ThreadingEx;
import java.util.Scanner;


public class Distance {
	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		String s;
		do{
		System.out.println("Enter the distance");
		
		float d=user.nextFloat();
		
		NextThread nt=new NextThread(d);
		nt.start();
		
		try {
			nt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("You wanna continue or close?"+ "Y/N");
	     s=user.next();
		}while(s.equalsIgnoreCase("yes"));
		System.out.println("Program Ended");
		
	
		
	
	}
}


  class NextThread extends Thread{
	  float f1;
	  NextThread(float d){
		  f1=d/100;
		  
	  }
	  public void run(){
		  System.out.println("The distance in meter is :"+ f1);
	 }
  }

