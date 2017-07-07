package com.cubic.training.AssignmentThirdWeek;

public abstract class RetailItem 
{
   String name;
   public RetailItem(String name){
	 this.name=name;
	 
 }
 public final String getName(){
	 return name;
 }
 public abstract int getCost();
}
