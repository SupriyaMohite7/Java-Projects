/*
 * Create a class Student having id,name, array of marks

and percentage
Create a method to calculate percentage
from the marks
Create 5 object of this class anonymously.
Display the student details containing id,name and percentage
 */
package com.example4;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo {
	static Scanner sc = new Scanner(System.in);
	static double per = 0;

	static void userInput(Student student) {
		int total = 0;
		System.out.println("Enter Id :");
		student.setId(sc.nextInt());
		System.out.println("Enter name :");
		student.setName(sc.next());
		System.out.println("Enter Marks :");
		int[] marks = new int[5];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks :");
			marks[i] = sc.nextInt();

		}
		student.setMarks(marks);
		for (int i = 0; i < marks.length; i++) {

			total = marks[i] + total;
		}
		per = total / marks.length;

		student.setPer(per);
	}

	public static void main(String[] args) {
		Student s[] = new Student[3];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			userInput(s[i]);
		}

		for (Student x : s) {
			System.out.println(x);

		}

	}

}
