package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {

		// SPLIT()
		String sentence = "Today is Tuesday and we are learning Java!";
		String[] result = sentence.split(" ");

		// Print out the result

		for (String word : result) {
			System.out.print(word + "|");
		}

		System.out.println();

		System.out.println("This sentece has " + result.length + " words!");

		String[] array = sentence.split("a");
//for loop
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
 String list = "1.Hakan2.Burak3.Kenan4.Deyo";
 String [] arr = list.split("[^a-zA-Z]");//The character class [a-zA-Z] matches any character from a to z or A to Z
 for(int i = 0; i<arr.length;i++) {
	 System.out.print(arr[i]+"-");
 }
		
		
		
		
		
	}

}
