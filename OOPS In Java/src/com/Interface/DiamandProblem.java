package com.Interface;
interface Student
{
	void show();
	default void display()
	{
		System.out.println("i am student");
	}
	
}
interface Teacher
{
	void show();
	default void display()
	{
		System.out.println("i am teacher");
	}
	
}
public class DiamandProblem implements Student,Teacher{

	@Override
	public void show() {
		System.out.println("school name : heritage school");
	}
	 public void display()
	{
		System.out.println("i am in school");
		Student.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {

		Student s;
		s=new DiamandProblem();
		s.show();
		s.display();
		System.out.println("==============================");
	    Teacher t;
	    t= new DiamandProblem();
	    t.show();
	    t.display();

	}

	

}
