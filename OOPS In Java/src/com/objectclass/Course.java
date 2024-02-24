package com.objectclass;

public class Course {

	int course_id;
	String course_name;
	int course_fees;

	public void setData(int id, String name, int fees) {
		course_id = id;
		course_name = name;
		course_fees = fees;
	}
	public void display()
	{
		System.out.println("course id :"+course_id);
		System.out.println("course name :"+course_name);
		System.out.println("course fees :"+course_fees);
	}
}
