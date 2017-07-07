package com.cubic.training.variables;

public class Student1 {
 int id;
 String name;
 int score ;
 String grade;
  Student1(int Id,String Name,int Score){
	  id=Id;
	  name=Name;
	  score=Score;
	  if(score>50 && score<60){
		  this.grade = "A";
		  
	  }
	  else if(score>60 && score<70){
		  this.grade = "B";
	  }
	  else
	  {
		  this.grade = "C";
	  }
	  
	  
	  
  }
  void display()
  {
	  System.out.println("name is:" + name);
	  System.out.println("id is:" + id);
	  System.out.println("score is:" + score);
	  System.out.println("grade is:" + grade);
  }
 
 
	public static void main(String[] args) {
	Student1 stud1=new Student1(01,"krishna",56);
	Student1 stud2=new Student1(03,"giya",80);
     stud1.display();
     stud2.display();
	}

}
