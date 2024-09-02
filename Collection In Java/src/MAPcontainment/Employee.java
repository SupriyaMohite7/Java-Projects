/*
 * 
Task1:
Create an arraylist of Employee having id,name,salary and containment 
of Department . 
From that arraylist 
  >create a Map having Department as key and number of employee as value
 > Create a Map having Department as key and arraylist of employees as
  value

 */
package MAPcontainment;

public class Employee {

	 private int id;
	 private String name;
	 private int salary;
	 private Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
