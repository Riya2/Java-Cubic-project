package com.cubic.training.variables;

public class Account {
	String Cust_name;
	int acc_no;
	
	Account(String Cname,int Accou){
		Cust_name=Cname;
		acc_no=Accou;
	}
	 void display()
	  {
		  System.out.println("Customer nameis:"+Cust_name);
		  System.out.println("Account details is:"+acc_no);
	  }
		
		
	}

 class Saving_Acc extends Account{
	 
	int min_bal;
	 int saving_bal;
	 Saving_Acc(String Cname, int Accou,int mini_bal,int Saving_bal) {
			super(Cname, Accou);
			min_bal=mini_bal;
			saving_bal=Saving_bal;
			
		}
	 void callingAccount(){
		 super.display();
	 }
	 void display()
	  {
		  System.out.println("Minimal bal is:"+min_bal);
		  System.out.println("saving bal is:"+saving_bal);
	  }
	 
	 
 }
  class Acct_details extends Saving_Acc
  {
		int deposits;
		int withdrawals;
	  Acct_details(String Cname, int Accou, int mini_bal, int Saving_bal,int depo,int Withdraw) {
		super(Cname, Accou, mini_bal, Saving_bal);
		deposits=depo;
		withdrawals=Withdraw;
		
	  }
	  
	  void callSavings() {
		  super.display();
	  }
	  void display()
	  {
		  System.out.println("Deposit amount is:"+deposits);
		  System.out.println("withdrawal amount is:"+withdrawals);
	  }
		
	}

  
   
  
	  
  
  
  
  
  
  
  
  
  
  
  