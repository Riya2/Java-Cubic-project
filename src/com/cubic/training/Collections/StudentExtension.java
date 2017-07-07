package com.cubic.training.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;





public class StudentExtension 
{
	public static void main(String[] args) {
		
	
	ArrayList<Student1> SA=new ArrayList<>();
	Scanner user=new Scanner(System.in);
	int i=0;
	
	while(i<3){
	System.out.println("Enter your id");
	 int id = user.nextInt();
	 
	System.out.println("Type your name");
	String name = user.next();
	System.out.println();
	
	System.out.println("Enter your score");
	System.out.println();
	int score = user.nextInt();
	
	Student1 st = new Student1(id,name,score);
	//Student1 st1=new Student1(id,name,score);
	SA.add(st);
	i++;
	}
	//SA.add(st1);
	System.out.println("Do you want to sort students?(Yes/No)");
	String su=user.next();
	if(su.equalsIgnoreCase("Yes"))
	{
		System.out.println("Choose the sorting options below:");
		System.out.println("  1) Id  "  +   "2) Score");
		int a=user.nextInt();
		if(a==1)
		{
			//Collections.sort(SA);
			Collections.sort(SA,new IdComparator());
			System.out.println("Below are the Student Details");
			for(Student1 s:SA)
			{
				System.out.println(s);
			}
		}
		else if(a==2)
		{
			Collections.sort(SA,new ScoreComparator());
			System.out.println("Below are the Student Details");
			for(Student1 s:SA)
			{
				System.out.println(s);
			}
		}
	}
	else
	{
		//Collections.sort(SA);
		for(Student1 s:SA)
		{
			System.out.println(s);
		}
	}
	
	
	}
	
}




class Student1 implements Comparable<Student1>{
	int id;
	String name;
	int score;
	String grade;
	public Student1(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		
			if(score>=90 && score<=100)
			{
				this.grade="A+";
				System.out.println("Your grade is: A");
				
			}
			else if(score>=80 && score<90)
			{
				this.grade="B+";
				System.out.println("Your grade is: B");
			}
			else if(score>=70 && score<80)
			{
				this.grade="B-";
				
				System.out.println("Your grade is: B-");
			
			}
			else{
                 this.grade="C";
				
				System.out.println("Your grade is: Fail");
			
			}
		}
		
		@Override
	public String toString() {
			
		return " " + id  + ", " + name + ", " + score
				+ ", " + grade +"";
	}

		@Override
		public int compareTo(Student1 o) {
			if(id>o.id)
			{
				return 1;
				
			}
			else if(id<o.id){
				return -1;
			}
			else{
				return 0;
				
			}
			
		}
		
		
		
	}
class IdComparator implements Comparator<Student1>{
	


@Override
public int compare(Student1 o1, Student1 o2) {
	if(o1.id>o2.id)
	{
		return 1;
		
	}
	else if(o1.id<o2.id){
		return -1;
	}
	else
	{
		return 0;
		
	}
	
   }
}

class ScoreComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.score>o2.score)
		{
			return 1;
			
		}
		else if(o1.score<o2.score){
			return -1;
		}
		else{
			return 0;
			
		}
		
	   }
	

	
}










	












