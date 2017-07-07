package com.cubic.training.ThreadingEx;

public class Deadlock {

	final String resource1="Riya";
	final String resource2="pandey";
	
	public static void main(String[] args) {
		Deadlock d=new Deadlock();
		Recruiter1 t1=new Recruiter1(d);
		Recruiter2 t2=new Recruiter2(d);
		t1.start();
		t2.start();
	}
}
class Recruiter1 extends Thread{
	Deadlock d;
	Recruiter1(Deadlock d){
		this.d=d;
	}
	public void run(){
		synchronized(d.resource1){
			System.out.println("Resource 1 locked"+d.resource1+"for marketing");
		}
		synchronized(d.resource2){
			System.out.println("Resource 2 locked"+d.resource2+"for marketing");
		}
	}
}
class Recruiter2 extends Thread{
	Deadlock d;
	Recruiter2(Deadlock d){
		this.d=d;
	}
	
	public void run(){
		
		
		
			synchronized(d.resource2){
				System.out.println("Resource 2 locked"+d.resource2+"for marketing");
			}
			synchronized(d.resource1){
				System.out.println("Resource 1 locked"+d.resource1+"for marketing");
			}
		}
	}
