package com.cubic.training.InnerclassInputout;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.SequenceInputStream;

public class SequenceFile {

	public static void main(String[] args) throws IOException {
		/*FileInputStream fin=new FileInputStream("D:\\CubicTemp.txt");
		FileInputStream fin1=new FileInputStream("D:\\CubicTemp.txt");
		SequenceInputStream st=new SequenceInputStream(fin,fin1);
		int i;
		while((i=st.read())!=-1){
			System.out.println((char)i);
		}
		fin.close();
		fin1.close();
		st.close();*/
		
		
		/*FileInputStream fin=new FileInputStream("D:\\CubicTemp.txt");
		FileInputStream fin1=new FileInputStream("D:\\CubicTemp.txt");
		SequenceInputStream st=new SequenceInputStream(fin,fin1);
		
		
		FileOutputStream fo1=new FileOutputStream("NewFile.txt");
		FileOutputStream fo2=new FileOutputStream("NewFile1.txt");
		FileOutputStream fo3=new FileOutputStream("NewFile2.txt");
		ByteArrayOutputStream bt=new ByteArrayOutputStream();
		String s="riya";
		bt.write(s.getBytes());
		bt.write(65);
		bt.writeTo(fo1);
		bt.writeTo(fo2);
		bt.writeTo(fo3);*/
		
		FileWriter fw=new FileWriter("D:\\CubicTemp.txt");
		PrintWriter pw=new PrintWriter("D:\\NewCubic.txt");
		//fw.write("java is good");
		pw.println();
		pw.println("Java tech");
		pw.println("cubic tech");
		pw.close();
		
		
		
		
		
	}
}
