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

public class Student {

	int id;
	String name;
	int[] marks;
	double per;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, int[] marks, double per) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.per = per;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	public double getPer() {
		return per;
	}


	public void setPer(double per) {
		this.per = per;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", per=" + per + "]";
	}

	



	
}
