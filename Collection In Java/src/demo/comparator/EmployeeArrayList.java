package demo.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {

		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee(101,"Supriya",105000));
		elist.add(new Employee(104,"pradnya",25000));
		elist.add(new Employee(103,"Amruta",1000));
		elist.add(new Employee(105,"komal",55000));
		elist.add(new Employee(102,"pooja",13000));
		elist.add(new Employee(106,"priyanka",12000));
		for(Employee e:elist) {
			System.out.println(e);

		}
		System.out.println("-------------------------------------------");
		System.out.println("-----ID------");

		Collections.sort(elist,new EmployeeIdComparator());
		for(Employee e1:elist) {
			System.out.println(e1);}
			System.out.println("-------------------------------------------");
			System.out.println("-----NAME------");

			Collections.sort(elist,new EmployeeNameComparator());
			for(Employee e1:elist) {
				System.out.println(e1);}
			System.out.println("-------------------------------------------");
			System.out.println("-----SALARY------");

			Collections.sort(elist,new EmployeeSalaryComparator());

			for(Employee e2:elist) {
				System.out.println(e2);}
			System.out.println("-------------------------------------------");
		}
	}


