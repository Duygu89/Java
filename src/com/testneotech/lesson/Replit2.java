package com.testneotech.lesson;

import java.util.Scanner;

public class Replit2 {

	public static void main(String[] args) {
		// Write a program that will look up a user.

		// Assume that you have only 2 users: Max Payne and Alan Wake.
		// First, ask user to enter full name.
		// Display message: "Enter full name:".
		// Then take input from user.
		// If name is equals to either "Max Payne" or "Alan Wake",
		// display message: "User found!". Otherwise, display message: "User not
		// found!".
		// _`Please make your search case insensitive!`_

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String name = scan.nextLine();
		String user1 = "Max Payne";
		String user2 = "Alan Wake";
		if (name.equalsIgnoreCase(user1)) {
			System.out.println("User found!");
		}else if (name.equalsIgnoreCase(user2))
		{
		System.out.println("User found!");	
		}else {
			System.out.println("User not found!");
		}
		

	}

}
