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

public class Department {

	private int did;
	private String dname;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [dept id=" + did + ", dept name=" + dname + "]";
	}
	
}
