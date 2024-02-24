// pojo class 
//plain old java object : It does not need any special  API ,jars to run program
//     combination of default constructor, parameterised constructor,
//					  setter and getter methods, toString() method
// 
package com.constructor;

public class Student {
	private int id;
	private String name;
	private double mark;

	public Student()
	{
		System.out.println("Default");
	}
	public Student(int id,String name,double mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	public void set_id()
	{
		this.id=id;
	}
	public int get_id()
	{
		return id;
	}
	public void set_name()
	{
		this.name=name;
	}
	public String get_name()
	{
		return name;
	}
	public void set_mark()
	{
		this.mark=mark;
	}
	public double get_mark()
	{
		return mark;
	}
	public String toString()
	{
		//return "hello";
		return "id : "+id+ " name : "+name+ " mark : "+mark;
	}
}
