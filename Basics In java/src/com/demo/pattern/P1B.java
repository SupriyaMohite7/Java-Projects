/*
####
###
##
#
 */
package com.demo.pattern;

public class P1B {

	public static void Print(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Print(4);
	}
}
