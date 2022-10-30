package com.neotech.lesson09;

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
		do {
			System.out.println("Guess my number: ");
			number = scan.nextInt();	} 
		while (number != luckyNumber);
		System.out.println("You're a winner");
		
		
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