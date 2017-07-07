package com.cubic.training.Interface;

public class Cashrewards implements IcreditCard {

	int rewards;
	String name;
	double creditlimit;
	double CreditAvailable;
	int currentBalance;
	
	
	public Cashrewards(String name, double creditlimit, double creditAvailable,
			int currentBalance,int rewards) {
		
		this.name = name;
		this.creditlimit = creditlimit;
		CreditAvailable = creditAvailable;
		this.currentBalance = currentBalance;
		this.rewards=rewards;
	}

    int redeemedNow(int r){
		 
		 if(r>2){
        
        	System.out.println("You are redeemed and your rewards is :"+r);
        	r++;
        }
        else{
        	System.out.println("You can not redeem the points now");
        	r++;
        }
		 return r++;
    }

	@Override
	public void charge(double amt) {
		
	
			 double y=CreditAvailable-amt;
			 rewards=rewards+10;
			 System.out.println("Credit available after deduction is"+ y); 
			 System.out.println("The total rewards available is"+ rewards);
			 
	 
	}

	@Override
	public void makePayment(double amnt) {
		// TODO Auto-generated method stub
		double y= amnt+CreditAvailable;
		System.out.println("Payment of is success " + amnt);
		System.out.println("and CreditAvailable is" + y);
	}

	

	
		 
	

}
