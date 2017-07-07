package com.cubic.training.InnerclassInputout;
import java.io.*;


public class SeparateFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("Assignment.txt");
		FileOutputStream fo1=new FileOutputStream("Assignme1.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		BufferedOutputStream bo1=new BufferedOutputStream(fo1);
		ByteArrayOutputStream bt=new ByteArrayOutputStream();
		String s="hello!  this is inside the file and i am happy to be inside of thefile";
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bt.write(s.getBytes());
		bt.write(65);
		bt.writeTo(fo1);
		bt.writeTo(fo);
		
		
		FileInputStream fin1=new FileInputStream("Assignment.txt");
		FileInputStream fin2=new FileInputStream("Assignme1.txt");
		SequenceInputStream st=new SequenceInputStream(fin1,fin2);
		char c[];
		String file="null";
		int i;
		while((i=st.read())!=-1){
			//System.out.println((c[i]));
			char ch=(char)i;
			file=file+ch;
		}
		System.out.println(file);
		
	}

}
