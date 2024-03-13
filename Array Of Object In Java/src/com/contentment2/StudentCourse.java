package com.contentment2;

import java.util.Scanner;

public class StudentCourse {
	static Scanner sc=new Scanner(System.in);
	static void enterData(Student s)
	{
		
			System.out.println("Enter Id :");
			s.setId(sc.nextInt());
			System.out.println("Enter Name :");
			s.setName(sc.next());
			System.out.println("Enter Marks of 3 subjects :");
			double marks[]=new double[3];
			for(int m=0;m<marks.length;m++)
			{
				System.out.println("enter subject"+(m+1)+"marks :");
				marks[m]=sc.nextDouble();
			}
			s.setMarks(marks);
			
			// method 1
			Course c=new Course();
			 System.out.println("Enter course id :");
			 c.setCid(sc.nextInt());
			 System.out.println("Enter course name :");
		 c.setCname(sc.next());
		 s.setCourse(c);
			 
			 //method 2
//			 s.setCourse(new Course());
//			 
//			 System.out.println("Enter course id :");
//			s.getCourse().setCid(sc.nextInt());
//			 System.out.println("Enter course name :");
//			 s.getCourse().setCname(sc.next());
		
	}

	public static void main(String[] args) {
		
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			enterData(s[i]);
		}
		for(Student x:s)
		{
			System.out.println(x);
		}
	}

}
