package com.neotech.lesson17;

public class Homework1 {

public static void main(String[] args) {
	
	String str =" We are learning String Methods";
	String str2 = str.replace(" ", "");
System.out.println("old -> "+str+"  ;lengt"+str.length ());	
System.out.println("new -> "+str2+"  ;lengt"+str2.length ());	
	
	
	String str3 = "Hello &^%#@$";
	String str4=str.replaceAll("[^a-zA-Z]","" );
	System.out.println("How many alpha characters are there ? " + str4.length() );
}	
	
	
	
	
	
}
