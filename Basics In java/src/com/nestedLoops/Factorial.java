package com.demo.nestedLoops;

public class Factorial {

	public static void PrintFact(int n)
	{
		int Fact = 1;
		for(int i=1;i<=n;i++)
		{
			Fact=1;
			for(int j=1;j<=i;j++)
			{
				Fact=Fact*j;
			}
			System.out.println(i+"! =  "+Fact);
		}
	}
	public static void main(String[] args) {

		PrintFact(10);
	}

}
