package Arraylist3;


import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getId()==e2.getId())
		{
			if(e1.getSalary()>e2.getSalary())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		else if(e1.getId()>e2.getId())
			return -1;
		else
			return 1;
		
		
		// OR
		// return e1.getId-e2.getId;
	}

}
