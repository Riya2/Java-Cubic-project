package com.cubic.training.Serialization;

import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		Student1 p=new Student1(101,"Nischal","java",2000.0,76);
		FileOutputStream fo=new FileOutputStream("Serial.txt");
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(p);
		System.out.println("serialization sucess");
	}
}
class Person implements Serializable{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
class Student extends Person{
    String course;
    double fee;
	public Student(int id, String name,String Course,double Fee) {
		super(id, name);
		course=Course;
		fee=Fee;
		
	}
	@Override
	public String toString() {
		return "Student [course=" + course + ", fee=" + fee + ", id=" + id
				+ ", name=" + name + "]";
	}


	}








class Student1 extends Person{
    String course;
    double fee;
    transient int age;
    
	public Student1(int id, String name,String Course,double Fee,int age) {
		super(id, name);
		course=Course;
		fee=Fee;
		
	}
	@Override
	public String toString() {
		return "Student [course=" + course + ", fee=" + fee + ", id=" + id
				+ ", name=" + name +  ", age=" + age + "]";
	}


	}