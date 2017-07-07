package com.cubic.training.InnerclassInputout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialAss {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fi=new FileInputStream("Serialization.txt");
	ObjectInputStream ob=new ObjectInputStream(fi);
	Object o = ob.readObject();
    System.out.println((Student)o);
	
	fi.close();
}


}
