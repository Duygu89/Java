package com.neotech.lesson12;

public class TwoDimentionalArray {

	public static void main(String[] args) {
	int [][] numbers = new int[2]  [4];
	                       // rows //columns
	//FILL IN THE FIRST ROW
	
	     //row  //columns
	numbers[0]	[0] = 10;
	numbers[0]	[1] = 20;
    numbers[0]	[2] = 30;
    numbers[0]	[3] = 40;
    //FILL IN THE SECOND ROW
    numbers[1]	[0] = 50;
	numbers[1]	[1] = 60;
    numbers[1]	[2] = 70;
    numbers[1]	[3] = 80;
    
    //LET'S PRINT 60 ON THE SCREEN
    
    System.out.println("Let's print 60");
    System.out.println(numbers[1][1]);
    System.out.println("Let's print 80");
    System.out.println(numbers[1][3]);
    System.out.println("===============");

	
	int [][] nums = {
			{3,4,5,6}, //row number 0
			{7,8,9,10}, // row number 1
			{11,12,13,14} // row number 2
	};
	System.out.println(nums[2][2]);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
