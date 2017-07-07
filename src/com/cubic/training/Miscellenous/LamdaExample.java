package com.cubic.training.Miscellenous;

public class LamdaExample implements FunctionalInterface {

	public static void main(String[] args) {
		System.out.println("anonymous class");
		FunctionalInterface f=new FunctionalInterface(){

			@Override
			public void print() {
				System.out.println("printing....");
				
			}
			
		};
		f.print();
        System.out.println("using lamda Expression....");
	}

	FunctionalInterface f1=()->{
		System.out.println("Printing");
	};

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	
	//f1.print();

	

}
