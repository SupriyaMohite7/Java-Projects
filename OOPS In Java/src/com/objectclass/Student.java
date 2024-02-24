package com.objectclass;

class stud {
	int id;
	String name;
	double salary;

	void show() {
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		System.out.println("salary : " + salary);
		System.out.println("---------------");
	}

	void set() {
		id = 1;
		name = "priya";
		salary = 45000;
	}
}

public class Student {

	public static void main(String[] args) {
		stud s1 = new stud();
		stud s2 = new stud();
		s1.show();
		s2.set();
		s2.show();
	}

}
