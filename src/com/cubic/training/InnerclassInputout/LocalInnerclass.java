package com.cubic.training.InnerclassInputout;

public class LocalInnerclass {
	
   void display(){
	class Local{
		void display(){
			System.out.println("From local class");
		}
	}
	Local l=new Local();
	l.display();
}
public static void main(String[] args) {
	LocalInnerclass lc=new LocalInnerclass();
	lc.display();
}
}
