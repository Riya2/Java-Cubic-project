package com.cubic.training.Checktheuserinput;
import java.util.Scanner;


public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner(System.in);
		String a[]=new String[10];
		int num=a.length;
		System.out.println("Enter any name:");
		String s=user.nextLine();
		for(int i=0; i<num;i++)
		{
			while(user.hasNextInt())
			{
				user.next();
				System.out.println("bad input. please input string");
			}
			a[i]=user.next();
		     
		
		}
	}
	

}
