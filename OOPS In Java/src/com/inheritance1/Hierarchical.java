package com.inheritance1;

class Student1 {
	int id;
	String name;

	public Student1() {
		System.out.println("Student :Default constructor");
	}

	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student id=" + id + " name=" + name;
	}

}
class Student2 extends Student1
{
	String school_name;
	int marks;
	public Student2() {
System.out.println("Student 2 : Default constructor");
	}
	public Student2(int id, String name,String school_name,int marks)
	{
		super(id,name);
		this.school_name=school_name;
		this.marks=marks;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student2 school_name=" + school_name + ", marks=" + marks + ", id=" + id + ", name=" + name ;
	}
	
	
	
}
class Student3 extends Student1
{
	String clg_name;
	String course;
	int fees;
	public Student3() {
System.out.println("Student 3 : Default constructor");
	}
	public Student3(int id, String name,String clg_name,String course,int fees)
	{
		super(id,name);
		this.clg_name=clg_name;
		this.course=course;
		this.fees=fees;
	}
	public String getClg_name() {
		return clg_name;
	}
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student3 clg_name=" + clg_name + "course=" + course + "fees=" + fees + ", id=" + id + ", name="
				+ name ;
	}
	
}

public class Hierarchical {

	public static void main(String[] args) {

		Student2 s2=new Student2(101,"ABC","brillient school",100);
		Student2 s22=new Student2();
		Student2 s3=new Student2();
		Student2 s33=new Student2();
		
		System.out.println(s2);
	}

}
