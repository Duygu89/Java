package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.firstName = "Duygu";
		s1.lastName = "Haslak";
		s1.studentId = 1212;
		s1.school = "NeoTech Academy";
		s1.gender = 'F';
		s1.grade = 'A';
		System.out.println(s1.firstName + " " + s1.lastName + " " + "is a student " + "of" + " " + s1.school);
		System.out.println("Student id is : " + s1.studentId);
		System.out.println("Gender: " + s1.gender);
		System.out.println("Grade of Score : " + s1.grade);
		s1.doHomework();
		s1.study();
		System.out.println();

		s2.firstName = "Alan";
		s2.lastName = "Domin";
		s2.studentId = 1313;
		s2.school = "Neotech Academy";
		s2.gender = 'M';
		s2.grade = 'A';
		System.out.println(s2.firstName + " " + s2.lastName + " " + "is a student " + "of" + " " + s2.school);
		System.out.println("Student id is : " + s2.studentId);
		System.out.println("Gender: " + s2.gender);
		System.out.println("Grade of Score : " + s2.grade);

		s2.doHomework();
		s2.study();

	}

}
