package com.cubic.training.AssignmentThirdWeek;

public class IceCream extends RetailItem{
 int Icost=2;
 int num;
	public IceCream(String name,int n) {
		super(name);
		//Icost=cost;
		num=n;
		
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int m= Icost*num;
	
		System.out.println("The total cost of ice cream you brought is :  $"+ m);
		return m;
	}

}

class Sundae extends IceCream{
    int ToppingCost=1;
	public Sundae(String name,int n) {
		super(name,n);
		
		
	}
	public int getCost() {
		int t=ToppingCost+(Icost*num);
		System.out.println("Total cost of sundae with topping is :"+  t);
		return t;
	}
	
}