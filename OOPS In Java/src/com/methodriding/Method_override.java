package com.methodriding;
class person
{
	String name;
	void display(String name)
	{
		System.out.println("i am person : "+name);
	}
	void show()
	{
		System.out.println("i am person show method: ");
	}
}
class employee extends person
{

	String name;
	@Override
	void display(String name)
	{
		System.out.println("i am emplyee : "+name);
	}
//	void show()
//	{
//		System.out.println("i am emplyee show method: ");
//	}
}
class trainee extends person
{

	String name;
	@Override
	void display(String name)
	{
		super.display(name);
		// by super word we can call it from base class
		System.out.println("i am trainee : "+name);
	}
}
public class Method_override {

	public static void main(String[] args) {

		person p=new person();
		p.display("ABC");
		employee e=new employee();
		e.display("EMP");
		e.show(); // it calls method from base class as we comment show from employee class
		trainee t= new trainee();
		t.display("TR");
	}

}
