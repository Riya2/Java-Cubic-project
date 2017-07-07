package com.cubic.training.ThreadingEx;
//import java.util.Scanner;
public class BankAccount {
	int Accou_no;
	double Accoun_Bal;
	BankAccount(double Accoun_Bal){
		this.Accoun_Bal=Accoun_Bal;
		
	}
	
	
	public static void main(String[] args) {
		//Scanner user=new Scanner(System.in);
		BankAccount b = new BankAccount(1000);
		MarkThread Mark=new MarkThread(b);
		ElenaThread Elena =new ElenaThread(b);
		//System.out.println("what you wanna to do? Either withdraw or Deposit");
		//String s=user.next();
		/*if(s.equalsIgnoreCase("Deposit"))
		{
		    System.out.println("Enter  the aamount you wanna deposit..."); 
		    double d=user.nextDouble();
		}*/
		Thread t=new Thread(Mark);
		Thread t1=new Thread(Elena);
		
		t.start();
		t1.start();
		
		
	}
	
	
	
	synchronized  void deposit(double amt){
		if(amt<0){
			System.out.println("you can not not deposit the negative numbers");
		}
		
		else{
			synchronized (this){
		}
		double Account=Accoun_Bal+amt;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Accoun_Bal=Account;
		System.out.println("Your deposit is successful and your balance is:"+Accoun_Bal);
		
		}
	}
	 synchronized void withdraw(double amt) throws InterruptedException{
		 
		if(amt>Accoun_Bal)
		{
			System.out.println("You donot have sufficient amount of money to withdraw");
		 
		}
		
		else{
			double Acc=Accoun_Bal-amt;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Accoun_Bal=Acc;
			System.out.println("Withdrawal is successful and your balance after withdrawal is:"+Accoun_Bal);
		}
		
	}

}
class MarkThread implements Runnable{

	BankAccount ba;
	MarkThread(BankAccount ba) {
		this.ba = ba;
	}
	public void run() {
		ba.deposit(500);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ba.withdraw(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
class ElenaThread implements Runnable{

	BankAccount ba;
	ElenaThread(BankAccount ba) {
		this.ba = ba;
	}
	public void run() {
		ba.deposit(100);
		try {
			ba.withdraw(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}