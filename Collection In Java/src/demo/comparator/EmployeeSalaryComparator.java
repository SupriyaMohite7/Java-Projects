package demo.comparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {

		if(e1.getSalary()==e2.getSalary())
			return 0;
		else if(e1.getSalary()<e2.getSalary())
			return -1;
		else
			return 1;
	}

}
