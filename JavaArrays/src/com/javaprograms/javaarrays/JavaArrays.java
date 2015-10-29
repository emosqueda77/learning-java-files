package com.javaprograms.javaarrays;

public class JavaArrays {

	public static void main(String[] args) {
		
		int[] myArray = {3, 5, 6}; //has length of 3
		
		String[] myStrings = {"Hey", "There", "I", "Love", "Android"};
		
		//get array values
		for(int i = 0; i < myStrings.length; i++){
			System.out.println("At Index: " + i + " Array Values: " + myStrings[i]);
		}

	}

}
