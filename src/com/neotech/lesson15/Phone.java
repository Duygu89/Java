package com.neotech.lesson15;

public class Phone {
	
	
	
	
	
// what is mean class --->creating template,blue print
	
	String brand;
	String color;
	String model;
	int price;
	
	
					//Behaviors

	void call()
	{
		System.out.println(brand +" "+"is calling!");
	}
	void text ()
	{
		System.out.println(brand+" "+ "is texting!");
	}
	void navigate ()
	{
		System.out.println(brand+" "+ "is navigating!");
		
	}
	public static void main(String[] args) {
		
		Phone iphone = new Phone ();
	  //object  ^^^
		iphone.brand= "Apple";
		iphone.model="14";
		iphone.color="Pink";
		iphone.price= 1800;
		
		iphone.call();
		iphone.navigate();
		iphone.text();
		
		Phone android = new Phone();
		android.brand = "Samsung";
		android.model = "Note 10";
		android.color = "Black";
		android.price = 500;
		
		android.call();
		android.navigate();
		android.text();
		
		
		
	}
	
	
	
	
	
}
