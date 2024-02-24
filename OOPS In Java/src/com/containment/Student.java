package com.containment;

public class Student {

	private int rollno;
	private String name;
	private Course course;

	Student() {

	}

	Student(int rollno, String name, Course course) {
		this.rollno = rollno;
		this.name = name;
		this.course=course;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student : Roll no :" + rollno + " Student Name :" + name + "  " + course;

	}
}
