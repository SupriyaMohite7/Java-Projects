/*
 * Task5>
Create a class Department having did, deptName
Create a class Employee having eid, empName, salary and department
Create 3 objects
  > 1.using anonymous department
  > 2. using department object : using contsructor
  > 3. using getter and setter: giving values from your own
check the hashcode generated for department in 1st and 2 nd object
Also print the details of all Employees
 */
package com.polymorphism;

public class Employee {
	int eid;
	String empname;
	float salary;
	Department dept;

	Employee() {

	}

	Employee(int eid, String empname, float salary, Department dept) {
		this.eid = eid;
		this.empname = empname;
		this.salary = salary;
		this.dept = dept;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String empname) {
		this.empname = empname;
	}

	public String getEname() {
		return empname;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Department getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Employee : Id : " + eid + " Name : " + empname + " Salary : " + salary + "Depertment : " + dept;
	}

	public static void main(String[] args) {
		
//1.using anonymous department

		Employee e1 = new Employee(1, "ABCD", 5000, new Department(101, "Accounts"));
		System.out.println(e1);
		// > 2. using department object : using contsructor
		Department d=new Department(103,"HR");
		Employee e3=new Employee(3,"IJKL",6000,d);
		System.out.println(e3);
		
//  > 3. using getter and setter: giving values from your own
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("EFGH");
		e2.setSalary(7000);
		e2.setDept(new Department(102, "Network"));
		System.out.println(e2);
		
//check the hashcode generated for department in 1st and 2 nd object
		System.out.println(e1.getDept().hashCode());
		System.out.println(e2.getDept().hashCode());
		
//print the details of all Employees
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
