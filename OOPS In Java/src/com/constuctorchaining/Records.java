package com.constuctorchaining;

class Student {
	int id;
	String name;

	Student() {
		// this(101); 			//recursion will happen
		this(101, "priya"); 	// constructor chaining using this keyword
								// it should be at the start of code
		System.out.println("Default constructor");
	}

	Student(int id) {
		// this(); 				//recursion will happen
		System.out.println("para constuctor...1");
		this.id = id;

	}

	Student(int id, String name) {

		System.out.println("para constuctor");
		this.id = id;
		this.name = name;
	}
}

public class Records {

	public static void main(String[] args) {

		Student s1 = new Student();
	}

}
