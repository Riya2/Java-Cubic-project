package com.cubic.training.Interface;

import java.util.Scanner;



public class PersonInterface {
	void Transact(int amnt, IcreditCard cardtype){
		// how can it returns the other class function.
		cardtype.charge(amnt);
		
	}

	public static void main(String[] args)
	{
		while (true) {
			// TODO Auto-generated method stub
			Scanner user = new Scanner(System.in);
			System.out.println("Press  1 for CashRewardsCard and 2 for Classiccard");
			String i = user.nextLine();
			if (i.equals("1")) {
				System.out.println("WELCOME TO"+"CASH REWARD");
				System.out.println();
				System.out.println("Enter the amounnt to be deducted:");
				String l = user.next();
				if(Integer.parseInt(l)<0){
					try {
						throw new InvalidAmount();
					} catch (InvalidAmount e) {
						// TODO Auto-generated catch block
						e.displayException();
						continue;
					}
				}
				PersonInterface p = new PersonInterface();
				IcreditCard Crc = new Cashrewards("Mastercard", 2000, 1900,500,10);

				p.Transact(Integer.parseInt(l), Crc);
				System.out.println("Do you want a rewards?"+""+"(Y/N)");
				String n=user.next();
				int p1=Integer.parseInt(n);
				System.out.println("Enter redeem amount");
				int n1 = user.nextInt();
				if(p1==1){
					Cashrewards c=new Cashrewards("visa",2000,1000,10,10);
					c.redeemedNow(n1);
				}
				else{
					System.out.println("Continue......");
				}
				
			} else   {
				System.out.println("You are in the Classic card");
				PersonInterface p1 = new PersonInterface();
			}
				
			} 
		}
}
	

