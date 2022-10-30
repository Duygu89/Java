package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {

		/*
		 * Ask the user to enter the height in inches. Person should be classified as
		 * one of the following:
		 *  • short (under 60 inch) 
		 *  • medium (between 60 -72 inch)
		 *  • tall (over 72 inch)
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Box Height in Inches");
		
		int inch= input.nextInt();
		if(inch<60) {
			System.out.println("The box is small");
		}
		else if (inch>61 && inch<72) {
			System.out.println("The box is medium");
		}
		
		else if (inch>73 && inch<100) {
			System.out.println("The box is taller");
		}
			
     		
		

		
		
		
				

	}
}
