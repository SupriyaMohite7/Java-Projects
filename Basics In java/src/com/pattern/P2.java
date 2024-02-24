package com.pattern;

public class P2 {

	public static void PrintP2(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		PrintP2(4);
	}

}
