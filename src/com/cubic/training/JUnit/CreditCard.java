package com.cubic.training.JUnit;

public class CreditCard {
     int rewards;
     
     
       public int getCashReward(int r){
    	   if(r>20){
    		   return r;
    		   
    	   }
    	   else{
    		   return r+1;
    	   }
       }


	
}
