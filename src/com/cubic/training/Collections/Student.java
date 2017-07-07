package com.cubic.training.Collections;

public class Student {
	
		int id;
		String name;
		int score;
		String grade;
		public Student(int id, String name, int score) {
			super();
			this.id = id;
			this.name = name;
			this.score = score;
			if(score>=90 && score<=100){
				this.grade="A";
				System.out.println("Your grade is: A");
				
			}
			else if(score>=80 && score<90)
			{
				this.grade="B";
				System.out.println("Your grade is: B");
			}
			else
			{
				this.grade="C";
				
				System.out.println("Your grade is: Fail");
			}
			}
		void display(){
			System.out.println("The id is:"+id);
			System.out.println("The name is:"+name);
			System.out.println("The score is:"+score);
			System.out.println("The grade based on your score is:"+ grade);
			
		}
		//@Override
		//public String toString() {
			//return "AL";
		
		
			
		//}
			
		
		
	}

