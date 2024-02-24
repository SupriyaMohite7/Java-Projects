package com.demo.methoddemo;

import java.util.Scanner;

public class MethodVoid {

	public static void display()
	{
		System.out.println("without return type");
	}
	public static void add(int a,int b)
	{
		
		int sum=a+b;
		System.out.println("sum : "+sum);
	}
	public static void show(String msg)
	{
		System.out.println(msg);
	}
	public static void userInput(String name)
	{
		System.out.println("username is : "+name);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			display();
			add(4,50);
			show("welcome");
			System.out.println("enter name : ");
			String name=sc.next();
			userInput(name);
	}

}
