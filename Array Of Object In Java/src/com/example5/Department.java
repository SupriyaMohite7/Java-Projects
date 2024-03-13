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

public class Department {

	private int did;
	private String dname;
	private String location;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname, String location) {
		super();
		this.did = did;
		this.dname = dname;
		this.location = location;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", location=" + location + "]";
	}
	
}
