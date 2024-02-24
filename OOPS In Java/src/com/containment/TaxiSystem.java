package com.containment;

import java.util.Scanner;

public class TaxiSystem {
	Scanner sc=new Scanner(System.in);

	static Car c2;
	static Driver d2;
	TaxiSystem()
	{
		
	}
	
	public void enterDetails(Car c2,Driver d2)
	{
		System.out.println("Enter Model");
		c2.setModel(sc.nextInt());
		System.out.println("Enter Brand");
		c2.setBrand(sc.next());
		System.out.println("Enter Name");
		c2.setBrand(sc.next());
		c2.setDriver(d2);
		System.out.println("Enter Driver Id");
		c2.getDriver().setDriverId(sc.nextInt());
//		c2.setDriverId(sc.nextInt());
		System.out.println("Enter Name");
		c2.getDriver().setName(sc.next());
		System.out.println("Enter Adhar no");
		c2.getDriver().setAdharNo(sc.nextInt());
		System.out.println("Enter Salary");
		c2.getDriver().setSalary(sc.nextInt());
	
	}
	public static void main(String[] args) {


		// Create an anoymous driver which is been alloted to a car for just one day
		Car c = new Car(101, "BMW", "B_M_W", new Driver(1, "huy", 1234, 1000));
		System.out.println(c);

//				Create 3 car having a driver each (taking user input)
		Car c1 = new Car();
		c1.setModel(102);
		c1.setBrand("Toyoto");
		c1.setName("Avalon");
		c1.setDriver(new Driver(2, "abc", 4567, 2000));
		System.out.println(c1);
		Scanner sc=new Scanner(System.in);
		
		// by method
		Car c2 = new Car();
		Driver d2=new Driver();
		TaxiSystem t=new TaxiSystem();
		t.enterDetails(c2, d2);
		
System.out.println(c2);
			}

}
