package com.neotech.lesson18;

public class Cat {
	// anything inside in the the CLASS instance VARIABLE 
	//Instance Variable 
	String name ;
	int weight ;
	String color ;
	//Methods/behaviors/functions
	
	void sayMeow() {
		//this is a LOCAL variable
		String word = "meow";//this variable belongs to VOID.THAT is why call LOCAL 
		System.out.println(word);
	}
	
	void displayCatinfo() {
		//---Blue Print---
		System.out.println("Name : " + name + " weight : "+  weight +" color :  "+  color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
