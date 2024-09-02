package Arraylist3;
import java.util.ArrayList;
import java.util.Collections;


/*
 * Now do descending sort of Employee.id in Employee arraylist using < , > & == 
 * technique.
 */
public class Sort2 {

	public static void main(String[] args) {

		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee(101,"Supriya",105000));
		elist.add(new Employee(101,"pradnya",25000));
		elist.add(new Employee(101,"Amruta",1000));
		elist.add(new Employee(105,"komal",55000));
		elist.add(new Employee(102,"pooja",13000));
		elist.add(new Employee(106,"priyanka",12000));
		for(Employee e:elist) {
			System.out.println(e);

		}
		System.out.println("-------------------------------------------");
		Collections.sort(elist,new EmployeeIdComparator());
		for(Employee e:elist) {
			System.out.println(e);
			System.out.println("-------------------------------------------");
	}

	}}
