package com.cubic.training.InnerclassInputout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileInputDemo {
public static void main(String[] args) throws IOException {
	//FileInputStream fin=new FileInputStream("C:\\CubicTemp.txt");
	FileOutputStream fout=new FileOutputStream("C:\\zebib.txt");
	BufferedOutputStream bo=new BufferedOutputStream(fout);
	//BufferedInputStream bin=new BufferedInputStream(fin);
	//System.out.println((char)bin.read());
	bo.write(65);
	bo.write(80);
	bo.flush();
	fout.close();
	//fin.close();
}
}
