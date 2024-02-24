/*
1
1 1
1 1 1
1 1 1 1
*/
package com.demo.pattern;

public class P1A {

	public static void Print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Print(4);
		
	}

}
