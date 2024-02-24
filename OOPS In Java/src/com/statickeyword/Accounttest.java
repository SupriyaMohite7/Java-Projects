package com.statickeyword;

import java.util.Scanner;

public class Accounttest {

	static Scanner sc=new Scanner(System.in);
	private int acc_no; 
	private String name; 
	private float amount; 
	Accounttest()
	{
		
	}
	Accounttest(int acc_no,String name,float amount)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	public void setAcc_no(int acc_no)
	{
		this.acc_no=acc_no;
	}
	public int getAcc_no()
	{
		return acc_no;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAmount(float amount)
	{
		this.amount=amount;
	}
	public float getAmount()
	{
		return amount;
	}
	public void insert()
	{
		System.out.println("Enter Account no. : ");
		acc_no=sc.nextInt();
		System.out.println("Enter Account username. : ");
		name=sc.next();
		System.out.println("Enter Amount : ");
		amount=sc.nextFloat();
	}
	public void deposit()
	{
		System.out.println("Enter Amount you want to deposit :");
		int deposit=sc.nextInt();
	}
	public void withdraw()
	{
		System.out.println("Enter Amount you want to withdraw :");		
	}
}
