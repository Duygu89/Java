package com.neotech.lesson10;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
	
	
Scanner scan = new Scanner(System.in);
		
		String userName = "Shangri";
		String password = "378";
		
		String userNameInput ;
		String passwordInput ;
		do {
			System.out.println("Please enter your username and password: ");
			userNameInput=scan.next();
			passwordInput=scan.next();
			if (userNameInput.equals(userName)&&passwordInput.equals(password)) {
				System.out.println("You are now logged in!");
				break;
			}else {
				System.out.println("Wrong username or password");
			}
		}while(userNameInput != userName || passwordInput != password);
		
		
			
	
			
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
	}
	

		

	
		
			
		
		
			
			
			
		
		
