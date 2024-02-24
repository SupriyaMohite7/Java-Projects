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

public class Department {

	int did;
	String deptname;
	Department()
	{
		
	}
	Department(int did,String deptname)
	{
		this.did=did;
		this.deptname=deptname;
	}
	public void setDid(int did)
	{
		this.did=did;
	}
	public int getDid()
	{
		return did;
	}
	public void setDeptname(String deptname)
	{
		this.deptname=deptname;
	}
	public String getDeptname()
	{
		return deptname;
	}
	public String toString()
	{
		return "Department : Id : "+did+"Department Name : "+deptname;
	}
}
