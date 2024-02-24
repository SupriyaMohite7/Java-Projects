package com.demo.pattern;

public class P1 {

	public static void PrintP1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		PrintP1(5);
	}

}
