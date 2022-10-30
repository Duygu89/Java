package com.testneotech.lesson;

import java.util.Scanner;

public class Replit1 {
	//Write a program that will verify if the **sentence** contains **word**. 
	//Print out the result as a boolean value. 
	
public static void main(String[] args) {
	System.out.println("what you gonna buy for me for thanksgiving?");
	 Scanner scanner = new Scanner(System.in);
	    String word = scanner.nextLine();
	    System.out.println(" which one");
	    String sentence = scanner.nextLine();
         boolean  equal = sentence.equals("Airpods");
        System.out.println(sentence.equals(word));

	
	
}
	
	
	
	
	
	
	
	
}
