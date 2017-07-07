package com.cubic.training.variables;

public class Address {
String cityName;
String Streetname;
String state;
int zipcode;
public Address(String cityName, String streetname, String state, int zipcode) {
	super();
	this.cityName = cityName;
	Streetname = streetname;
	this.state = state;
	this.zipcode = zipcode;
	
}

public String getDetails() {
	// TODO Auto-generated method stub
	return cityName + "   " + Streetname +"  "+state +"  "+ zipcode;

	
	
}

}
  class Employer{
	String Name;
	int yearEstablished;
	double revenue;
	Address address;
	public Employer(String name, int yearEstablished, double revenue,
			Address address) {
		super();
		Name = name;
		this.yearEstablished = yearEstablished;
		this.revenue = revenue;
		this.address = address;
	}
	void display(){
		 System.out.println("the employer name is :" + Name);
		 System.out.println("the established on is :" + yearEstablished);
		 System.out.println("the reenue is :" + revenue);
		 System.out.println("the address is of:" + address.getDetails());

		

	 }
	public String getDetails() {
		// TODO Auto-generated method stub
		return Name+ " "+ yearEstablished +"  " + revenue +"  " +address.getDetails();

		
		
	}

	
	
 }
  class Employee1{
	  String name;
	  double salary;
	  Employer employee;
	  Address addr;
	public Employee1(String name, double salary, Employer employee, Address addr) {
		super();
		this.name = name;
		this.salary = salary;
		this.employee = employee;
		this.addr = addr;
	}
	void display(){
		 System.out.println("The employee name is :" + name);
		 System.out.println("Salary is :" + salary);
		 System.out.println("The employer details:" + employee.getDetails());
		// System.out.println("the address  is :" + addr.getDetails());

		

	 }
	  
  }
  
  
