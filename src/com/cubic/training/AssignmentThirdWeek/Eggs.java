package com.cubic.training.AssignmentThirdWeek;

public class Eggs extends RetailItem {
	int number;
	int price=3;
      public Eggs(String name,int number) {
		super(name);
		this.number=number;
		//this.price=price;
	}

	@Override
	public int getCost() {
		int cost=number*price;
		System.out.println("Total cost of "+number+" dozen of eggs is :   $"+cost);
		return  cost;	
	}
	
      
	

	
}
