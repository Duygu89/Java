package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
	//Let's create some cars for our shop
		Car    car1    =   new Car();
	//Class   //object
		
		
		car1.make = "Toyota";
		car1.model="Camry";
		car1.color="Black";
		car1.year=2019;
		car1.mileage=25000;
		car1.maxSpeed=200;
		
		System.out.println(car1.make+" "+car1.model+" "+car1.color+" "+car1.year+" "+car1.mileage+" "+car1.maxSpeed);
		
		
		car1.drive();
		car1.stop();
		car1.transportPeople();
		
		Car car2 = new Car();
		
		car2.make = "Honda";
		car2.model="Fit";
		car2.color="Blue";
		car2.year=2015;
		car2.mileage=21000;
		car2.maxSpeed=100;
		
		System.out.println(car2.make+" "+car2.model+" "+car2.color+" "+car2.year+" "+car2.mileage+" "+car2.maxSpeed);
		
		car2.drive();
		car2.stop();
		car2.transportPeople();
		
		
		
		
		Car car3= new Car();
		car3.make="Ford";
	
		
		
		
		
		
		
		
		
		
		
	}

}
