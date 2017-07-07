package com.cubic.training.Assessment;
import java.util.Scanner;
public class PatternDisplay {
	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		System.out.println("Either enter 5 or 3..");
		int n=user.nextInt();
		if(n==5)
		{
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			
			}
			
			
		
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			
			}
			
		}
		else{
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			
			}
			
			
		
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			
			}
			
		}
		}
		

    }

