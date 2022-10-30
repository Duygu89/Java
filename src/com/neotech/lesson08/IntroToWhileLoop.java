package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		
		
		int time = 8 ;
		if(time<9) {
			System.out.println("good evening");
		}
		while (time<12) 
		{ //beginning of the WHILE body
		System.out.println(time);
		
		time++;

		}//ENDING
		
	//HOW TO PRINT NUMBER [20 - 30[?
	int a = 20;
	
		
		while (a < 30) // a  <=29
		{
			//System.out.println("Condition : ");
			System.out.print((a+" "));
			//System.out.println(a);
			a++;
		}
		//HOW DO WE PRINT NUMBERS 5 TO 25?
		int b = 5;
		while (b<=25)
		{
			System.out.println(++b + " ");
			++b;
			
		}
		
		
		//HOW CAN WE PRINT NUMBERS FROM 10 TO 1
		int c = 10;
		while (c>=1) {
			System.out.println(c+ " ");
			// --C OR C-- ONLY MATTERS IF WE ARE DOING MULTIPLE OPERATIONS IN ON LINE
			c--;	
		}
		//HOW CAN I PRINT ONLY EVEN NUMBER FROM 50 TO 1?
		
		
		
		
	}

}
