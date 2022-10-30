package com.neotech.lesson18;

public class Dog {
//INC CLASS --> instance /object variable!!
	
	String name;
	int age;

	// static variable
	static String breed = "Husky";
	static int paws = 4;
	// they are variable they changed BUT 
	// they changed for  all every instance 
	// that you created from this blue print 

	void displayDogInfo() {
		System.out.println("Name: " + name + " age: " + age + " breed: " + breed + " paws: " + paws);
	}
	
	
	
	
	
	
}
