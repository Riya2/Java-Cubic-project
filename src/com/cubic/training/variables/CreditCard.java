package com.cubic.training.variables;

public class CreditCard {
	String name;
	double creditlimit;
	double CreditAvailable;
	int currentBalance;
	
	public CreditCard(String name, double creditlimit, double creditAvailable,
			int currentBalance) {
		super();
		this.name = name;
		this.creditlimit = creditlimit;
		CreditAvailable = creditAvailable;
		this.currentBalance = currentBalance;
	}
	void charge(double amt){
		double x=CreditAvailable-amt;
		System.out.println("Credit available after tax is:"+x);
		
	}
	void MakePayment(double amnt){
		double y= amnt+CreditAvailable;
		System.out.println("Payment of is success " + amnt);
		System.out.println("and CreditAvailable is" + y);
	}

}
 class ClassicCard extends CreditCard{

	public ClassicCard(String name, double creditlimit, double creditAvailable,
			int currentBalance) {
		super(name, creditlimit, creditAvailable, currentBalance);
		// TODO Auto-generated constructor stub
	
	    
		
			//System.out.println(" " + name);
			System.out.println("Your credit limit for this account is : " + creditlimit);
			System.out.println("Total credit avilable is:" + CreditAvailable);
			System.out.println("Current Balance is:" + currentBalance);
		}
		
	 
 }

 class CashRewardsCard extends CreditCard{
	 
	 
	 static int Rewards;
	 
	 public CashRewardsCard(String name, double creditlimit,
			double creditAvailable, int currentBalance, int rewards) {
		super(name, creditlimit, creditAvailable, currentBalance);

	}
	
	 
	 int redeemedNow(int r){
		 
		 if(r>50){
        	return r;
        }
        else{
        	System.out.println("You can not redeem the points now");
        }
		 return r;
		 
		
		
	   }
	 void charge(double amnt){
		 double y=CreditAvailable-amnt;
		 Rewards=Rewards+10;
		 System.out.println("Credit available after deduction is"+ y); 
		 System.out.println("The total rewards available is"+ Rewards);
		 
 }
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 