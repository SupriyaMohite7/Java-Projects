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

public class Car {

	int carNo, model;
	String brand;
	String name;
	Driver driver;

	Car() {

	}

	Car(int model, String brand, String name, Driver driver) {
		this.model = model;
		this.brand = brand;
		this.name = name;
		this.driver = driver;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getModel() {
		return model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Driver getDriver() {
		return driver;
	}

	public String toString() {
		return "Model : " + model + " Brand : " + brand + " Name : " + name + " " + driver;
	}

}
