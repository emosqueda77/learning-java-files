package com.javaprograms.javaarraylists;

import java.util.ArrayList;

public class JavaArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("ArrayLists ar great");
		myArrayList.add("Hello");
		myArrayList.add("Great!");
		
		for (int i = 0; i < myArrayList.size(); i++){
			//System.out.println("Item: " + myArrayList.get(i));
		}
		
		
		//myArrayList.remove(0);
		myArrayList.remove("Great!");
		
		
		for (String item : myArrayList){
			System.out.println("my Items: " + item);
		}

	}

}
