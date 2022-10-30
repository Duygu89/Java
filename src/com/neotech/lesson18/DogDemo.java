package com.neotech.lesson18;

public class DogDemo {
	public static void main(String[] args) {

		// How can i access INSTANCE variable
		// By creating an object and using reference value

		Dog dog1 = new Dog();
		dog1.name = "Qimi";
		dog1.age = 3;
		dog1.displayDogInfo();

		// How can i access STATIC variable
		// We can ACCESS it by using THE CLASS NAME
		System.out.println(Dog.breed);// --we NOT use instance , we use CLASS.
		System.out.println(Dog.paws);

		Dog dog2 = new Dog();
		dog2.name = "Jager";
		dog2.age = 7;
		dog2.displayDogInfo(); //breed and paws class LEVEL variable (Static variables)
		
//Every object  that i create they will be the same (breed paws)
//They are not instance variable 
//set once apply all
		
		System.out.println("-------");
		
		Dog.breed="Sheppard";
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		Dog dog3 = new Dog();
		dog3.name="Magic";
		dog3.age = 4;
		dog3.displayDogInfo();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
