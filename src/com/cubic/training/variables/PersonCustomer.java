package com.cubic.training.variables;
import java.util.Scanner;




public class PersonCustomer {
	
	void Transact(int amnt, CreditCard cardtype){
		// how can it returns the other class function.
		cardtype.charge(amnt);
		
	}

	public static void main(String[] args) {
		while (true) {
			// TODO Auto-generated method stub
			Scanner user = new Scanner(System.in);
			System.out.println("Press  1 for CashRewardsCard and 2 for Classiccard");
			String i = user.nextLine();
			if (i.equals("1")) {
				System.out.println("You are in the Cash Rewards");
				PersonCustomer p = new PersonCustomer();
				CreditCard Crc = new CashRewardsCard("Mastercard", 2000, 1900,500, 0);

				p.Transact(100, Crc);
				
				// Crc.call();
				//Crc.redeemedNow(10);
				//Crc.charge(100);
				//Crc.MakePayment(0);
			} else if (i.equalsIgnoreCase("2")) {
				System.out.println("You are in the Classic card");
				PersonCustomer p1 = new PersonCustomer();
				ClassicCard c = new ClassicCard("Classic card", 2000, 1900, 100);
				p1.Transact(100, c);
			} else {
				CreditCard c=new CreditCard("Mastercard", 2000.0, 1900.0,500);
				c.charge(10);

			}
		}
 	      
 	     
 	    	 
         
          
          
	}

}
