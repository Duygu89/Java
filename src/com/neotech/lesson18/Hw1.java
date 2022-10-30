package com.neotech.lesson18;

public class Hw1 {

	// ▪ Create three variables studentName, studentID and numberOfStudents (should
	// be a static variable)

	// ▪ Create three objects of the Students Class

	// ▪ Set the value for studentName, studentID and increment the number Of
	// Students for each object

	// ▪ Print out total the number of students

	String studentName;
	int studentID;
	static int numberOfStudents;

	void studentInfo() {
		for (int a = 0; a < 5; a++) {
			System.out.println("Student name is: " + studentName + "Student ID: " + studentID);

			numberOfStudents++;

		}
	}
	public static void main(String[] args) {
		
		Hw1 st1 = new Hw1();
		
		
		
		
	}
	
	
}
