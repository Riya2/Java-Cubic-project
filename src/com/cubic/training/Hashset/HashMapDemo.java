package com.cubic.training.Hashset;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {
	
	
public static void main(String[] args) {
	HashMap<Integer,String> he=new HashMap<Integer,String>();
	he.put(12, "Java");
	he.put(129, "rava");
	he.put(120, "Mava");
	he.put(122, "Pava");
	he.put(172, "Rava");
	for(Map.Entry m: he.entrySet()){
		System.out.println(m.getKey()+""+m.getValue());
		
	}
}
}
