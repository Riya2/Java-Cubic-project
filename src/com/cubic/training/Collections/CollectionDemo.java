package com.cubic.training.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionDemo {
	
	
	public static void main(String[] args)  {
		
		ArrayList<Student> Al=new ArrayList<Student>();
		Scanner user=new Scanner(System.in);
	     
		
		while(true){
			
		System.out.println("Enter your id");
		 int id = user.nextInt();
		 
		System.out.println("Type your name");
		String name = user.next();
		System.out.println();
		
		System.out.println("Enter your score");
		System.out.println();
		int score = user.nextInt();
		
		Student st = new Student(id,name,score);
		Al.add(st);
		
		System.out.println("You wanna continue..Y/N");
		String n= user.next();
		if(n.equalsIgnoreCase("y")){
			continue;
			
		}
		else{
			System.out.println("The program is terminated");
			System.out.println("Your detail is");
			st.display();
			break;
		
		}
		
	}
    }
}