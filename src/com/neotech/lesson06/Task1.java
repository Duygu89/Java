package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		
		//Ask user for first name
		System.out.println("What is your first name?");
		String firstName = input.next();
		
		
		// ask user for last name
		System.out.println("What is your last name?");
		String lastName = input.next();
		
		
		//Print full name on the screen
		System.out.println("Full name :" + " "+ firstName +" " + lastName);
	
	
	
	}

}
