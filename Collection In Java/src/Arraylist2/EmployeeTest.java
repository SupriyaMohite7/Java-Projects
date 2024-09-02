/*
 * 1.	WAP to create Emp (id,name,sal) object and add 2objects to ArrayList.
 
 * Sysout and see both variable memory space is printed. This is because toString 
 * is not overriden but if you would have done this for Integer then beautiful output 
 * would have been printed.
2.	Now override toString for earlier assignment and now sysout and see values are 
printed

 */
package Arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"Shweta",5000.0));
		emp.add(new Employee(102,"Kanchan",7000.0));
		emp.add(new Employee(103,"Riya",10000.0));
		emp.add(new Employee(104,"Priyanka",15000.0));
		emp.add(new Employee(105,"Snehal",3000.0));
		emp.add(new Employee(106,"Sachin",7000.0));

		for(Employee e:emp)
		{
			System.out.println(e);
			
		}
		System.out.println("==================================================");

/*
 * 3.	WAP to print Emp whose salary is > 10000
 */
		for(Employee e:emp)
		{
			if(e.getSal()>10000)
			{
			System.out.println(e);
			}
		}
		
		System.out.println("==================================================");
/*
 * 4.	WAP to print Emp who have name "Sachin"
 */
		
		boolean isAvailable = false;
		for(Employee e:emp)
		{
			if(e.getName().equals("Sachin"))
			{
				isAvailable=true;
				System.out.println("Sachin is Employee with Id : "+e.id);

			}
		
		}
		if(isAvailable)
		{				
			
		}
		else
		{
			System.out.println("No Employee Available whose name is Sachin");

		}
		System.out.println("==================================================");

/*
 * 5.	WAP to print Emp who have highest number of salary
 */
		double max=emp.get(0).getSal();
		for(int i=0;i<emp.size();i++)
		{
			if(emp.get(i).getSal()>max)
			{
				max=emp.get(i).getSal();
			}
		}
		System.out.println(max);
	for(Employee e:emp)
	{
		if(e.getSal()==max)
		{
			System.out.println(e);
		}
	}
	System.out.println("==================================================");
	
	}

}
