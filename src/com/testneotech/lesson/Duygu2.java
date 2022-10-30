package com.testneotech.lesson;

import java.util.Scanner;

public class Duygu2 {

	public static void main(String[] args) {
		
	/* first quiz %30
	 * second quiz %30
	 * final % 40 
	 *  passed note : 60 
	 *   
	 */
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your last name : ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter your course : ");
		String course = scanner.nextLine();
		
		System.out.println("Enter your quiz score :");
		double quiz1=scanner.nextDouble();
		System.out.println("Enter your 2.quiz score : ");
		double quiz2=scanner.nextDouble();
		System.out.println("Enter your final score :");
		double quiz3=scanner.nextDouble();
		double total=(quiz1*0.3)+(quiz2*0.3)+(quiz3*0.4);
		if(total >=60) {
			System.out.println(name +" "+ lastName+" "+ "you passed the exam "+ total);
			
		}
		else {
			System.out.println(name+" "+lastName+" "+ "You failed the exam "+ total);
			
		}
		
		
		
		
		
	}

}
