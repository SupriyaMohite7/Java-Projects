package com.methodoverriding;

public class TypePromotion {

	static void display(char n)
	{
		System.out.println("in char");
		System.out.println(n);
	}
	static void display(long n)
	{
		System.out.println("in long");
		System.out.println(n);
	}	
	static void display(int n,long l)
	{
		System.out.println("in method");
		System.out.println(n+" "+l);
	}
	static void display(int n,float l)
	{
		System.out.println("in method 2");
		System.out.println(n+" " +l);
	}
	public static void main(String[] args) {

		display(8);
		display('a');
		display(1,6.5f);
		display(1,7l);
	}

}
