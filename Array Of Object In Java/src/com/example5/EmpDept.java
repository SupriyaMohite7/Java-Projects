/*
 * /*
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

import java.util.Arrays;
import java.util.Scanner;

import com.basic.Student;

public class EmpDept {
	
	static Scanner sc=new Scanner(System.in);
	static void user(Employee emp)
	{
		System.out.println("Enter Employee Id :");
		emp.setEid(sc.nextInt());
		System.out.println("Enter Empoyee name :");
		emp.setEname(sc.next());
		System.out.println("Enter Employee salary :");
		emp.setSalary(sc.nextDouble());
		Department d=new Department();
		System.out.println("Enter department Id");
		d.setDid(sc.nextInt());
		System.out.println("Enter department name");
		d.setDname(sc.next());
		System.out.println("Enter location");
		d.setLocation(sc.next());
		emp.setDept(d);
	}
	

//			
	 static void sort(Employee[] emp) {

		 Employee temp =new Employee();
		 for(int i=0;i<emp.length;i++)
		 {
			 for(int j=i+1;j<emp.length;j++) {
				 if(emp[i].getSalary()<emp[j].getSalary())
				 {
					 temp=emp[i];
					 emp[i]=emp[j];
					 emp[j]=temp;
				 }
			 }
		 }
	}
	public static void main(String[] args) {
		Employee emp[] = new Employee[5];
		emp[0] = new Employee(1, "ABC", 10000, new Department(101, "HR", "Pune"));
		
		Department d=new Department();
		d.setDid(102);
		d.setDname("Testing");
		d.setLocation("Mumbai");
		
		emp[1] = new Employee(2,"DEF",20000,d);
		
		for(int i=2;i<emp.length;i++)
		{
			emp[i]=new Employee();
			user(emp[i]);
		}
		
		for(Employee x:emp)
		{
			System.out.println(x);
		}
		System.out.println("==========================================================");

		
		

		sort(emp);
		System.out.println("After Sorting ");
		for(Employee x:emp)
		{
			System.out.println(x);
		}
		System.out.println("==========================================================");
		sort(emp);
		System.out.println(emp[0]);
		
		
	}

	

	

}
