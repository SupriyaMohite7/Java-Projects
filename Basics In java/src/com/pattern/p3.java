package com.pattern;

public class p3 {

	public static void show(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int k=row;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		show(4);
	}

}
