/*
@ @ @ @
@ @ @ @
@ @ @ @
@ @ @ @

 */
package com.demo.pattern;

public class P1C {

	public static void Print()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Print();
	}

}
