package com.cubic.training.InnerclassInputout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


public class SerializationAssign {
	   
       public static void main(String[] args) throws IOException {
		Scanner user=new Scanner(System.in);
		System.out.println("Enter your id");
		int i=user.nextInt();
		
		System.out.println("Type your name");
		String s=user.next();
		System.out.println();
		
		System.out.println("Enter your score");
		int scor=user.nextInt();
		Student st=new Student(i,s,scor);
		FileOutputStream fo=new FileOutputStream("Serialization.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(st);
		
	}
}
class Student implements Serializable{
	private static final long serialVersionUID = 1L;

	int id;
	String name;
	int score;
	String grade;
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		
		if(score>90 && score<100){
			grade="A";
			
		}
		else if(score>80 && score<90)
		{
			grade="B";
		}
		else
		{
			grade="F";
		}
		}
		
		
		
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score
				+ ", grade=" + grade + "]";
	}
	
}