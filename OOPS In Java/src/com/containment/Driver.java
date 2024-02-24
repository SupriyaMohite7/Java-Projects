/*
Task 1> Create a class Car having carNo, brand, model
every Car is alloted a Driver having driverid, name, adharNo, salary
We have a Taxi system , Create class where each Car is alloted one driver 
  > Create an anoymous driver which is been alloted to a car for just one
   day
  > Create 3 car having a driver each (taking user input)
Print the details of car along with the driver

 */
package com.containment;

public class Driver {
	int driverid, adharNo, salary;
	String name;

	Driver() {

	}

	Driver(int driverid, String name, int adharNo, int salary) {
		this.driverid = driverid;
		this.name = name;
		this.adharNo = adharNo;
		this.salary = salary;
	}
	public void setDriverId(int driverid) {
		this.driverid = driverid;
	}

	public int getDriverId() {
		return driverid;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}

	public int getAdharNo() {
		return adharNo;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "Driver Id : " + driverid + " Name : " + name + " Adhar no : " + adharNo + " Salary : " + salary;
	}

	
}
