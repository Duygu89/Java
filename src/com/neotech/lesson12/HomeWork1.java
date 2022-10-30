package com.neotech.lesson12;

public class HomeWork1 {

	public static void main(String[] args) {

		// Create a 2D array where you will store the following values:
		// - Mr, Mrs, Ms, Miss
		// -Smith, Jordan, Jackson, Obama.
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String employees[][] = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };

		System.out.println(employees[0][1] + " " + employees[1][0]);
		System.out.println(employees[0][0] + " " + employees[1][3]);
		System.out.println(employees[0][2] + " " + employees[1][2]);
		System.out.println(employees[0][3] + " " + employees[1][1]);

		// Just a hint: Try to do the second practice-homework using a for look, and
		// using an if-else inside....

		// Create a 2D array that first row will contain 4 names and second row will
		// contain grades, all Strings.
		// Then you program should print name of the students that has A and B grade

		String[][] scores = { { "Smith", "Jordan", "jackson", "Obama" }, { "A", "B", "C", "D" } };
		       int lenght = scores[0].length;
		       for(int a = 0 ; a<=lenght; a++ ) {
		    	   if(scores[0][a].equals("A") || scores[0][a].equals("B")) 
		    	   {
		    		   System.out.println(scores[0][a] + scores[1][a]);
		    	   }
		       }
		

	}

}
