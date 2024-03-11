package com.vararg;

public class VaragOverLoading {

	static void show(int ...a)
	{
		System.out.println("Integer");
		for(int x:a)
		{
			System.out.println(x);
		}
	}
	static void show(double ...a)
	{
		System.out.println("Double");
		for(double x:a)
		{
			System.out.println(x);
		}
	}
	static void show(String ...a)
	{
		System.out.println("String");
		for(String x:a)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {

		show(1,2);
		show(1.2,2.3);
		show('a','d'); // As Integer is parent of String it get converted to integer
	}

}
