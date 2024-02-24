package com.objectclass;

public class Bank {

	private int acc_no;
	private String name;
	private double bal;

	public void setData(int acc_no, String name, double bal) {
		this.acc_no = acc_no;
		this.name = name;
		this.bal = bal;
	}

	public void display() {
		System.out.println("Account no :" + acc_no);
		System.out.println("Name :" + name);
		System.out.println("Balence :" + bal);
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public String get_name() {
		return name;
	}

	public void set_bal(double bal)

	{
		this.bal = bal;
	}

	public double get_bal() {
		return bal;
	}
}
/*
 * syntax:
 * setter 
 * 			public void setmethodname(datatype variable)
			{
				this.variable=variable;
			}
	getter		
			public datatype getmethodname()
			{
				return variable;
			}
*/