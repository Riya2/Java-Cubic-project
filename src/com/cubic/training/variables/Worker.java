package com.cubic.training.variables;


public class Worker extends Person {
	
	double salary;
	int startdate;
	String insurance;
	
	Worker(String Name,double Salary,int Stardate, String Insurance){
		super();
		salary=Salary;
		startdate=Stardate;
		insurance=Insurance;
		
	}
	void display(){
		System.out.println("Name of the person:" + name);
		System.out.println("salary of the person:" + salary);
		System.out.println("Startdate of the person:"+ startdate);
		System.out.println("Insurance of the person:" + insurance);
	}

	public static void main(String[] args) {
	Worker w=new Worker("ggg",1999.0,01,"apollo");
	w.display();

	}

}
