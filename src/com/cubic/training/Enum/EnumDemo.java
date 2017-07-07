package com.cubic.training.Enum;

public class EnumDemo {

	public static void main(String[] args) {
		Directions s=Directions.EAST;
		for(Directions d: Directions.values()){
			System.out.println(d);
		}
	}
}

enum Directions{
	EAST,
	WEST,
	NORTH,
	SOUTH
}