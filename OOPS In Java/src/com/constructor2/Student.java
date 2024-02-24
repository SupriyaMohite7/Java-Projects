/*
2>Write a Java program to create Student class with following details
data members : rollno,name,sub1,sub2,sub3,sub4,sub5,percentage ,total ,
grade methods : displayStudents(),calculatePercentage(),calculateGrade,
comparePercentage(Student)

Write a test program create two student object and 
find out who is getting higher percentage
*/
package com.constructor2;

class Student_info {
	int rollno, sub1, sub2, sub3, sub4, sub5, total;
	float percentage;
	String grade;
	String name;

	Student_info() {
		System.out.println("******Student Details*******");
	}

	Student_info(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public void setsub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getsub1() {
		return sub1;
	}

	public void setsub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getsub2() {
		return sub2;
	}

	public void setsub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getsub3() {
		return sub3;
	}

	public void setsub4(int sub4) {
		this.sub4 = sub4;
	}

	public int getsub4() {
		return sub4;
	}

	public void setsub5(int sub5) {
		this.sub5 = sub5;
	}

	public int getsub5() {
		return sub5;
	}

	float calculatePercentage() {
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = total / 5;
		return percentage;

	}

	String calculateGrade() {
		if (percentage >= 80) {
			grade = "A";
		} else if (percentage < 80 || percentage >= 50) {
			grade = "B";
		} else {
			grade = "C";
		}
		return grade;

	}

	void displayStudents() {
		System.out.println("\n Roll no : " + rollno + "\n Name : " + name + "\n subject 1 : " + sub1 + "\n subject 2 : "
				+ sub2 + "\n subject 3 : " + sub3 + "\n subject 4 : " + sub4 + "\n subject 5 : " + sub5 + "\n Total : "
				+ total + "\n Percentage : " + percentage + "\n Grade :" + grade + "\n --------------------");
	}
	void comparePercentage(Student_info s3)
	{
		
		if (this.percentage > s3.percentage) {
			System.out.println(this.name + " has more percentage than " + s3.name);
		} else if (s3.percentage > this.percentage) {
			System.out.println(s3.name + " has more percentage than " + this.name);
		} else {
			System.out.println(this.name + " and " + s3.name + " both have same percentage");
		}
	}

}

public class Student {

	public static void main(String[] args) {

		Student_info s1 = new Student_info();
		Student_info s2 = new Student_info(1, "priya");
		s2.setsub1(75);
		s2.setsub2(75);
		s2.setsub3(75);
		s2.setsub4(75);
		s2.setsub5(75);
		s2.calculatePercentage();
		s2.calculateGrade();
		s2.displayStudents();
		Student_info s3 = new Student_info(2, "ravi");
		s3.setsub1(80);
		s3.setsub2(79);
		s3.setsub3(96);
		s3.setsub4(88);
		s3.setsub5(99);
		s3.calculatePercentage();
		s3.calculateGrade();
		s3.displayStudents();
		s2.comparePercentage(s3);
	}

}
