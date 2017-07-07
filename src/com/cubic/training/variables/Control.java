
package com.cubic.training.variables;
import java.util.Scanner;
public class Control {
	

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		String name;
		System.out.println("please enter your name");
	    name=user.next();
	    
		int age=0;
		System.out.println("Please enter your age");
		age=user.nextInt();
	
		if(age<16){
			System.out.println("You are not allowed to drive at the moment ");
			System.out.println("You are not allowed to vote at the moment ");
			System.out.println("You are not allowed to rent a car at the moment ");
		}
		else if(age<18){
			System.out.println("You are not allowed to vote at the moment ");
		}
		else if(age<25){
			System.out.println("You are not allowed to rent a car at the moment ");
		}
		else{
			System.out.println("You can do anything that is legal ");
		}

	}

}
