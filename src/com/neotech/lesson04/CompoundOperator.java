package com.neotech.lesson04;

public class CompoundOperator {
	public static void main(String[] args) {
		
		
		int num = 100 ;
		num=num+100;
		System.out.println(num);
		
		
		num=num	+100;
		System.out.println(num); // 300
		
		
		
		num+=60; // we can use compound /shorthand operator 
		System.out.println(num);
		
		num +=60;
	
		System.out.println(num);
		
		
	num = num-1; //long way
	num-=10; //short way
	
	num%=9;
	System.out.println(num);

		
		
		
		
	}

}
