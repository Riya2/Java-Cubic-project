package com.cubic.training.InnerclassInputout;

public class Anonymousclass {
 

	public static void main(String[] args) {
		Another a= new Another(){
			void display(){
				System.out.println("Anonymous");
			}
			
		};
		a.display();
		
	}

}
class Another{
	void display(){
		 System.out.println("I am parent");
	 }
}