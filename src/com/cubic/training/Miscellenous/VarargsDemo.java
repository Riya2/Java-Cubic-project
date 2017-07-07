package com.cubic.training.Miscellenous;

public class VarargsDemo {
	  
public static void main(String[] args) {
	display();
	display("someone");
	display("Soe","joe");
   }
public static void display(String... name){
	System.out.println("came to display method");
	for(String s:name){
		System.out.println(s);
	}
}
}
