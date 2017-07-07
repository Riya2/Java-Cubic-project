package com.cubic.training.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Patients> pq=new PriorityQueue<>();
		Patients p=new Patients();
		p.problem="colds";
		pq.add(p);
		p.severity=3;
		Patients p1=new Patients();
		p1.problem="headeache";
		pq.add(p1);
		p.severity=2;
		Patients p2=new Patients();
		p2.problem="brain hamarage";
		pq.add(p2);
		p.severity=1;
		
		
		for(Patients po:pq)
		{
			System.out.println(po);
			System.out.println();
			while(pq.size()>0)
			{
				System.out.println(pq.remove());
			}
		}
		
		/*pq.add("Java");
		pq.add("ppp");
		pq.add(".net");
		pq.add("PHp");
		
		for(String s:pq){
			System.out.println(s);
		}*/
		
	}
	
}

class Patients implements Comparable<Patients>{
	String problem;
	int severity;
	@Override
	public int compareTo(Patients o) {
		// TODO Auto-generated method stub
		if(severity<o.severity)
		{
			return 1;
			
		}
		else if(severity>o.severity)
		{
			return -1;
		}
		else{
			
		}return 0;
	}
	@Override
	public String toString() {
		return "Patients [problem=" + problem + ", severity=" + severity + "]";
	}
	
	
	
}
