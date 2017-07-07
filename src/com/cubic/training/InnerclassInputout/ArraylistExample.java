package com.cubic.training.InnerclassInputout;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList(); //Generics
       // al.add(1);
        al.add("Riya");
        al.add("Ri");
        al.add("ya");
       // al.add('A');
       // int i=(int) al.get(0);
       // String s=(String) al.get(1);
      //  int j=(int) al.get(2);
       // String s=al.get(0);
      // System.out.println( al.get(2));
        System.out.println("Iterating using foreach lopp");
        for(String s:al){
        System.out.println(s);
        }
        
        //Iterator<String> it=al.iterator();
        
        System.out.println("using iterator");
       // while(it.hasNext()){
        //	System.out.println(it.next());
        }
	}
    


