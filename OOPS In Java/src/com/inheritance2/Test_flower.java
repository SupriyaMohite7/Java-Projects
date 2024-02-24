package com.inheritance2;

class Flower
{
	void m1()
	{
		System.out.println("void m1 : flower");
	}
	static void m2()
	{
		System.out.println("static void m2");
	}
	void m4()
	{
		System.out.println("void m4");
	}
}
class rose extends Flower
{
	void m1()
	{
		System.out.println("void m1 : rose");
	}
	void m3()
	{
		System.out.println("void m3");
	}
}
public class Test_flower {

	public static void main(String[] args) {

		Flower f;
		f=new Flower();
		f.m1();
		f.m4();
		f.m2();
		f=new rose();
		f.m1();
		f.m4();
		
		rose r=new rose();
		r.m1();
		
		r.m3();
		r.m4();
	}



}
