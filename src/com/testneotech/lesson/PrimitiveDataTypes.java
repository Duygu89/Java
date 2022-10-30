package com.testneotech.lesson;

public class PrimitiveDataTypes {

	
	public static void main(String[] args) {
		//declaring the variables
		
		byte num1=9;
		// byte range -128 to 127
		short num2=2457; //range -32768 to 32767
		int num3=23454637; //range is -2 billion to +2 billion
		int num4=3; // yes i can store small number in a int 
		
		// in short in a byte in a int you CAN only store WHOLE number
		// CAN NOT store decimal points
	
		
       long duyguBankBalance=76896086755L; // if the number bigger than 2 billion we HAVE TO use LONG 
       
       //why don't we use long all the time
       // it is because previously the memory was limited, so you do not want to store small numbers in the big storage
       
		
	  // to store DECIMAL numbers we use FLOAT or DOUBLE. But still can store whole numbers
		
	
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.println(num3);
		 System.out.println(num4);
		 System.out.println(duyguBankBalance);
		float num5=21.676F; // you MUST use F at the end
        double num6 = 21.676; // you DON'T need F at the end 
        System.out.println(num5);
        System.out.println(num6);        
       
        
        char num7 = 'P';
        char num8 = '%';
        char num9 = '&';
        char num10 = '(';
        char num11 = ' ';
        
        
     //CHAR we can store ANY SIGN --> letters,symbols,upper lower case,space(is character)
     // we ONLY can store SINGLE character
     //char is a different DATA TYPE
        
        //boolean 
        // ONLY can store 2 values TRUE an FALSE 
        
        //SUMMARY of Data Types
        // There are 8 primitive DATA TYPES
        // For the store WHOLE numbers byte,short,long,int
        //for the store DECIMAL numbers double,float
        
        //SUMMARY of the Declaration 
        
		//1st way. DECLARING a variable and ASSIGNING a value 
        // int num1(declaring a variable of integer data types = 10; // value inside variable
        
      
		
	}
}
