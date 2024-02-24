/*
 * Task3>>
Create an interface to pay any amount . It can be used by employee or 
celebrity to pay the tax a
and by a student to pay the fees
Use the concept of functional interface here
 */
package com.Interface;
@FunctionalInterface // only one method allowed in interface
interface payable
{
	void pay(int amount);
	default void show() { // 
		
	}
default void show1() {
		
	}
//	void show();
}
class Employee implements payable
{

	@Override
	public void pay(int amount) {
	System.out.println(" Tax to pay for employee : "+amount);
	}
	
}
class Celebrity implements payable
{

	@Override
	public void pay(int amount) {
		System.out.println(" Tax to pay for celebrity : "+amount);
	}
	
}
class Student1 implements payable
{

	@Override
	public void pay(int amount) {
		System.out.println(" fees to pay for student : "+amount);
	}
	
}
public class Taxdemo {

	public static void main(String[] args) {

		payable p;
		p=new Employee();
		p.pay(1000);
		p=new Celebrity();
		p.pay(2000);
		p=new Student1();
		p.pay(3000);
	}

}
