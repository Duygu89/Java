package com.neotech.lesson15;

public class Task {

	/*
	 * method1: Create a method that will take 2 parameters as numbers
			    and prints which number is larger.
       method2: Create a method that will take a number and prints whether
			    the number is even or odd.
       method3: Create a method that will say Hello in a different language
		       based on the country that will passed when method is executed.
		        */
	
	void larger (int a, int b)
	{
		if (a>b)
		{
			System.out.println(a+"bigger then"+" "+b);
		
		} else if (a<b) 
		{System.out.println(b+"bigger than"+" "+a);
		}
		else {
			System.out.println("Numbers are equal");
		}
		
	}
	void evenOdd (int a)
	{
		if(a%2==0) 
		{
			System.out.println(a+"is the even number");
		}
		else {
			System.out.println(a+"is the odd number ");
		}
			
	}
	
	void sayHello(String country )
	
	{
		switch (country)
		{
		case"US":
			System.out.println("Hello!");
			break;
		case "Turkiye":
			System.out.println("Merhaba!");
			break;
		case"Albinia":
			System.out.println(" Ckemi");
			break;
		case "Ecuodor":
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
