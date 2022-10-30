package com.neotech.lesson16;

public class StringMethod {

	public static void main(String[] args) {
	
		
		
		// ------ 1st way we use to create strings ------
		
		String name = "HELLO WORLD"; // String literal
		
		
		// -----2nd way to create a string ------
		
		String name2 = new String ("Dardan");
		
		
		
		// LENGTH
		int size = name.length();
		System.out.println("The size of the name is "+" "+ size);
		
	String school = "Neotech";
	
	
	System.out.println("The size of the school is"+" "+school.length());
	
	//toUpperCase() , toLowerCase()
	String city = "New York";
	String lowercaseCity = city.toLowerCase();
	System.out.println(lowercaseCity);
	System.out.println(city.toUpperCase());
	System.out.println(city);
	// String objects are IMMUTABLE,means it DOES NOT change
	// Created a new string , city now points to it
	city = "New York City";
	
	//CONCAT
	
	String sentence = "The size of " + school + "is"+ school.length();
	//joining one String
	String name1 = "Duygu";
	String lastName = " Haslak";
	String fullName = name1 + " " +lastName;
	
	
	String fullName2 = name1.concat(lastName);
	System.out.println("Full name is "+" "+ fullName2);	
	
	
	
	
	String nameWithSpace = name1 +" "+lastName;
	String nameWithSpace1 = name1.concat(" ").concat(lastName);
	
	//Method chaining
	
	System.out.println(nameWithSpace1);
	
	//isEmpty
	String str = "";
	boolean isEmp = str.isEmpty();
	System.out.println(isEmp);
	
	
	//TRIM
	
	String str2 = "I am     very hungry   !    ";
	System.out.println(str2.trim());
	
	System.out.println("Lenght of str2 is "+" "+ str2.length());
	System.out.println("Lenght of trimmed str2 is "+" "+ str2.trim().length());
	
	System.out.println("*_*_*_*_*_*_*_*_*_*_");
	
	int [] num = {4,3, 6, 7};
	int sizeArray=num.length; // this is PROPERTY of ARRAYS
	
	int sizeOfString = "Hello".length();
	
	
	
	
	}
	

}
