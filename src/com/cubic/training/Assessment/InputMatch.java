package com.cubic.training.Assessment;
import java.util.Scanner;



public class InputMatch {
	
	public static void main(String[] args) {
		
	
	Scanner user=new Scanner(System.in);
	System.out.println("Enter any 5 strings.");
	String S=user.nextLine();
	String a[]= S.split("\\s",0);
	System.out.println("Again enter string");
	String s2=user.nextLine();
	for(String w:a){  
		  if(w.equalsIgnoreCase(s2))
		  {
			  System.out.println("The word matched");
		  }
		  
		  
		} 
	System.out.println("The word doesnot matched");
	
	
	
	//System.out.println("again enter the word");
	//String s2=user.nextLine();
    
	
	
	
	
	}
}
