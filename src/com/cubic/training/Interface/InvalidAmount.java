package com.cubic.training.Interface;

public class InvalidAmount extends Exception {
	public InvalidAmount(){
		
	}
    void displayException(){
    	System.out.println("Amount is not valid");
    }
}
