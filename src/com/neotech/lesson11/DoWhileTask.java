package com.neotech.lesson11;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {

		// Ask a user: Guess the number
		// Lucky number is 5
		// As long as the entered number is not 5 we need keep ask for trying
		// Once number is correct --> "You're winner"

		int luckyNumber = 5;
	Scanner scan = new Scanner(System.in);
	int number;
		System.out.println("Guess my number: ");
		number = scan.nextInt();
		System.out.println("Your number : " + number);
		while(number!=luckyNumber)
		{
			//keep asking again
		System.out.println("Guess my number: ");
			number=scan.nextInt();
			
		}System.out.println("You are winner!");
		
		
		//Using DO WHILE 
	
	
		do
		{
			System.out.println("Guess my number : ");
			number=scan.nextInt();
			
		}while(number!=luckyNumber);
		System.out.println("You are winner");
		
		
		
		
		//using FOR LOOP ---- I want to give the user max 5 tries
	
	
	
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Guess my number: ");
			number = scan.nextInt();
			
			if (number == luckyNumber)
			{
				System.out.println("You're a winner");
				break;
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
