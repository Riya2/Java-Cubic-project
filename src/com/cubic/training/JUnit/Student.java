package com.cubic.training.JUnit;
import java.util.Scanner;


class StudentDetail{
int id;
String name;
int score;
String grade;
  

  String getGrade(int score){
	  
	  if(score>=85 && score<100){
		  return "A";
		  
	  }
	  else if(score>=75 && score<85){
		  return "B";
	  }
	  else if(score>=65 && score<75){
		  return "C";
	  }
	  else{
		  return "D";
	  }
  }
}










