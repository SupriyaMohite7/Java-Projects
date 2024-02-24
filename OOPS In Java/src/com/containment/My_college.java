package com.containment;

public class My_college {

	public static void main(String[] args) {
// Values Directly pass to object
		Student s1 = new Student(1, "Ram", new Course(101, "java", 40000));
		System.out.println(s1);
		 System.out.println("Hashcode of s1"+s1.getCourse().hashCode());
// values assign to object using setter
		Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("Priya");
		s2.setCourse(new Course(102, "Java", 45000));
		System.out.println(s2);
		System.out.println();
		System.out.println("Hashcode of s2"+s2.getCourse().hashCode());
//values assign to student object through reference variable as a object of course		
		Course c1=new Course(103,".net",30000);
		Course c2=new Course(104,"python",50000);
		
		Student s3=new Student(3,"Ramesh",c1);
		Student s4=new Student(4,"Ramesh",c2);
		Student s5=new Student(5,"Suresh",c1);
		System.out.println(s3);
		 System.out.println("Hashcode of s3"+s1.getCourse().hashCode());
		System.out.println(s4);
		 System.out.println("Hashcode of s4"+s1.getCourse().hashCode());
// change value
		 c1.setFees(10000);
		 System.out.println(s3);
		 System.out.println(s5);
// both are using same c1 so same hashcode
			System.out.println("Hashcode of s3 : "+s3.getCourse().hashCode());

			System.out.println("Hashcode of s5 : "+s5.getCourse().hashCode());


	}

}
