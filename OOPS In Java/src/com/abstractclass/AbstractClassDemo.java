package com.abstractclass;

abstract class Showable{
	
	abstract void show();
}
class Student extends Showable
{
	int id;
	public Student()
	{
		
	}
	
	public Student(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	void show() {
		System.out.println("Id of student :"+id);
		
	}
	
}
class Staff extends Showable
{
	int id;
	public Staff()
	{
		
	}
	
	public Staff(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	void show() {
		System.out.println("Id of staff:"+id);
	}

	
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
	/*	Student stud=new Student();
		stud.setId(101);
		Staff sf=new Staff();
		sf.setId(1001);*/
		Showable s;
		s=new Student(101);
		s.show();
		s=new Staff(1001);
		s.show();
		

	}

}
