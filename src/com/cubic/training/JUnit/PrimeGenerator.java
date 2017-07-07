package com.cubic.training.JUnit;

public class PrimeGenerator {

	public boolean GetPrimeNumbers(int p)
	{
		for(int j=2;j<p;j++){
			if((p!=2) && (p%j==0)){
				return false;
			}
		}
		return true;
    	  
    	  
      
	
	
	}
}
