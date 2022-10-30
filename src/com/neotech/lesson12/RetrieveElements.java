package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// LOOP through the grades ARRAY
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ",");
		}
		System.out.println();

		// 2ND WAY ; Enhanced loop/Advanced FOR loop
		for (char grade : grades) {
			System.out.print(grade + ",");
		}
		System.out.println();
		System.out.println("-------------");
		String[] fruits = { "Apple", "Orange", "Pear", "Kiwi", "Watermelon" };
		// let's PRINT the fruits
		for (int i = 0; i < fruits.length; i++) {
			// System.out.print(fruits[i]+" ,");

			// PRINT FAV FRUIT
			if (fruits[i].equals("Apple"))

			{
				System.out.println(fruits[i] + " is my fav fruit");
			} else {
				System.out.println(fruits[i]);
			}
		}
		for (String fruit : fruits) {
			if (fruit.equals("Watermelon")) {
				System.out.println(fruit + " is my fav fruit");
			} else {
				System.out.println(fruit);
			}
		}
               
	}

}
