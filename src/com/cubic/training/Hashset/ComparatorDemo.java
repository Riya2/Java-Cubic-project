package com.cubic.training.Hashset;

import java.util.Comparator;

public class ComparatorDemo {
public static void main(String[] args) {
	
}
}
 class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.id>s2.id)
		{
			return 1;
		}
		else if(s1.id<s2.id)
		{
			return -1;
		}
		else{
		return 0;
		}
	}
	 
 }
 class Student implements Comparable<Student>{
	 
	 int id;
	 String name;
	 int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
 }