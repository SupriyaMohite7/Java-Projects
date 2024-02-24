package com.objectclass;

public class Person {

	int pid;
	String pname;

	public void setData(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public void display() {
		System.out.println(" person id : " + pid);
		System.out.println(" person name :" + pname);
	}
}
/*
 * variables in setdata fuctions are local variables variables declare in class
 * are instance variable if local and instance variables are same compiler did
 * not get that which is local and which is instance and whom to apply what
 * values So we apply this keyword to instance variable so now values of local
 * variables get assign to instance variables
 */
