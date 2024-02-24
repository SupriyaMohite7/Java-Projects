//Task for the day .
/*1>Write a Java program to create Employee class with following details 
data members  : id,ename,basicsal ,pf,hra,da  ,netsal ,deptno
default and parametric constructors
methods : displayEmp().calculateSal() 
Note : pf is 10% basicsal,hra is 15% of basicsal ,da is 20% of basicsal 
netsal=basicsal-pf+da+hra*/

package com.constructor2;

class Employee_info {
	private int id, deptno;
	private String ename;
	private float basicsal;
	double netsal;
	double pf,hra,da;

	Employee_info() {

		System.out.println("******Employee Details********** ");
	}

	Employee_info(int id, int deptno, String ename,float basicsal) {

		this.id=id;
		this.deptno=deptno;
		this.ename=ename;
		this.basicsal=basicsal;
	}
	void calculateSal()
	{
		pf=0.1*basicsal;
		hra=0.15*basicsal;
		da=0.20*basicsal;
		netsal=basicsal-pf+da+hra;
		
	}
	void displayEmp()
	{
		System.out.println(" Id : " +id+
				"\n Department no : "+deptno+
				"\n Employee Name : "+ename+
				"\n Basic Salary : "+basicsal+
				"\n pf : "+pf+
				"\n hra : "+hra+
				"\n da : "+da+
				"\n NetSalary :"+netsal+
				"\n--------------------------------");
	}
}

public class Employee {

	public static void main(String[] args) {

		Employee_info e1=new Employee_info();
		Employee_info e2=new Employee_info(101,123,"priya",50000);
		Employee_info e3=new Employee_info(102,123,"ravi",100000);
		e2.calculateSal();
		e3.calculateSal();
		e2.displayEmp();
		e3.displayEmp();
	}

}
