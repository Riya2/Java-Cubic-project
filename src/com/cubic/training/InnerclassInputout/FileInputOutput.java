package com.cubic.training.InnerclassInputout;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputOutput {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("C:\\Pattern.txt");
		Scanner sc=new Scanner(fin);
		double d;
		double sum=0;
	
		double groupsum=0;
		while(sc.hasNextLine())
		{
			d= sc.nextDouble();
		if(d<0)
		{
			System.out.println("The previous group had a sum of"+Math.round(sum));
			
			groupsum=groupsum+sum;
			System.out.println("the current overall sum of"+Math.round(groupsum));
			sum = 0;
		}
		else{
			sum=sum+d;
			
		
			
		}
		
		
		}
		System.out.println("the overall total had a sum of"+Math.round(groupsum));
		
		
		
		
		/*try(FileReader reader=new FileReader("C:\\Pattern.txt")){
			int character;
			while((character=reader.read()) !=-1){
			System.out.println((char)character);
			}
				
		}*/
		fin.close();
	}


}
