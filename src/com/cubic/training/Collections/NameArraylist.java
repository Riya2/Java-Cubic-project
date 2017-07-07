package com.cubic.training.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class NameArraylist {
public static void main(String[] args) {
	ArrayList<String> Al=new ArrayList<String>();
	Scanner user=new Scanner(System.in);
     
	
	while(true){
		
	System.out.println("Enter any name:");
	
	String na = user.next();
	if( na.equalsIgnoreCase("N")){
		
		for(String s:Al){
		
		System.out.println(s);
		}
		
		break;
	}
	else{
		for(String s:Al)
		{
			if(user.equals(Al)){
				System.out.println("matched");
				
			}
		}
		Al.add(na);
		
			
		
		
		
	}
	
	 System.out.println("Type another name: (To exit press N)");
	String name = user.next();
	if(name.equalsIgnoreCase("N")){
		
		 for(String s:Al){
		    System.out.println(s);
		      }
		
		break;
	}
	else{
		Al.add(name);
	}
	//if(Al.contains(name)){
	//	System.out.println("Name"+ name +"already present. Enter an unique name");
		
	//}
	
	
	
    }
}
}
