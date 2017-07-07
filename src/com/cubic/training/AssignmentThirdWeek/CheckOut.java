package com.cubic.training.AssignmentThirdWeek;
import java.util.ArrayList;
import java.util.Scanner;




public class CheckOut {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		ArrayList<RetailItem> Ar=new ArrayList<>();
		int Total ;
		
		
		while(true){
		System.out.println("Enter item type:");
		System.out.println("1) Potatoes  2) Eggs  3)Icecream 4)Sundae");
		int n=user.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter the type of potato..");
			System.out.println("1) Sweet  2) Normal");
			int i=user.nextInt();
			if(i==1){
				System.out.println("Enter the weight..");
				int w=user.nextInt();
				Potatoes p1=new Potatoes(" Sweet Potatoes",w);
				Ar.add(p1);
				p1.getCost();
				
			}
			else{
			System.out.println();
			
			System.out.println("Enter the weight..");
			int w=user.nextInt();
			Potatoes p1=new Potatoes(" Normal Potatoes",w);
			Ar.add(p1);
			p1.getCost();
		}
			}
		else if(n==2)
		{
			
			System.out.println("Enter the dozen you wanna buy..");
			int w=user.nextInt();
			Eggs e1=new Eggs("Eggs",w);
			Ar.add(e1);
			e1.getCost();
		}
		else if(n==3)
		{
			
			System.out.println("how many Ice cream you want?.");
			int w=user.nextInt();
			IceCream c1=new IceCream("Ice Cream",w);
			Ar.add(c1);
			c1.getCost();
		}
		else
		{
			System.out.println("How many Sundae you want?..");
			int w=user.nextInt();
			Sundae s1=new Sundae("",w);
			Ar.add(s1);
			s1.getCost();
		}
		
		System.out.println();
		System.out.println("Continue.......(Y/N)");
		
		String g=user.next();
		if(g.equalsIgnoreCase("Y")){
			continue;
		}
		else if(g.equalsIgnoreCase("N"))
		{
			
			
			
			
		}
		else
		{
		break;
		}
		
	}

}
}
