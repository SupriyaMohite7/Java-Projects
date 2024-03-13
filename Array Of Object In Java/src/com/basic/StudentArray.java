package com.basic;

import java.util.Scanner;

public class StudentArray {
	static Scanner sc=new Scanner(System.in);
	static void enterData(Student[] st2)
	{

		for(int i=0;i<st2.length;i++)
		{
			st2[i]=new Student();
			
			System.out.println("Enter Student Id :");
			st2[i].setId(sc.nextInt());
			
			System.out.println("Enter Student Name:");
			st2[i].setName(sc.next());
			
			System.out.println("Enter Student Marks :");
			st2[i].setMarks(sc.nextFloat());
		}
	}
	static void display(Student[] stud)
	{
		for(Student s:stud)
		{
			System.out.println(s);
		}
	}
	static void sortMarks(Student[] st)
	{
		Student stemp=new Student();
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].getMarks()<st[j].getMarks()) {
					stemp=st[i];
					st[i]=st[j];
					st[j]=stemp;	
				}
				
			}
		}
	}

	public static void main(String[] args) {

		Student st[]=new Student[5];
		
		// System.out.println(st[1].getName()); Null Pointer Exception
		
		//st[0]=new Student();
		//System.out.println(st[0].getName());  Null value
		System.out.println("Using Constructor");
		st[0]=new Student(1,"A",80);
		st[1]=new Student(2,"B",70);
		st[2]=new Student(3,"C",30);
		st[3]=new Student(4,"D",90);
		st[4]=new Student(5,"E",20);
		
		
		display(st);
		System.out.println("-----------------------------------------");
		sortMarks(st);
		display(st);
		System.out.println("-----------------------------------------");
		System.out.println("direct values pass to each student");
		Student st1[]=new Student[3];
		
		st1[0]=new Student();
		st1[1]=new Student();
		st1[2]=new Student();
		
		st1[0].setId(1);
		st1[0].setName("F");
		st1[0].setMarks(85);
		
		st1[1].setId(2);
		st1[1].setName("G");
		st1[1].setMarks(81);
		
		st1[2].setId(3);
		st1[2].setName("H");
		st1[2].setMarks(83);
		
		display(st1);
		System.out.println("-----------------------------------------");
		System.out.println("Taking value from user");
		
		Student st2[]=new Student[4];
		enterData(st2);
		System.out.println("-----------------------------------------");
		display(st2);
	}

}
