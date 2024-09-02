/*
 * /*
 * 1.	WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. 
 * Sysout and see both variable memory space is printed. This is because toString 
 * is not overriden but if you would have done this for Integer then beautiful output 
 * would have been printed.
2.	Now override toString for earlier assignment and now sysout and see values are 
printed

 */
 
package Arraylist2;

public class Employee {
	int id;
	String name;
	double sal;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.sal = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}


}
