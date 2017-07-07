package com.cubic.training.Exception;
import java.util.Scanner;




public class UserExceptionChecking {

	
	
	public static void main(String[] args) {
		
	
	Scanner user=new Scanner(System.in);
	System.out.println("Choose the exception you want to handle");
	String i=user.nextLine();
	if(i.equalsIgnoreCase("Arithmetic"))
	{
		try{
		int a=10;
		int b=0;
		int c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception being handled");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bound");
		}
		System.out.println("The code is last line");
	}
	else{
		if(i.equalsIgnoreCase("Others"))
		{
			try{
			int a[]={9,7,5,3,2};
			a[0]=a[6]/5;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("array out of bound");
			}
			
		}
		System.out.println("two exception are handled on the basic of user input");
	}
	}
}
