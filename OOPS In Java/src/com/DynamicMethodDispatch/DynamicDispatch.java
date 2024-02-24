package com.DynamicMethodDispatch;
class Bank 
{
	int rate=7;
	void display()
	{
		
		System.out.println("rate of interest : "+rate+"%");
	}
}
class SBIbank extends Bank
{

	int rate=8;
	void display()
	{
		System.out.println("rate of interest : "+rate+"%");
	}
	void show()
	{
		System.out.println("hii");
	}
}
class HDFCbank extends Bank
{
	void display()
	{
		int rate=9;
		System.out.println("rate of interest : "+rate+"%");
	}
}
public class DynamicDispatch {

	public static void main(String[] args) {

		Bank b;
		b=new SBIbank();
		b.display();
	//	b.show();	// only for overriden method
		b=new HDFCbank();
		b.display();
		b=new Bank();
		b.display();
	}

}
