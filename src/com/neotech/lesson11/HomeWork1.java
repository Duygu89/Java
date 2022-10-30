package com.neotech.lesson11;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Ask the user to enter an integer and build the following pattern: Hint: Use
		 * scanner, if user entered number 5, there should be 5 rows. In the first row,
		 * 0 spaces, (2 * 5) - 1 stars In the second row, 1 spaces, (2 * 4) - 1 stars In
		 * the third row, 2 spaces, (2 * 3) - 1 stars In the fourth row, 3 spaces, (2
		 * *2) - 1 stars In the fifth row, 4 spaces, (2 * 1) - 1 stars
		 * 
		 *********
		 *******
		 *****
		 ***
		 *
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		for (int a = 1; a <= num; a++)// I want to have as many ROWS as the number users enters

		{
			for (int b = 0; b < num; b++)// this is for the columns BE CAREFUL of new
			{
				System.out.print(" ");
			}
			//when a = 1 we have 2*5 - 1
			//when a = 2 we have 2*4 - 1
			for(int c = 1 ; c<= num-1; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
