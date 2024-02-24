package com.Interface;
interface A1
{
	default void display()
	{
		System.out.println("A");
	}
}
interface B1
{

	default void display()
	{
		System.out.println("B");
	}
}
public class DiamandRevision implements A1,B1 {
	public void display()
	{
		A1.super.display();
		B1.super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamandRevision d= new DiamandRevision();
		d.display();
	}

}
