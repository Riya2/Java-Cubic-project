package com.cubic.training.variables;

public class Employee {

	int id;
	String name;
	Double salary;
	Double bonus;
	static String CompanyName;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	 Employee(int id,String name,Double salary){
		this(id,name);
		this.salary=salary;
	}
	 Employee(int id,String name,Double salary,Double bonus){
		 this(id,name,salary);
		 this.bonus=bonus;
		 
	 }
	 
	 
	 void Display(){
		 System.out.println("The id of the employee is:" + id);
		 System.out.println("The name of the employee is:" + name);
		 System.out.println("The salary of the employee is:" + salary);
		 System.out.println("The bonus of the employee is:" + bonus);
		 System.out.println("The company name of the employee is:" + CompanyName);
		 
		 
	 }
	 
		 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp= new Employee(1,"Riya");
        Employee emp1=new Employee(2,"giya",10000.0);
        Employee emp2=new Employee(3,"rina",40000.0,876.0);
        CompanyName="cubic";
        emp.Display();
        emp1.Display();
        emp2.Display();
        
        
	}

}
