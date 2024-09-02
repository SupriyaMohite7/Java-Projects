package Set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSetDemo {

	public static void main(String[] args) {

		HashSet<Employee> emp = new HashSet<>();
		emp.add(new Employee(1, "Ramesh", 10000));
		emp.add(new Employee(2, "Suresh", 20000));
		emp.add(new Employee(3, "Ganesh", 30000));
		emp.add(new Employee(4, "Jayesh", 40000));
		emp.add(new Employee(5, "Dnyanesh", 15000));
		emp.add(new Employee(2, "Suresh", 20000));
		emp.add(new Employee(3, "Ganesh", 30000));
		
		Iterator itr=emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
