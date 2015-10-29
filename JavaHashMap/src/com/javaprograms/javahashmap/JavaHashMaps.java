package com.javaprograms.javahashmap;

import java.util.HashMap;

public class JavaHashMaps {

	public static void main(String[] args) {
		
		HashMap myHashMap = new HashMap();
		
		myHashMap.put("Lady", "Bonnie");
		myHashMap.values();
		myHashMap.containsKey("Lady");
		myHashMap.size();
		myHashMap.remove("Lady");
		
		
		if(myHashMap.containsKey("Lalla")){
			//System.out.println("Yes");
		}else{
			//System.out.println("Nope");
		}
		
		System.out.println("Value: " + myHashMap.values());

	}

}
