package customArraylist;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student(1,"Komal",90.0));
		s.add(new Student(2,"Komal",80.0));
		s.add(new Student(3,"pradnya",70.0));
		s.add(new Student(4,"Amruta",60.0));
		s.add(new Student(5,"supriya",95.0));
		
		System.out.println(s);
		
		System.out.println("----------------------------------------");
		for(Student stud:s)
		{
			System.out.println(stud);
		}
		System.out.println("----------------------------------------");

	}

}
