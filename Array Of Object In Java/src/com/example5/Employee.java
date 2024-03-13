/*

 * Create a class Department id, name, location
Create a class Employee having id,name and salary
and containment dept
--> Create 2 anonymous object and one object from
getter,setter
----> Create object using user input
---> Sort the employee on the basis of salary
--->Find the employee having max salary

 */
package com.example5;

public class Employee {

	private int eid;
	private String ename;
	private double Salary;
	Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		Salary = salary;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Salary=" + Salary + ", dept=" + dept + "]";
	}
	
	
}
