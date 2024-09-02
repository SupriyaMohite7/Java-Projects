/*
 * 
Task1:
Create an arraylist of Employee having id,name,salary and containment 
of Department . 
From that arraylist 
  >create a Map having Department as key and number of employee as value
 > Create a Map having Department as key and arraylist of employees as
  value

 */
package MAPcontainment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmpDeptMap {

	static void mapdemo(ArrayList<Employee> em)
	{
		HashMap<Integer,ArrayList<Employee>> hm = new HashMap<Integer,ArrayList<Employee>>();
		ArrayList<Employee> list;
		for(Employee e:em)
		{
			if(hm.containsKey(e.getDept().getDid()))
			{
				list=hm.get(e.getDept().getDid());
				list.add(e);
				hm.put(e.getDept().getDid(), list);
			}
			else
			{
				list=new ArrayList<Employee>();
				list.add(e);
				hm.put(e.getDept().getDid(), list);
			}
		}

		for(Map.Entry<Integer, ArrayList<Employee>> e : hm.entrySet())
		{
			int count=0;

			for(Employee s:e.getValue())
			{
				System.out.println(s.getId()+" "+s.getName()+" "+s.getSalary());
				count++;
			}
			System.out.println("Dept Id :"+e.getKey()+" =>  "+count+" Employees");

			System.out.println("There are "+count+" Employees.");
			System.out.println("-------------------------------------------");
		}
	}
	
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(1,"Priya",25000,new Department(101,"IT")));
		emp.add(new Employee(2,"Prajkta",10000,new Department(102,"HR")));
		emp.add(new Employee(3,"Pooja",30000,new Department(101,"IT")));
		emp.add(new Employee(4,"Priti",15000,new Department(101,"Account")));
		emp.add(new Employee(5,"Pratiksha",26000,new Department(102,"HR")));

		mapdemo(emp);
	}

}