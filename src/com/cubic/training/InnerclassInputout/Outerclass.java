package com.cubic.training.InnerclassInputout;

public class Outerclass { //Member inner class example
     private double bal=100;// private property is accessible 
	 void display(){
		 System.out.println(" I am Outer  class");
	 }
	 class Inner{
		 void display(){
			 System.out.println(" I am Inner class");
			 System.out.println("the balnce is "+ bal);
		 }
	 }
	 public static void main(String[] args) {
		Outerclass oc=new Outerclass();
		Outerclass.Inner ic=oc.new Inner();
		
		ic.display();
         oc.display();
         
}
}
