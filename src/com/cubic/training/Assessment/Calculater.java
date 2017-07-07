package com.cubic.training.Assessment;
import java.util.Scanner;

public class Calculater {
public static void main(String[] args) {
	Scanner user=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=user.nextInt();
	System.out.println("Enter the value of p");
	int p=user.nextInt();
	if(n<0&&p<0)
	  {
		  try {
			throw new Newexception();
		} catch (Newexception e) {
			// TODO Auto-generated catch block
			e.display();
		}
	  }
	else{
		MyCalculator m=new MyCalculator();
		m.power(n,p);
	}
	
}

  
}

class MyCalculator{
	void power(int n,int p){
		int x=(int) Math.pow(n,p);
		System.out.println("The value of n^p is :"+ x);
	  
	}
}

class Newexception extends Exception{
	void display()
	{
		System.out.println("n and p should be non negative number");
	}
}

