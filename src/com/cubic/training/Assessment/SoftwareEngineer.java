package com.cubic.training.Assessment;

public class SoftwareEngineer extends Employee {
	int Bonus;
	public SoftwareEngineer(int id, String name, double salary,int bonus) {
		super(id, name, salary);
	    Bonus=bonus; 
	    
	   System.out.println("The id of employee is :"+id);
	    System.out.println("The name of employee is :"+name);
	    System.out.println("The salary of employee is :"+salary);
	    System.out.println("The bonus of employee is :"+bonus);
	    
	}
	public static void main(String[] args) {
		SoftwareEngineer Se=new SoftwareEngineer(01,"Riya",10000,1500);
		
	}
	  
  }


