package com.cubic.training.Hashset;

import java.util.HashSet;

public class HashSetDemo {
	
	
public static void main(String[] args) {
	HashSet<String> hs =new HashSet<>();
	hs.add("java");
	hs.add(".net");
	hs.add("java");
	hs.add("UI");
	for(String s:hs)
	{
		System.out.println(s);
	}
}
}
