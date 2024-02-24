package com.constructor;

public class Studenttest {

	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student(1,"priya",200);
		System.out.println(s2);			//// it calls method from object class
		System.out.println(s2.toString());	// it calls method from object class
			// we can see object class by ctrl+shift+t and mthen methods 
				// from it by ctrl+shift+o
		
	}

}
