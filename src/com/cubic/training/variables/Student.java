package com.cubic.training.variables;

public class Student {
	int id;
	String name;
	String course;
	
	

	public static void main(String[] args) {
		Student s = new Student();
		s.id=10;
		s.name="Riya";
		s.course=" Java  programming";
		
		System.out.println("The student Id is:" + s.id);
		System.out.println("The name of the student is:" + s.name);
		System.out.println("Course that student take is:" + s.course);
		
		Student s2= new Student();
		s2.id=4;
		s2.name="Giya";
		s2.course="PHP programming";
		
		System.out.println("The student Id is:" + s2.id);
		System.out.println("The name of the student is:" + s2.name);
		System.out.println("Course that student take is:" + s2.course);
		

	}

}
