package com.basic2;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int salary;
	transient int passcode;
	public Employee(int id, String name, int salary, int passcode) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.passcode = passcode;
	}
	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", passcode=" + passcode + "]";
	}
	
	
	

}
