package com.cubic.training.Miscellenous;

public class AssertDemo {
	public static void main(String[] args) {
		for(int i=0;i<9;i++){
			System.out.println(i);
			assert i<10;
		}
	}

}
