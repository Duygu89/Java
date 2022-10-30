package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		
		//How can we print Good Evening 5 times
		
				/*
				 * System.out.println("Good Evening"); System.out.println("Good Evening");
				 * System.out.println("Good Evening"); System.out.println("Good Evening");
				 * System.out.println("Good Evening");
				 */
				
				System.out.println("==========!");
				
				//2nd  - using while
				//what do we need when use a While?
				// - we are responsible for where, when we start
				// - we are responsible when we stop
				
				int count = 1; // WHERE DO YOU START 
				
				
				while (count <= 5) // WHERE DO YOU STOP 
					
					// 5] -->include 6[--.do not include 
				{
					System.out.println("Good Morning!");
					
					count++; // INCREMENT 
				}
				System.out.println("doWhile Loop");
				int num = 1;
				do 
				{
					num++;
					System.out.println("Good Afternoon");
				}
				while(num<=5);
				
				int n1 = 10;
				while(n1 <= 5) //FALSE 
				{
					System.out.println("Good Night!");
					n1++;
				} // THIS LINE WILL NOT EXECUTE BECAUSE while(n1 <= 5) FALSE
				
				
				System.out.println("do while ");
				int n2 = 10; 
				do 
				{
					System.out.println("Good Time!");
					
					n2++;
				}while(n2 <= 5);
		

	}

}
