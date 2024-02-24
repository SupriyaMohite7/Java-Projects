package com.covarientdemo;

class person {
	int id;
	String name;

	public person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	person show() {
		name = name + "india";
		return this;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}

}

class employee extends person {
	float salary;

	public employee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	employee show() {
		name = name + "done";
		salary = salary + 1000;
		return this;
	}

	@Override
	public String toString() {
		return "employee [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}

}

public class CovarientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p;
		employee e;
		person p1 = new person(1, "priya");
		p = p1.show();
		System.out.println(p);
		System.out.println(p.id + " " + p.name);

		employee e1 = new employee(2, "supriya", 50000);
		e = e1.show();
		System.out.println(e);
		System.out.println(e.id + " " + e.name + " " + e.salary);
	}

}
