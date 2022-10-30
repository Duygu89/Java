package com.neotech.lesson13;

public class BreakTask {

	public static void main(String[] args) {
		
		
		// Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		int numbers [][] = {{1,2,3,9},{4,5,6,0},{7,8,9,78},};
			for(int row =0; row<numbers.length; row++)
			{
				for(int col=0; col<numbers[row].length; col++)
				{
					System.out.print(numbers[row][col]+ " ");
				}
				System.out.println();
			}
			
			/*
			 * Create a 2D array of integer type with 3 rows and 4 columns and print all
			 * values of the whole array.
			 */
			
			
			int[][] numbers1 = {	{3, 5, 7, 34},
								{3, 9, 2, 6}, 
								{9, 3, 4, 5}};
			
			
			
			
			
			//I will send you a 2d array, please print everything
			
			for(int building = 0; building < numbers1.length; building++)
			{
				for (int unit = 0; unit < numbers1[building].length; unit++)
				{
					System.out.print(numbers1[building][unit] + " ");
				}
				System.out.println();
			}
						
								
							}
		
	
		
		
		
		
		
		
		
		
		

	}


