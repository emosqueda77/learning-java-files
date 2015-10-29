package com.javaprograms.javavariables;

public class Variables {
	
	/*
	 * int - a number: 4, 3, 5, etc
	 * byte - number: 4, 2, 5, 2, etc (smaller container than integer)
	 * long - number: 4 times bigger than integer
	 * float - decimanl number: 3.4, 3.7, 3.9, etc
	 * double - twice the size of float
	 * boolean - false or true - aka 0 or 1
	 * 
	 */
	
	public static void main(String[] args) {
		
		//type name initialization
		int myInt = 10;
		byte myByte = 120;
		long myLong = 123456778;
		float myFloat = 3.14f; //float is identified by an f after the number
		double myDouble = 44.4756;
		boolean myBoolean = false;
		
		// ****Strings****
		
		String myString = "Hello there ";
		String mySecondString = "Hey, I'm liking this ";
		
		System.out.println(myString + mySecondString + ":" + myInt);
		System.out.println(mySecondString);
		
		
		

	}

}
