package com.constructoroverloading;

class Employee {
	private int id;
	private String name;
	private float salary;

	Employee() {
		System.out.println("Default Constructor");
	}

	Employee(int id, String name, float salary) {
		System.out.println("para constuctor 1");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(int id, float salary, String name) {
		System.out.println("para constuctor 2");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(int id, float salary) {
		System.out.println("para constuctor 3");
		this.id = id;
		this.name = name;
		
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	@Override
	public String toString()
	{
		return "Employee : "+id+ " :id "+name+" :name "+salary+" :salary ";
	}
}

public class Company {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(101, "priya", 10000);
		Employee e3 = new Employee(102, 20000, "riya");
		Employee e4 = new Employee(103, 20000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		e4.setSalary(5000);
		
		System.out.println(e4);

	}

}
