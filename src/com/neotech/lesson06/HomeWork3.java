package com.neotech.lesson06;

public class HomeWork3 {
public static void main(String[] args) {
	
	//set your number 
	
	int number = 2373;
	//first method
	int remainder = number % 2 ;
	
	//check if the remainder is 0.condition
	if(remainder==0)
	{
		System.out.println("This number is even number!");
	}
	else {
		//the number is odd
		System.out.println("This number is odd number!");
	}

	//second method
	if (remainder == 1)
	{
		System.out.println("This number is an odd number ");
	}
	else {
		System.out.println("This number is an even method");
	}
	
	//third method 
	if (number %2 ==0) {
		System.out.println("This is number is an odd number");
		
	}
	else 
	{
		System.out.println("This number is an even number");
	}
			
}
}
