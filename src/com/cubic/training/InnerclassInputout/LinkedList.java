package com.cubic.training.InnerclassInputout;

import java.util.Vector;

public class LinkedList {

	public static void main(String[] args) {
		
	
	Vector<String> v=new Vector(5,2);
	v.add("riya");
	v.add("riya");
	v.add("riya");
	v.remove(1);
	System.out.println("capacity of vector is"+v.capacity());
	System.out.println("size of vector is"+ v.size());
    }
}
