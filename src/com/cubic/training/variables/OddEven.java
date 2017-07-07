package com.cubic.training.variables;

public class OddEven {

	public static void main(String[] args) {
		
	
		for(int i=0;i<=15;i++){
			 for (int j=2; j<=i; j++)
		        {
		            if (i % j == 0) 
		                break;
		            else if (i == j+1)
		                System.out.println("the number is prime" + i);
		        }
			if(i%2==0){
				System.out.println("even" + i);
				
				
				
			}
			else
			{
				
				System.out.println("odd" +i);
				
			}
			
			}
			}
			
			
			
		

	}


