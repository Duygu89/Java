package com.testneotech.lesson;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
	    
	    
		   // this part is already provided DO NOT CHANGE
		   System.out.println("Enter your email");
		   String email = scan.next();
		   scan.nextLine(); 
		    //to capture Enter key press
		    
		   System.out.println("Enter your street");
		   String street = scan.nextLine();
		     // continue for city
		    System.out.println("Enter your city");
		    String city= scan.nextLine();
		
		   System.out.println("Enter your state");
		   String state = scan.nextLine();
		   System.out.println("Enter your zip code");
		   int zipCode=scan.nextInt();

		   System.out.println("Enter your work phone number");
		   float work=scan.nextFloat();
		   System.out.println("Enter your personal phone number");
		   float personal=scan.nextFloat();
		   System.out.println("Enter your age");
	       int age = scan.nextInt();
	       System.out.println("Enter your height");
	       double height = scan.nextDouble();
	       System.out.println("Enter your weight");
	       double weight = scan.nextDouble();
	       System.out.println("Are you married");
	       boolean married = scan.nextBoolean();
	       

	}

}
