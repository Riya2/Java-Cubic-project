package com.cubic.training.variables;

public class Construct {
    int id;
    String name;
    
	Construct(int id, String name){
	this.id=id;
	this.name=name;
	}
	void display()
	{
		System.out.println("The id is:"+ id);
		System.out.println("the name is:"+ name);
	}
	public static void main(String[] args) {
		Construct c= new Construct(10,"riya");
		c.display();

	}

}
