package com.cubic.training.variables;

public class CreateEmployee {
	
		  public static void main(String[] args) {
			  Address ad= new Address("Irvving", "dallas","texas",75062);
			  Employer em=new Employer("cubic",2001,6000,ad);
			  Employee1 emp=new Employee1("Riya",15000,em,ad);
			emp.display();
			//emp.display();
			//ad.display();
			//em.display();
		}
}
