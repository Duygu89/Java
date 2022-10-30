package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		// Created an instance of Cat
		cat1.name = "Leo";
		cat1.weight = 8; // Cat Objects!!
		cat1.color = "Gray";

		cat1.sayMeow();
		cat1.displayCatinfo();
		Cat cat2 = new Cat();
		cat2.name = "Zia";// cat2 instance!!they won't affect each other
		cat2.weight = 9;
		cat2.color = "Brown";
		System.out.println(cat1.name + " is " + cat1.color);
		System.out.println(cat2.name + " is " + cat2.color);

		cat1.name = "Daisy";
		System.out.println(cat1.name);// cat1 name changed!!
		System.out.println(cat2.name);
		System.out.println("---------");
		cat1.displayCatinfo();// cat1 name changed because it is instance VARIABLE
		cat2.displayCatinfo();// INSTANCE VARIABLE YOU CAN CHANGE no limit

		// concept
		// what the class variable is, local variable, static variable
		// anything INSIDE in the the CLASS INSTANCE VARIABLE
		// INSIDE the method(main method) LOCAL variable
	}

}
