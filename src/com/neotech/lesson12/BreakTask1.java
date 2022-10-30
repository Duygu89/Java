package com.neotech.lesson12;

public class BreakTask1 {

	public static void main(String[] args) {

		String[] countries = { "Turkey", "USA", "Albania" };
		// USING FOR LOOP
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			if (country.equals("Turkey")) {
				System.out.println("Ankara");
			} else if (country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Albania")) {
				System.out.println("Tirana");
			} else {
				System.out.println("No country");
				System.out.println("===============");
			}

			// USING FOR-EACH LOOP
		}	
			
		}
}
	


