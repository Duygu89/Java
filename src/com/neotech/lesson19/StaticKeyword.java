package com.neotech.lesson19;

public class StaticKeyword {

	// instance Variables

	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	//Instance METHOD
	//inside an instance method WE  CAN USE EVERY VARIABLE!!
	void displaySpecificInfo() {
System.out.println("We built a " + brand + " with "+ memory + " GB with "+ color + " color!");


	}
	//  static void() method --- you can only ACCESS static variable!!
static void displaySpecificInfo_2() {
	//WE CAN NOT REFERENCE INSTANCE VARIABLES 
	//ONLY USE STATIC VARIABLES!!
System.out.println(brand + touchScreen);

}


public static void main(String[] args) {
	
	
	//String touchscreen;
	
	//We DON'T have to create an object for static variables!!!
         brand  = "Iphone ";
	touchScreen = true; 
	//we are in the SAME CLASS. so we can ACCESS touchScreen WITHOUT the class name!!
	
	
	
	//Can we SAY this? NO , we need an OBJECT!!
	//StaticKeyword.color = "red";
	
	
	StaticKeyword iphone1 = new StaticKeyword();
	iphone1.memory = 64;
	iphone1.color = "red";
	iphone1.displaySpecificInfo();
	
	//We can call it WITHOUT OBJECT,because WE ARE IN THE SAME CLASS
	displaySpecificInfo_2();
	
	//iphone1.displaySpecificInfo_2();
	//We can,but this is NOT RIGHT WAY TO ACCESS STATIC VARIABLE
	
	StaticKeyword.touchScreen = true;
	
	//Why sometimes we are using class name for static elements and sometimes NOT
	// To show that we can do it from within THE SAME CLASS
	displaySpecificInfo_2();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
