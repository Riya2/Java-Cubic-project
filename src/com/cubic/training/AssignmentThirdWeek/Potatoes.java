package com.cubic.training.AssignmentThirdWeek;

public class Potatoes extends RetailItem {
   
	int weight;
	double price=1.50;
	//double sprice=1.75;
	
	public Potatoes(String name,int weight) {
		super(name);
		this.weight=weight;
		//this.price=price;
		
	}

	@Override
	public int getCost() {
		int cost=(int) (weight*price);
		System.out.println(weight  +"lbs of Potatoes costs:  $"    +cost);
		return  cost;	
	}

}
