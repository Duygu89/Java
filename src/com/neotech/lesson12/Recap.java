package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {

//Let's create basic integer ARRAY

		int[] grades = new int[5];
		// from 0 thru 5
		// print the size of this ARRAY
		System.out.println("The size of the array is : " + grades.length);
		// element with index # 2
		System.out.println("The third element of the array is : " + grades[2]);

		grades[3] = 85;
		grades[1] = 90;
		// grades[0] = "hello";
		grades[2] = 100;
		grades[0] = 93;
		grades[4] = 78;

		//re assign the value of an element 
		grades[4]=98;
		
		int size = grades.length;
		System.out.println("The size of array after assigning value is " + grades.length);
		
		System.out.println("The third element of the array is : " + grades[2]);
		
		//let's find TOTAL of all element
		int sum = 0;
		for(int i = 0 ; i<5; i++)
		{
			sum+=grades[i]; 
			System.out.println("The total is : "+ sum);
		}
			
	System.out.println("the total is "+ sum);
	int avg = sum/grades.length;
	System.out.println("The average is "+ avg);
		
		
		System.out.println("-------------------");
		
		
		String [] cities = {"Paris", "New York", "London", "Istanbul", "Tokyo","Dushanbe"};
		
		System.out.println(cities[3]);
		System.out.println("The size of my string array is " + cities.length);
		for(int i = 0; i< cities.length; i++) 
		{
			System.out.println(cities[i]);
		}
		
	}

}
