package com.neotech.lesson19;

public class HomeworkDemo {

	public static void main(String[] args) {
		Homework1 st1 = new Homework1 ();
		
st1.studentName = "Duygu";
st1.studentID = 1;
//Increment the number of students
	
Homework1.numberOfStudents++;
//We can do this, but do NOT
	
	Homework1 st2 = new Homework1();
	st2.studentName="Hakan";
	st2.studentID=2;
	Homework1.numberOfStudents++;


	Homework1 st3 = new Homework1();
	st3.studentName="Harun";
	st3.studentID=3;
	Homework1.numberOfStudents++;
System.out.println("The total number of student: " + Homework1.numberOfStudents);

	}

}
