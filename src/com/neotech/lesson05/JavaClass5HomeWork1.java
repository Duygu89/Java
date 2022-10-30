package com.neotech.lesson05;

public class JavaClass5HomeWork1 {

	public static void main(String[] args) {
		
		
		
		
		//*Write a java program to check 
		//if a patient has allergies.
	    //If the patient does not have allergies print “You’re healthy!”.
	    //If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
	    //and print a statement telling the patient 
	    //“Don’t eat ___”. (fill the line with the food names – peanut, seafood etc.)


		boolean allergies = true;
		boolean peanuts = true ;
		boolean lactose = false;
		boolean bee = false; ;
		boolean seaFood = false;
		
		
		if(allergies)
		{
			System.out.println("You have allergies of seafood,peanuts" );
		}
		
		if(peanuts)
		{
			System.out.println("You can't eat peanuts");
		}
		if(lactose)
		{
			System.out.println("lactose")	;
		}
       if(bee)
       {
    	   System.out.println("bee");
       }
       if (seaFood)
      
       {
    	   System.out.println(seaFood);
       }
       else
       {
    	   System.out.println("You can't eat seafood");
       }
       
	}

}
