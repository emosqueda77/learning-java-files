package com.javaprograms.javainheritance;


//Guitar Parent class
public class Guitar {
	
	private String name;
	private int serialNum;
	private int numOfStrings;
	
	
	
	public Guitar(){
		System.out.println("Parent Constructor");
	}
	
	//play
	public void play(){
		System.out.println("Parent Play");
	}
	
	//Sound
	public void sound(){
		System.out.println("Parent Sound");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public int getNumOfStrings() {
		return numOfStrings;
	}
	public void setNumOfStrings(int numOfStrings) {
		this.numOfStrings = numOfStrings;
	}
	
	

}
