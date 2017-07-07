package com.cubic.training.Serialization;
import java.io.*;


public class Anotherserial

{
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream Fi=new FileInputStream("Serial.txt");
	ObjectInputStream as=new ObjectInputStream(Fi);
	System.out.println((Student1)as.readObject());
	as.close();

	
}
}
