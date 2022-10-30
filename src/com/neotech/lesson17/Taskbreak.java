package com.neotech.lesson17;

public class Taskbreak {

	public static void main(String[] args) {
		
		
		
		//You have a String a = "Is it saturday? Is it raining? Do we have a Java Class today? 
		//" How would you find out how many sentences are in that String?

				/*
				 * If you find this easy: "Is it saturday! Is it raining? Do we have a Java Class today."
				 */
				String sentence = "Is it saturday? Is it raining? Do we have a Java Class today?";
				String [] array = sentence.split("\\?");
				System.out.println("There are "+  array.length +  " sentences");
				// " / ? n t

	}

}
