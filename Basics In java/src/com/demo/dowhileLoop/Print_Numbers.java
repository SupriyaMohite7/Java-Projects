package com.demo.dowhileLoop;

public class Print_Numbers {

	public static void show(int n)
	{
		int a=11;
		do
		{
			System.out.println(a);
			a++;
		}while(a<=n);
	}
	public static void main(String[] args) {

		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		show(20);
	}

	
}
