package com.neotech.lesson05;

public class BreakTask1 {
	
	public static void main(String[] args) {
		int day =7 ;
		
		//if day == 1 --> today is Monday and we are working 
		// if day == 2
		//if day == 3
		// .....
		if (day == 1)
		{
			System.out.println("Today is Monday and we are working");
			
			
		}
		else if (day ==2 )
			
		{
			System.out.println("Today is Tuesday and we are working");
			
		}
		else if  (day==3)
		{
			System.out.println("Today is Wednesday and we are working");
			
		}
		else if (day==4)
		{
			System.out.println("Today is Thursday and we are working ");
		}
		else if (day==5)
		{
			System.out.println("Today is Friday and we are working ");
			
		}
		else 
			System.out.println("We are on break on Weekends");
		{
			
		}
		
		if (day>5)
		{
			System.out.println("Today is weekend and we are working");
			
		}
		else if (day>1)
			
		{
			System.out.println("We will not work on weekends");
			
		}
			
			
	
	}

}
